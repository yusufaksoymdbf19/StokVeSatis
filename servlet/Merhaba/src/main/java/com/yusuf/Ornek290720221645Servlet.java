package com.yusuf;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class Ornek290720221645Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("fizik: "+request.getParameter("fizik")+"<br>");
		out.println("kimya: "+request.getParameter("kimya")+"<br>");
		out.println("biyoloji:"+request.getParameter("biyoloji")+"<br>");
		out.println("matematik:"+request.getParameter("matematik")+"<br>");
	}

}
