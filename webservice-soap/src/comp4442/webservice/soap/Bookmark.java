package comp4442.webservice.soap;



public class Bookmark {
	
	private Integer id;
	
	private String url;
	
	private Long time;
	
	private String remark;
	

	public Bookmark(){
		
	}
	
	public Bookmark(String url, String remark){
		this.url = url;
		this.remark = remark;
		this.time = System.currentTimeMillis();
	}
	
	public Bookmark(Integer id, String url, String remark){
		this.id = id;
		this.url = url;
		this.remark = remark;
		this.time = System.currentTimeMillis();
	}


	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Long getTime() {
		return time;
	}


	public void setTime(Long time) {
		this.time = time;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
