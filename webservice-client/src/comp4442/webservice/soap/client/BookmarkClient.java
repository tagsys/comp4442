package comp4442.webservice.soap.client;

import comp4442.webservice.soap.Bookmark;
import comp4442.webservice.soap.BookmarkCollection;
import comp4442.webservice.soap.BookmarkService;
import comp4442.webservice.soap.BookmarkServiceProxy;

public class BookmarkClient {
	
	
	public static void main(String[] args) throws Exception{
		
		BookmarkServiceProxy proxy = new BookmarkServiceProxy("http://comp44442.azurewebsites.net/webservice-soap/services/BookmarkService");
		
				
		proxy.create(new Bookmark(0,"greate website!",System.currentTimeMillis(),"young.tagsys.org"));
	
		
		BookmarkCollection all = proxy.getAll();
		
		for(Bookmark b: all.getCollection()){
			
			System.out.println(b.getId()+","+b.getUrl()+","+b.getRemark()+","+b.getTime());
		}
	}

}
