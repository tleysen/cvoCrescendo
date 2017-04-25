<?php

require_once 'config.php';

// HAAL ALLE PLATFORMEN OP UIT DE CONFIGURATIE
$selectablePlatforms = array_column($platformsConfig, 'platformUrl');

?>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Smartschool password resetter</title>
	<!-- TWITTER BOOTSTRAP CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
		  integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
		  crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
		  integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">
	<!-- JQUERY UI CSS -->
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
	<style type="text/css">
		.example {
			margin: 20px;
		}
	</style>
</head>
<body>
<div class="example">
	<form>
		<div class="form-group">
			<label for="platorm">Selecteer een platform</label>
			<!-- SELECTEER HET JUISTE PLATFORM -->
			<select id="platform" class="form-control">
				<?php
				foreach($selectablePlatforms as $selectablePlatform) {
					?>
					<option value="<?= $selectablePlatform ?>"><?= $selectablePlatform ?></option>
					<?php
				}
				?>
			</select>
		</div>
		<div class="form-group">
			<label for="username">Gebruikersnaam</label>
			<input type="text" class="form-control" id="username"
				   placeholder="Geef hier de gebruikersnaam van de gebruiker in">
		</div>
		<div class="form-group">
			<label for="accounttype">Type account</label>
			<select id="accounttype" class="form-control">
				<option value="0">Hoofd-account</option>
				<option value="1">Co-account 1</option>
				<option value="2">Co-account 2</option>
			</select>
		</div>
		<div class="form-group">
			<label for="password">Wachtwoord</label>
			<input type="text" class="form-control" id="password" placeholder="Geef hier het nieuwe wachtwoord in">
		</div>
		<button type="button" class="btn btn-primary" onClick="changePwd();">Wachtwoord wijzigen</button>
	</form>
</div>
</body>
<!-- JQUERY EN JQUERY UI JS -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
<!-- TWITTER BOOSTRAP JAVASCRIPT -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
		integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
		crossorigin="anonymous"></script>
<!-- EIGEN JAVASCRIPT -->
<script src="resetscript.js"></script>
<script>
function changePwd() {

	$.post('resetpwd.php', {
		'platform': $('#platform').val(),
		'username': $('#username').val(),
		'accounttype': $('#accounttype').val(),
		'password': $('#password').val()
	}, function (data) {
		alert(data);
		$('#username').val('');
		$('#password').val('');
		$('#accounttype').val('0');
	}).fail(function (data) {
		alert(data.responseText);
	});
};

function alert(text, func) {
	if (!document.getElementById('alertMsgDiv')) $(document.body).append('<div id="alertMsgDiv"></div>');
	$('#alertMsgDiv').html(text);

	var buttons = {};
	buttons['Ok'] = function () {
		$(this).dialog('destroy').empty()
		if (func !== undefined) {
			func();
		}
	};

	$('#alertMsgDiv').dialog({
		bgiframe: true,
		modal: true,
		title: 'Melding',
		width: 300,
		resizable: false,
		buttons: buttons
	});
	$('#alertMsgDiv').dialog('open');
	$('.ui-dialog-titlebar-close').hide();
};
</script>
</html>
