package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class Ornek3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String ad = request.getParameter("ad");
		String soyad = request.getParameter("soyad");
		PrintWriter out = response.getWriter();
		out.println("Ad: "+ad+"\n");
		out.println("Soyad:"+soyad+"\n");
	}
}
