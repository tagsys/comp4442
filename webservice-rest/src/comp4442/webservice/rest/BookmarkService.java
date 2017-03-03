package comp4442.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/BookmarkService")
public class BookmarkService {
	
	private BookmarkCollection collection;
	
	public BookmarkService()throws Exception{
		
		this.collection = BookmarkCollection.load("bookmarks.xml");
		
	}
	
	@GET
	@Path("/bookmarks")
	public BookmarkCollection getAll(){
		
		return this.collection;
		
	}
	
	@GET
	@Path("/bookmark/{id}")
	public Bookmark get(@PathParam("id") int id){
		
		for(Bookmark bookmark : this.collection.getCollection()){
			
			if(bookmark.getId() == id){
				return bookmark;
			}
		}
		return null;
	}

	public int create(Bookmark bookmark)throws Exception{
		
		bookmark.setId(this.collection.getCollection().size()+1);
		
		collection.getCollection().add(bookmark);
		
		collection.save();
		
		return bookmark.getId();
	}
	
	public boolean update(Bookmark bookmark)throws Exception{
		
		for(Bookmark b : this.collection.getCollection()){
			
			if(b.getId() == bookmark.getId()){
				
				b.setRemark(bookmark.getRemark());
				b.setTime(bookmark.getTime());
				b.setUrl(bookmark.getUrl());
				break;
				
			}
		}
		
		this.collection.save();
	
		return true;
		
	}
	
	public boolean delete(int id){
		
		for(int i=0;i<this.collection.getCollection().size();i++){
			if(this.collection.getCollection().get(i).getId() == id){
				this.collection.getCollection().remove(i);
				break;
			}
		}
		
		return true;
	}
	
	

}
