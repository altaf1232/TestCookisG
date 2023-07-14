package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieB extends HttpServlet
{
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
	try 
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Cookie ck[]=req.getCookies();
		out.print("hello"+ck[0].getValue());
		
		out.close();  
		
		
	}
	catch(Exception e) 
	{
		System.out.println("it is handelException in java");
	}
  }
}
