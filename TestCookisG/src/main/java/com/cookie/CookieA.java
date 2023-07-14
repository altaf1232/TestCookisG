package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CookieA extends HttpServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
   {
	try 
	{
		
	
	  res.setContentType("text/html");
	  PrintWriter out = res.getWriter();
	  
	  String n=req.getParameter("userName");  
	    out.print("Welcome "+n);  
	  //create cookie name
	  Cookie ck=new Cookie("user",n);//creating cookie object 
	  res.addCookie(ck);//adding cookie in the response 
	  
	    //creating submit button  
	    out.print("<form action='CookieB'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	  
	  
	  out.close();
	  
	}
	 catch(Exception e) 
	 {
	    System.out.println("it is store the handel Exception in java"+e);
	    
	 }
	
   }
}
