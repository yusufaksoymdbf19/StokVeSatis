package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class Deneme6Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String baslik = "checkbox verisini okumak";
		String doctype="<!DOCTYPE html>\n";
		out.println("");
		out.println(doctype+
				"<html>\n"+
				"<head><title>"+baslik+"</title></head>\n"+
				"<body bgcolor=\"#f0f0f0\""+
				"<h1 align=\"center\">"+baslik+"</h1\n "+
				"");//BURDAYIM DEVAM...
		
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		doGet(request,response);
		
	}

}
