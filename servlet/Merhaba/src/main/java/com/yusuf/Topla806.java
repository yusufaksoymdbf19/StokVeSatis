package com.yusuf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
public class Topla806 extends HttpServlet  {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2=Integer.parseInt(request.getParameter("s2"));
		int sonuc = s1+s2;
		PrintWriter out = response.getWriter();
		out.println("toplamin sonucu:" + String.valueOf(sonuc));
		
	}
	
}
