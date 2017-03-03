package comp4442.webservice.rest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


public class BookmarkCollection {


	protected List<Bookmark> collection = new ArrayList<Bookmark>();
	private long lastUpdatedTime;
	
	public BookmarkCollection(){
		this.lastUpdatedTime = System.currentTimeMillis();
	}

	public Bookmark[] getCollection() {
		return (Bookmark[]) collection.toArray(new Bookmark[0]);
	}

	public void setCollection(List<Bookmark> collection) {
		this.collection = collection;
	}

	public long getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(long lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	
	
	
}
