package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;
public class Ornek2 extends HttpServlet {
	public String mesaj;
	public void init() throws ServletException {
		mesaj = "deneme2";
	}
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
	throws IOException{
		httpServletResponse.setContentType("text/html");
		
		PrintWriter out = httpServletResponse.getWriter();
		out.println("<h1>"+mesaj+"</h1>");
		
	}
	public void destroy() {
		//boş
	}
}
