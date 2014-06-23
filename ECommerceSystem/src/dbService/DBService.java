/**
 * DBService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dbService;

public interface DBService extends java.rmi.Remote {
    public java.lang.String[] getName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[] getAll() throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String userid, java.lang.String pass) throws java.rmi.RemoteException;
    public java.lang.String userData(java.lang.String userid) throws java.rmi.RemoteException;
    public java.lang.String[] getBrand(java.lang.String brand) throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException;
}
