/**
 * BookmarkService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package comp4442.webservice.soap;

public interface BookmarkService extends java.rmi.Remote {
    public comp4442.webservice.soap.Bookmark get(int id) throws java.rmi.RemoteException;
    public boolean update(comp4442.webservice.soap.Bookmark bookmark) throws java.rmi.RemoteException;
    public boolean delete(int id) throws java.rmi.RemoteException;
    public int create(comp4442.webservice.soap.Bookmark bookmark) throws java.rmi.RemoteException;
    public comp4442.webservice.soap.BookmarkCollection getAll() throws java.rmi.RemoteException;
}
