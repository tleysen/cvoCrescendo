<?php

require_once 'config.php';

// HAAL ALLE POST VARIABELEN OP
$platform    = $_POST['platform'];
$username    = $_POST['username'];
$accounttype = (int)$_POST['accounttype'];
$password    = $_POST['password'];

try {
	// BEPAAL HET WEBSERVICES WACHTWOORD VAN HET GESELECTEERD PLATFORM
	$webservicesPwd = false;
	foreach($platformsConfig as $platformConfig) {
		if($platformConfig['platformUrl'] == $platform) {
			$webservicesPwd = $platformConfig['webservicePwd'];
			break;
		}
	}
	// PLATFORM NIET GEVONDEN IN CONFIG (KAN NORMAAL NIET) --> FOUTMELDING
	if($webservicesPwd === false) {
		throw new Exception('Platform niet gekend in de configuratie');
	}

	// INITIALISEER DE SOAP CLIENT VOOR HET SPECIFIEKE PLATFORM
	libxml_disable_entity_loader(false);
	$soap = new SoapClient('https://cvo-crescendo-slo.smartschool.be/Webservices/V3?wsdl', ['cache_wsdl' => WSDL_CACHE_NONE]);

	// EFFECTIEVE WEBSERVICE CALL
	// VERANDER HET WACHTWOORD VOOR DE GEBRUIKER
	$result = $soap->savePassword($webservicesPwd, $username, $password, $accounttype);

	// INDIEN RESULTAAT NIET CORRECT
	if($result !== 0) {

		// HAAL ALLE FOUTCODES EN HUN OMSCHRIJVINGEN OP
		$errorCodes = $soap->returnJsonErrorCodes();
		$errorCodes = json_decode($errorCodes);

		// OMSCHRIJVING VOOR DEZE FOUTCODE
		$errorMessage = $errorCodes->{$result};

		// FOUTMELDING
		throw new \Exception($errorMessage);
	}

	// RESULTAAT IS CORRECT: MELDING TONEN
	echo "Het wachtwoord is correct geüpdatet!";
} catch(\Exception $e) {

	//AFHANDELING FOUTMELDINGEN
	header("HTTP/1.0 400 Error");
	echo $e->getMessage();
}
