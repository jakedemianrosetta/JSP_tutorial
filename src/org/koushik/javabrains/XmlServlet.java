package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet 
{

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		
		//here, request.getParameter("userName") looks at the url, finds the parameter with name "userName", and stores
		//    its value as user_name
		//String user_name = request.getParameter("userName");
		String name = request.getParameter("NAME");
		HttpSession session = request.getSession();
		
		if(name != "" && name != null){
			session.setAttribute("savedName", name);
		}
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello," + (String) session.getAttribute("savedName") + ", from GET!</h3>");
	}
	
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		
//		response.setContentType("text/html");
//
//		String user_name = request.getParameter("userName");
//		String full_name = request.getParameter("fullName");
//		
//		
//		
//		PrintWriter out = response.getWriter();
//		out.println("<h3>Hello, " + user_name + "!  We know your full name is " + full_name + ".</h3>");
//		String prof = request.getParameter("prof"); //will come back as either architect or developer
//		out.println("You are a " + prof);
//		
//		String[] loc = request.getParameterValues("location");
//		
//		out.println("You are at " + loc.length + " places:");
//		for(int i = 0; i < loc.length; i++)
//		{
//			out.println(loc[i]);
//		}
//		
//	}

	
}
