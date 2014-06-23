/**
 * DBServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dbService;

public interface DBServiceService extends javax.xml.rpc.Service {
    public java.lang.String getDBServiceAddress();

    public dbService.DBService getDBService() throws javax.xml.rpc.ServiceException;

    public dbService.DBService getDBService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
