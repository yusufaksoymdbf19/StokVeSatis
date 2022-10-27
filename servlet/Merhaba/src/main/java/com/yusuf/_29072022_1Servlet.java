package com.yusuf;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.util.Enumeration;
public class _29072022_1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String baslik = "tüm form parametrelerini okumak";
		String doctype="<!DOCTYPE HTML>\n";
		out.println(doctype+
				"<html>\n"+
				"<head><title>"+baslik+"</title></head>\n"+
				"<body bgcolor=\"f0f0f0\">\n"
						+ "<h1 align=\"center\">"+baslik+"</h1>\n"
								+ "<table width=\"100\" border=\"1\" align=\"center\">\n"
										+ "<tr bgcolor=\"#949494\"><th>Param name</th><th>param valuee</th></tr>\n"
										+ "</table>\n"
								+ "</body>"	
				+"</html>");
		Enumeration<String> paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName = (String)paramNames.nextElement();
			out.print("<tr><td>"+paramName+"</td>\n</td>");
			String[] paramValues = request.getParameterValues(paramName);
					if(paramValues.length==1) {
						String paramValue=paramValues[0];
						if(paramValue.length()==0) {
							out.println("<i>deger yok.</i>");
							
						}else {
							out.println(paramValue);
						}
						
					}
					else {
						out.println("<ul>");
						for(int i =0;i<paramValues.length;i++) {
							out.println("<li>"+paramValues[i]);
						}
						out.println("</ul>");
						
					}
		}
		out.println("</tr>\n</table>\n</body></html>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		doGet(request,response);
	}
}
