package vivi2.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Demo2Servlet extends HttpServlet {
	private String message;

	  public void init() throws ServletException
	  {
	   
	      message = "Hello World";
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
	      
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	  }
}
