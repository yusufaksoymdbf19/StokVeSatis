package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class Deneme5Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Sonuclar<br>Fizik:"+request.getParameter("fizik")+
				"<br>Kimya:"+request.getParameter("kimya")+
				"<br>Biyoloji:"+request.getParameter("biyoloji")+
				"<br>Matematik:"+request.getParameter("matematik"));
		
	}

}
