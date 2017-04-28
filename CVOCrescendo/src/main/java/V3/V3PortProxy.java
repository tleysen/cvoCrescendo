package V3;

public class V3PortProxy implements V3Port {
  private String _endpoint = null;
  private V3Port v3Port = null;
  
  public V3PortProxy() {
    _initV3PortProxy();
  }
  
  public V3PortProxy(String endpoint) {
    _endpoint = endpoint;
    _initV3PortProxy();
  }
  
  private void _initV3PortProxy() {
    try {
      v3Port = (new V3ServiceLocator()).getV3Port();
      if (v3Port != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)v3Port)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)v3Port)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (v3Port != null)
      ((javax.xml.rpc.Stub)v3Port)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public V3Port getV3Port() {
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port;
  }
  
  public java.lang.Object saveUser(java.lang.String accesscode, java.lang.String internnumber, java.lang.String username, java.lang.String passwd1, java.lang.String passwd2, java.lang.String passwd3, java.lang.String name, java.lang.String surname, java.lang.String extranames, java.lang.String initials, java.lang.String sex, java.lang.String birthday, java.lang.String birthplace, java.lang.String birthcountry, java.lang.String address, java.lang.String postalcode, java.lang.String location, java.lang.String country, java.lang.String email, java.lang.String mobilephone, java.lang.String homephone, java.lang.String fax, java.lang.String prn, java.lang.String stamboeknummer, java.lang.String basisrol, java.lang.String untis) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveUser(accesscode, internnumber, username, passwd1, passwd2, passwd3, name, surname, extranames, initials, sex, birthday, birthplace, birthcountry, address, postalcode, location, country, email, mobilephone, homephone, fax, prn, stamboeknummer, basisrol, untis);
  }
  
  public java.lang.Object saveClass(java.lang.String accesscode, java.lang.String name, java.lang.String desc, java.lang.String code, java.lang.String parent, java.lang.String untis, java.lang.String instituteNumber, java.lang.String adminNumber, java.lang.String schoolYearDate) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveClass(accesscode, name, desc, code, parent, untis, instituteNumber, adminNumber, schoolYearDate);
  }
  
  public java.lang.Object saveGroup(java.lang.String accesscode, java.lang.String name, java.lang.String desc, java.lang.String code, java.lang.String parent, java.lang.String untis) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveGroup(accesscode, name, desc, code, parent, untis);
  }
  
  public java.lang.Object getAllAccounts(java.lang.String accesscode, java.lang.String code, java.lang.String recursive) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAllAccounts(accesscode, code, recursive);
  }
  
  public java.lang.Object getAllAccountsExtended(java.lang.String accesscode, java.lang.String code, java.lang.String recursive) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAllAccountsExtended(accesscode, code, recursive);
  }
  
  public java.lang.Object getAllGroupsAndClasses(java.lang.String accesscode) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAllGroupsAndClasses(accesscode);
  }
  
  public java.lang.String addCourse(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.addCourse(accesscode, coursename, coursedesc);
  }
  
  public java.lang.Object addCourseTeacher(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc, java.lang.String internnummer, java.lang.String userlist) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.addCourseTeacher(accesscode, coursename, coursedesc, internnummer, userlist);
  }
  
  public java.lang.Object addCourseStudents(java.lang.String accesscode, java.lang.String coursename, java.lang.String coursedesc, java.lang.String groupIds) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.addCourseStudents(accesscode, coursename, coursedesc, groupIds);
  }
  
  public java.lang.String getCourses(java.lang.String accesscode) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getCourses(accesscode);
  }
  
  public java.lang.Object delUser(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String officialDate) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.delUser(accesscode, userIdentifier, officialDate);
  }
  
  public java.lang.Object saveUserParameter(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String paramName, java.lang.String paramValue) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveUserParameter(accesscode, userIdentifier, paramName, paramValue);
  }
  
  public java.lang.String getClassList(java.lang.Object accesscode) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getClassList(accesscode);
  }
  
  public java.lang.String getClassListJson(java.lang.Object accesscode) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getClassListJson(accesscode);
  }
  
  public java.lang.Object saveClassList(java.lang.String accesscode, java.lang.String serializedList) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveClassList(accesscode, serializedList);
  }
  
  public java.lang.Object saveClassListJson(java.lang.String accesscode, java.lang.String jsonList) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveClassListJson(accesscode, jsonList);
  }
  
  public java.lang.Object delClass(java.lang.String accesscode, java.lang.String code) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.delClass(accesscode, code);
  }
  
  public java.lang.Object saveUserToClasses(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String csvList) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveUserToClasses(accesscode, userIdentifier, csvList);
  }
  
  public java.lang.Object removeUserFromGroup(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String _class, java.lang.String officialDate) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.removeUserFromGroup(accesscode, userIdentifier, _class, officialDate);
  }
  
  public java.lang.Object saveUserToClass(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String _class, java.lang.String officialDate) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveUserToClass(accesscode, userIdentifier, _class, officialDate);
  }
  
  public java.lang.Object saveUserToClassesAndGroups(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String csvList, int keepOld) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveUserToClassesAndGroups(accesscode, userIdentifier, csvList, keepOld);
  }
  
  public java.lang.Object setAccountStatus(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.Object accountStatus) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.setAccountStatus(accesscode, userIdentifier, accountStatus);
  }
  
  public java.lang.Object setAccountPhoto(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String photo) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.setAccountPhoto(accesscode, userIdentifier, photo);
  }
  
  public java.lang.String getAccountPhoto(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAccountPhoto(accesscode, userIdentifier);
  }
  
  public java.lang.Object replaceInum(java.lang.String accesscode, java.lang.String oldInum, java.lang.String newInum) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.replaceInum(accesscode, oldInum, newInum);
  }
  
  public java.lang.Object forcePasswordReset(java.lang.String accesscode, java.lang.String userIdentifier, int accountType) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.forcePasswordReset(accesscode, userIdentifier, accountType);
  }
  
  public java.lang.Object savePassword(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String password, int accountType) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.savePassword(accesscode, userIdentifier, password, accountType);
  }
  
  public java.lang.Object sendMsg(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String title, java.lang.String body, java.lang.String senderIdentifier, java.lang.Object attachments, int coaccount) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.sendMsg(accesscode, userIdentifier, title, body, senderIdentifier, attachments, coaccount);
  }
  
  public java.lang.Object getSkoreClassTeacherCourseRelation(java.lang.String accesscode) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getSkoreClassTeacherCourseRelation(accesscode);
  }
  
  public java.lang.Object unregisterStudent(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String officialDate) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.unregisterStudent(accesscode, userIdentifier, officialDate);
  }
  
  public java.lang.Object getClassTeachers(java.lang.String accesscode, boolean getAllOwners) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getClassTeachers(accesscode, getAllOwners);
  }
  
  public java.lang.String getAbsentsByDate(java.lang.String accesscode, java.lang.String date) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAbsentsByDate(accesscode, date);
  }
  
  public java.lang.String getAbsents(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String schoolYear) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getAbsents(accesscode, userIdentifier, schoolYear);
  }
  
  public java.lang.String getUserDetails(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getUserDetails(accesscode, userIdentifier);
  }
  
  public java.lang.String getUserDetailsByNumber(java.lang.String accesscode, java.lang.String number) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getUserDetailsByNumber(accesscode, number);
  }
  
  public java.lang.String getUserDetailsByUsername(java.lang.String accesscode, java.lang.String username) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getUserDetailsByUsername(accesscode, username);
  }
  
  public java.lang.String getUserOfficialClass(java.lang.String accesscode, java.lang.String userIdentifier, java.lang.String date) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getUserOfficialClass(accesscode, userIdentifier, date);
  }
  
  public boolean saveSignature(java.lang.String accesscode, java.lang.String userIdentifier, int accountType, java.lang.String signature) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.saveSignature(accesscode, userIdentifier, accountType, signature);
  }
  
  public java.lang.String getStudentCareer(java.lang.String accesscode, java.lang.String userIdentifier) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.getStudentCareer(accesscode, userIdentifier);
  }
  
  public java.lang.Object deactivateTwoFactorAuthentication(java.lang.String accesscode, java.lang.String userIdentifier, int accountType) throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.deactivateTwoFactorAuthentication(accesscode, userIdentifier, accountType);
  }
  
  public void returnErrorCodes() throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    v3Port.returnErrorCodes();
  }
  
  public java.lang.String returnCsvErrorCodes() throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.returnCsvErrorCodes();
  }
  
  public java.lang.String returnJsonErrorCodes() throws java.rmi.RemoteException{
    if (v3Port == null)
      _initV3PortProxy();
    return v3Port.returnJsonErrorCodes();
  }
  
  
}