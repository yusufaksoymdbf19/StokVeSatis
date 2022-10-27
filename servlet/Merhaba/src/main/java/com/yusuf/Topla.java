package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
public class Topla extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		int s1 = Integer.parseInt(request.getParameter("sayi1"));
		int s2 = Integer.parseInt(request.getParameter("sayi2"));
		int sonuc = s1+s2;
		PrintWriter out = response.getWriter();
		out.println("sayilarin toplami: "+sonuc);
	}
}
