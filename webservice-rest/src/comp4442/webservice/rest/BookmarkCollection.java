package comp4442.webservice.rest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement
public class BookmarkCollection {


	private List<Bookmark> collection = new ArrayList<Bookmark>();
	private long lastUpdatedTime;
	
	public BookmarkCollection(){
		this.lastUpdatedTime = System.currentTimeMillis();
	}

	@XmlElement
	public List<Bookmark> getCollection() {
		return collection;
	}

	public void setCollection(List<Bookmark> collection) {
		this.collection = collection;
	}

	@XmlElement
	public long getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(long lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	public void save(String filename)throws Exception{
		

		
        JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(BookmarkCollection.class);
        
		Marshaller marshaller = jaxbCtx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		
		marshaller.marshal(this, new File(filename));
	}
	
	public void save()throws Exception{
		this.save("bookmarks.xml");
	}
	
	public static BookmarkCollection load(String filename) throws Exception{
				
		File f= new File(filename);
		if(!f.exists()){
			return new BookmarkCollection();
		}
    
        JAXBContext jaxbContext = JAXBContext.newInstance(BookmarkCollection.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return  (BookmarkCollection) jaxbUnmarshaller.unmarshal(new File(filename));
		
		
	}
	

	
	public static void main(String[] args) throws Exception {
		
		//saving to XML
		
		BookmarkCollection c = BookmarkCollection.load("bookmarks.xml");
		
		c.getCollection().add(new Bookmark("www.ployu.edu.hk","polyu"));
		
		c.save("bookmarks.xml");
		
		//serialize
		
		Gson gson = new Gson();
		String json = gson.toJson(c);
		
		System.out.println(json);
		
	}
	
}
