/**
 * BookmarkServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package comp4442.webservice.soap;

public interface BookmarkServiceService extends javax.xml.rpc.Service {
    public java.lang.String getBookmarkServiceAddress();

    public comp4442.webservice.soap.BookmarkService getBookmarkService() throws javax.xml.rpc.ServiceException;

    public comp4442.webservice.soap.BookmarkService getBookmarkService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
