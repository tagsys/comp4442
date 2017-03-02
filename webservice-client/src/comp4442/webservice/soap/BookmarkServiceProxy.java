package comp4442.webservice.soap;

public class BookmarkServiceProxy implements comp4442.webservice.soap.BookmarkService {
  private String _endpoint = null;
  private comp4442.webservice.soap.BookmarkService bookmarkService = null;
  
  public BookmarkServiceProxy() {
    _initBookmarkServiceProxy();
  }
  
  public BookmarkServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookmarkServiceProxy();
  }
  
  private void _initBookmarkServiceProxy() {
    try {
      bookmarkService = (new comp4442.webservice.soap.BookmarkServiceServiceLocator()).getBookmarkService();
      if (bookmarkService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookmarkService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookmarkService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookmarkService != null)
      ((javax.xml.rpc.Stub)bookmarkService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public comp4442.webservice.soap.BookmarkService getBookmarkService() {
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService;
  }
  
  public comp4442.webservice.soap.Bookmark get(int id) throws java.rmi.RemoteException{
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService.get(id);
  }
  
  public boolean update(comp4442.webservice.soap.Bookmark bookmark) throws java.rmi.RemoteException{
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService.update(bookmark);
  }
  
  public boolean delete(int id) throws java.rmi.RemoteException{
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService.delete(id);
  }
  
  public int create(comp4442.webservice.soap.Bookmark bookmark) throws java.rmi.RemoteException{
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService.create(bookmark);
  }
  
  public comp4442.webservice.soap.BookmarkCollection getAll() throws java.rmi.RemoteException{
    if (bookmarkService == null)
      _initBookmarkServiceProxy();
    return bookmarkService.getAll();
  }
  
  
}