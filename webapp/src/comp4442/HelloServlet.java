package comp4442;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter pw = new PrintWriter(response.getOutputStream());
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Hello world! This is my first Servlet program!</h1>");
		pw.println("</body");
		pw.println("</html>");

		pw.flush();
		pw.close();
		
	}

}
