package dbService;

public class DBServiceProxy implements dbService.DBService {
  private String _endpoint = null;
  private dbService.DBService dBService = null;
  
  public DBServiceProxy() {
    _initDBServiceProxy();
  }
  
  public DBServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDBServiceProxy();
  }
  
  private void _initDBServiceProxy() {
    try {
      dBService = (new dbService.DBServiceServiceLocator()).getDBService();
      if (dBService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dBService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dBService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dBService != null)
      ((javax.xml.rpc.Stub)dBService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public dbService.DBService getDBService() {
    if (dBService == null)
      _initDBServiceProxy();
    return dBService;
  }
  
  public java.lang.String[] getName(java.lang.String name) throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.getName(name);
  }
  
  public java.lang.String[] getAll() throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.getAll();
  }
  
  public java.lang.String login(java.lang.String userid, java.lang.String pass) throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.login(userid, pass);
  }
  
  public java.lang.String userData(java.lang.String userid) throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.userData(userid);
  }
  
  public java.lang.String[] getBrand(java.lang.String brand) throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.getBrand(brand);
  }
  
  public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException{
    if (dBService == null)
      _initDBServiceProxy();
    return dBService.sayHelloWorld(name);
  }
  
  
}