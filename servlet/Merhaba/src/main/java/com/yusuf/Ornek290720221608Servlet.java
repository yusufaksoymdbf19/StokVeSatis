package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class Ornek290720221608Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Adı:"+request.getParameter("ad")+"<br>");
		out.println("Soyadı:"+request.getParameter("soyad")+"<br>");
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		doGet(request,response);
	}
}
