/**
 * V3Port.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package V3;

public interface V3Port extends java.rmi.Remote {

    /**
     * Voeg een nieuwe gebruiker toe, of wijzig een bestaande gebruiker
     * <code>
     * $result = $client->saveUser('webserviceswachtwoord','98754284','jmorren','kxes9875','','','jonas','morren','','','m','01-12-1998','Genk','België','Kapelstraat
     * 61','3600','Genk','België','jonas.morren@gmail.com','0492123456','','','98.12.01-102-14','','leerling','695421');
     * </code>
     */
    public java.lang.Object saveUser(java.lang.String accesscode, java.lang.String internnumber, java.lang.String username, java.lang.String passwd1, java.lang.String passwd2, java.lang.String passwd3, java.lang.String name, java.lang.String surname, java.lang.String extranames, java.lang.String initials, java.lang.String sex, java.lang.String birthday, java.lang.String birthplace, java.lang.String birthcountry, java.lang.String address, java.lang.String postalcode, java.lang.String location, java.lang.String country, java.lang.String email, java.lang.String mobilephone, java.lang.String homephone, java.lang.String fax, java.lang.String prn, java.lang.String stamboeknummer, java.lang.String basisrol, java.lang.String untis) throws java.rmi.RemoteException;

    /**
     * Voeg een klas toe of wijzig een bestaande klas
     * <code>
     * $result = $client->saveClass('webserviceswachtwoord','6AB2','6AB2
     * is een opsplitsing van 6AB','6AB2','6AB','6AB2','098877','20644');
     * </code>
     */
    public java.lang.Object saveClass(java.lang.String accesscode, java.lang.String name, java.lang.String desc, java.lang.String code, java.lang.String parent, java.lang.String untis, java.lang.String instituteNumber, java.lang.String adminNumber, java.lang.String schoolYearDate) throws java.rmi.RemoteException;

    /**
     * Voeg een groep toe of wijzig een bestaande groep
     * <code>
     * $result = $client->saveGroup('webserviceswachtwoord','6AB2','6AB2
     * is een opsplitsing van 6AB','6AB2','6AB','6AB2');
     * </code>
     */
    public java.lang.Object saveGroup(java.lang.String accesscode, java.lang.String name, java.lang.String desc, java.lang.String code, java.lang.String parent, java.lang.String untis) throws java.rmi.RemoteException;

    /**
     * Voornaam, naam, gebruikersnaam en internnummer ophalen van
     * gebruikers in een bepaalde groep
     * <code>
     * $result = $client->getAllAccounts('webserviceswachtwoord','Beheerders','0');
     * </code>
     */
    public java.lang.Object getAllAccounts(java.lang.String accesscode, java.lang.String code, java.lang.String recursive) throws java.rmi.RemoteException;

    /**
     * Alle gegevens ophalen van de gebruikers in een bepaalde groep
     * (recursief indien gewenst)
     */
    public java.lang.Object getAllAccountsExtended(java.lang.String accesscode, java.lang.String code, java.lang.String recursive) throws java.rmi.RemoteException;

    /**
     * Vraag al de groepen en klassen van het smartschool platform
     * op
     * <code>
     * $result = $client->getAllGroupsAndClasses('webserviceswachtwoord');
     * </code>
     */
    public java.lang.Object getAllGroupsAndClasses(java.lang.String accesscode) throws java.rmi.RemoteException;

    /**
     * Voeg een vak toe
     * <code>
     * $result = $client->addCourse('webserviceswachtwoord', 'Geschiedenis
     * 6A1', 'Geschiedenis 6dejaars A1');
     * </code>
     */
    public java.lang.String addCourse(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc) throws java.rmi.RemoteException;

    /**
     * Voeg een vakleerkracht en co-leerkrachten toe aan een bepaald
     * vak
     * <code>
     * $result = $client->addCourseTeacher('webserviceswachtwoord','Geschiedenis
     * 6A1','Geschiedenis 6dejaars A1','ppeters','jmorren,gvanven');
     * </code>
     */
    public java.lang.Object addCourseTeacher(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc, java.lang.String internnummer, java.lang.String userlist) throws java.rmi.RemoteException;

    /**
     * Voeg bepaalde klassen toe aan een bepaald vak
     * <code>
     * $result = $client->addCourseStudents('webserviceswachtwoord','Geschiedenis
     * 6A1','Geschiedenis 6dejaars A1','6A1,6A2');
     * </code>
     */
    public java.lang.Object addCourseStudents(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc, java.lang.String groupIds) throws java.rmi.RemoteException;

    /**
     * Vraag alle vakken van het platform op
     * <code>
     * $result = $client->getCourses('webserviceswachtwoord');
     * </code>
     */
    public java.lang.String getCourses(java.lang.String accesscode) throws java.rmi.RemoteException;

    /**
     * Verwijder een specifieke gebruiker
     * <code>
     * $result = $client->delUser('webserviceswachtwoord','jmorren', '2012-08-31');
     * </code>
     */
    public java.lang.Object delUser(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String officialDate) throws java.rmi.RemoteException;

    /**
     * Bewaar een bepaalde parameter voor een bepaalde gebruiker
     * <code>
     * $result = $client->saveUserParameter('webserviceswachtwoord','ppeters','Code
     * schoolpasje','56987');
     * </code>
     */
    public java.lang.Object saveUserParameter(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String paramName, java.lang.String paramValue) throws java.rmi.RemoteException;

    /**
     * Vraag een lijst met alle klassen op
     * <code>
     * $result = $client->getClassList('webserviceswachtwoord');
     * </code>
     */
    public java.lang.String getClassList(java.lang.Object accesscode) throws java.rmi.RemoteException;

    /**
     * Vraag een lijst met alle klassen op
     * <code>
     * $result = $client->getClassList('webserviceswachtwoord');
     * </code>
     */
    public java.lang.String getClassListJson(java.lang.Object accesscode) throws java.rmi.RemoteException;

    /**
     * Update een lijst van klassen
     * <code>
     * $serializedArray = serialize(
     *                            array(
     *                                array('id' => '964','name' => '1Ab','desc'
     * => '1Ab', 'code' => '1Ab'),
     *                                array('id' => '965','name' => '2Ab','desc'
     * => '2Ab', 'code' => '21Ab')
     *                            )
     *                        );
     * $result = $client->saveClassList('webserviceswachtwoord',$serializedArray);
     * </code>
     */
    public java.lang.Object saveClassList(java.lang.String accesscode, java.lang.String serializedList) throws java.rmi.RemoteException;

    /**
     * Update een lijst van klassen
     * <code>
     * $jsonList = json_encode(
     * 						array(
     * 							array('id' => '964','name' => '1Ab','desc' => '1Ab', 'code'
     * => '1Ab'),
     * 							array('id' => '965','name' => '2Ab','desc' => '2Ab', 'code'
     * => '21Ab')
     * 						)
     * 					);
     * $result = $client->saveClassList('webserviceswachtwoord',$jsonList);
     * </code>
     */
    public java.lang.Object saveClassListJson(java.lang.String accesscode, java.lang.String jsonList) throws java.rmi.RemoteException;

    /**
     * Verwijder een bepaalde klas of groep
     * <code>
     * $result = $client->delClass('webserviceswachtwoord','6Ab');
     * </code>
     */
    public java.lang.Object delClass(java.lang.String accesscode, java.lang.String code) throws java.rmi.RemoteException;

    /**
     * Bepaal de groep en klas lidmaatschap van een bepaalde gebruiker
     * <code>
     * $result = $client->saveUserToClasses('webserviceswachtwoord','jmorren','1Ab,leerlingen');
     * </code>
     */
    public java.lang.Object saveUserToClasses(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String csvList) throws java.rmi.RemoteException;

    /**
     * Verwijder de gebruiker uit 1 specificieke groep of klas
     * <code>
     * $result = $client->removeUserFromGroup('webserviceswachtwoord','jmorren','1Ab');
     * </code>
     */
    public java.lang.Object removeUserFromGroup(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String _class, java.lang.String officialDate) throws java.rmi.RemoteException;

    /**
     * Verplaats de gebruiker naar 1 specificieke groep of klas
     * <code>
     * $result = $client->saveUserToClass('webserviceswachtwoord','jmorren','1Ab');
     * </code>
     */
    public java.lang.Object saveUserToClass(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String _class, java.lang.String officialDate) throws java.rmi.RemoteException;

    /**
     * Bepaal de groep en klas lidmaatschap van een bepaalde gebruiker
     * <code>
     * $result = $client->saveUserToClassesAndGroup('webserviceswachtwoord','jmorren','1Ab,leerlingen');
     * </code>
     */
    public java.lang.Object saveUserToClassesAndGroups(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String csvList, int keepOld) throws java.rmi.RemoteException;

    /**
     * Stel de status van een bepaalde accountin
     * <code>
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'enabled');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'actief');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'active');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'disabled');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'inactief');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'inactive');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'administrative');
     * $result = $client->setAccountStatus('webserviceswachtwoord', 'admin',
     * 'administratief');
     * </code>
     */
    public java.lang.Object setAccountStatus(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.Object accountStatus) throws java.rmi.RemoteException;

    /**
     * Stel de foto in voor een bepaalde account
     * <code>
     * $result = $client->setAccountPhoto('webserviceswachtwoord','admin',$base64encodedImageData);
     * </code>
     */
    public java.lang.Object setAccountPhoto(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String photo) throws java.rmi.RemoteException;

    /**
     * Vraag de foto op van een bepaalde account
     * <code>
     * $result = $client->getAccountPhoto('webserviceswachtwoord','admin');
     * </code>
     */
    public java.lang.String getAccountPhoto(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException;

    /**
     * Vervang de interne nummer van een bepaalde gebruiker
     * <code>
     * $result = $client->replaceInum('webserviceswachtwoord','09874','09875');
     * </code>
     */
    public java.lang.Object replaceInum(java.lang.String accesscode, java.lang.String oldInum, java.lang.String newInum) throws java.rmi.RemoteException;

    /**
     * Forceer dat een bepaalde hoofd- of co-account zijn/haar wachtwoord
     * moet wijzigen bij de volgende aanmelding
     * <code>
     * $result = $client->forcePasswordReset('webserviceswachtwoord','admin','0');
     * </code>
     */
    public java.lang.Object forcePasswordReset(java.lang.String accesscode, java.lang.String userIdentifier, int accountType) throws java.rmi.RemoteException;

    /**
     * Stel het wachtwoord in voor een bepaalde hoofd- of co-account
     * <code>
     * $result = $client->savePassword('webserviceswachtwoord','admin','bdes5987','0');
     * </code>
     */
    public java.lang.Object savePassword(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String password, int accountType) throws java.rmi.RemoteException;

    /**
     * Stuur een bericht naar een bepaalde gebruiker
     * <code>
     * $result = $client->sendMsg('webserviceswachtwoord','admin','Dit is
     * een test', '<p>Dit is de body van het testbericht (html-formaat)</p>');
     * </code>
     */
    public java.lang.Object sendMsg(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String title, java.lang.String body, java.lang.String senderIdentifier, java.lang.Object attachments, int coaccount) throws java.rmi.RemoteException;

    /**
     * Skore export. Geeft de koppeling tussen klassen, leerkrachten
     * en vakken weer.
     */
    public java.lang.Object getSkoreClassTeacherCourseRelation(java.lang.String accesscode) throws java.rmi.RemoteException;

    /**
     * Leerling uitschrijven. De officiele datum kan optioneel meegeleverd
     * worden.
     */
    public java.lang.Object unregisterStudent(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String officialDate) throws java.rmi.RemoteException;

    /**
     * Lijst van klastitularissen
     */
    public java.lang.Object getClassTeachers(java.lang.String accesscode, boolean getAllOwners) throws java.rmi.RemoteException;

    /**
     * Return all absents for a specific date
     */
    public java.lang.String getAbsentsByDate(java.lang.String accesscode, java.lang.String date) throws java.rmi.RemoteException;

    /**
     * Return all absents for a specific user for a specific schoolyear
     */
    public java.lang.String getAbsents(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String schoolYear) throws java.rmi.RemoteException;

    /**
     * Get the details of a specific user
     */
    public java.lang.String getUserDetails(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException;

    /**
     * Get the details of a specific user by number
     */
    public java.lang.String getUserDetailsByNumber(java.lang.String accesscode, java.lang.String number) throws java.rmi.RemoteException;

    /**
     * Get the details of a specific user by username
     */
    public java.lang.String getUserDetailsByUsername(java.lang.String accesscode, java.lang.String username) throws java.rmi.RemoteException;

    /**
     * Get official class of a user, optionally at a specific time
     * (yyyy-mm-dd)
     */
    public java.lang.String getUserOfficialClass(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String date) throws java.rmi.RemoteException;

    /**
     * Save the signature of a specific user identifier with the userIdentifier
     */
    public boolean saveSignature(java.lang.String accesscode, java.lang.String userIdentifier, int accountType, java.lang.String signature) throws java.rmi.RemoteException;

    /**
     * Geeft de volledige schoolloopbaan van de leerling terug in
     * JSON-formaat
     */
    public java.lang.String getStudentCareer(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException;

    /**
     * Deactiveer two factor authenticatie voor een gebruiker
     * <code>
     * $result = $client->deactivateTwoFactorAuthentication('webserviceswachtwoord','admin','0');
     * </code>
     */
    public java.lang.Object deactivateTwoFactorAuthentication(java.lang.String accesscode, java.lang.String userIdentifier, int accountType) throws java.rmi.RemoteException;

    /**
     * Get all the errorcode
     */
    public void returnErrorCodes() throws java.rmi.RemoteException;

    /**
     * Haal alle errorcodes in een csv lijst
     * <code>
     * $result = $client->returnCsvErrorCodes();
     * </code>
     */
    public java.lang.String returnCsvErrorCodes() throws java.rmi.RemoteException;

    /**
     * Haal alle errorcodes in json formaat
     * <code>
     * $result = $client->returnJsonErrorCodes();
     * </code>
     */
    public java.lang.String returnJsonErrorCodes() throws java.rmi.RemoteException;
}
