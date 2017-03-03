package comp4442.webservice.rest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class BookmarkServlet extends HttpServlet {
	
	private BookmarkService service;
	
	private Gson gson = new Gson();

	
	private String pattern1 =  "/webservice-rest/rest/BookmarkService/bookmarks";
	private String pattern2 = "/webservice-rest/rest/BookmarkService/bookmark/";
	private String pattern3 = "/webservice-rest/rest/BookmarkService/bookmark/\\d+";
	
	public BookmarkServlet()throws Exception{
		service = new BookmarkService();
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = new PrintWriter(resp.getOutputStream());
		
		String uri = req.getRequestURI();
		
		System.out.println(uri);
		
		boolean patterned = Pattern.matches(pattern1, uri);
		System.out.println(patterned);
		
		if(patterned){
			
			BookmarkCollection c = this.service.getAll();
			
			pw.println(gson.toJson(c));
			
		}else{
		
			patterned = Pattern.matches(pattern3, uri);
			
			if(patterned){
			
				String[] result = uri.split("/");
				
				int id = Integer.valueOf(result[result.length-1]);
				
				pw.println(gson.toJson(this.service.get(id)));
			}
		}
		
		pw.flush();
		
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	
	public static void main(String[] args) {
		
		
		String test = "/webservice-rest/rest";
		String[] results = test.split("/");
		System.out.println(Arrays.toString(results));
		
	}

}
