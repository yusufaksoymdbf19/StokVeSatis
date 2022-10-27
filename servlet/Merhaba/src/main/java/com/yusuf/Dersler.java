package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
public class Dersler extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "checkbox verisini oku.";
		String icerik =
				"<!DOCTYPE html>"+
		"<html>"+
						"<head><title>"+title+"</title></head>"+
		"<body>"+
						"fizik:"+request.getParameter("fizik")+"\n"+
		"kimya:"+request.getParameter("kimya")+"\n"+
						"biyoloji: "+request.getParameter("biyoloji")+"\n"+
						"matematik:"+request.getParameter("matematik")+"\n"+
						"geometri: "+request.getParameter("geometri")+"\n"+
						"</body></html>";
		out.println(icerik);
	
		
						
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request,response);
	}
}
