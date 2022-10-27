package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class AdSoyad extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String baslik = "form verisini kullararak okumak için get metodu kullanımı.";
		String doctype =
				"<!doctype html public \"-//w3c//dtd html 4.0 " +" transitional //en\n";
		out.println(doctype +
				"<html>\n"+
				"<head><title>+"+baslik +"</title></head>\n"+
				"<body>\n"+
					"ad:"+request.getParameter("ad")+"\n"+
					"soyad:"+request.getParameter("soyad")+
					"</body></html>");
		
	}
	
}
