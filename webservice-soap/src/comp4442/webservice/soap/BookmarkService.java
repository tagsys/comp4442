package comp4442.webservice.soap;


import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService()
public class BookmarkService {

	private BookmarkCollection collection;
	
	public BookmarkService()throws Exception{
		
		this.collection = BookmarkUtils.load();
		
	}
	
	@WebMethod
	public BookmarkCollection getAll(){
		
		return this.collection;
		
	}
	
	@WebMethod
	public Bookmark get( Integer id){
		
		for(Bookmark bookmark : this.collection.getCollection()){
			
			if(bookmark.getId() == id){
				return bookmark;
			}
		}
		return null;
	}

	@WebMethod
	public Integer create(Bookmark bookmark)throws Exception{
		
		bookmark.setId(this.collection.getCollection().length+1);
		
		collection.collection.add(bookmark);
				
		BookmarkUtils.save(collection);
		
		System.out.println("save end");
		
		return bookmark.getId();
	}
	@WebMethod
	public Boolean update(Bookmark bookmark)throws Exception{
		
		for(Bookmark b : this.collection.getCollection()){
			
			if(b.getId() == bookmark.getId()){
				
				b.setRemark(bookmark.getRemark());
				b.setTime(bookmark.getTime());
				b.setUrl(bookmark.getUrl());
				break;
				
			}
		}
		
		BookmarkUtils.save(collection);
	
		return true;
		
	}
	@WebMethod
	public Boolean delete(Integer id)throws Exception{
		
		for(int i=0;i<this.collection.collection.size();i++){
			if(this.collection.collection.get(i).getId() == id){
				this.collection.collection.remove(i);
				break;
			}
		}
		
		BookmarkUtils.save(collection);
		
		return true;
	}
	

}
