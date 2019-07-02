package com.everis.academia.java.agenda.digital.web.servlets.views;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CidadeCreatForm", urlPatterns = "/cidade/create")
public class CidadeCreateForm extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		PrintWriter output = resp.getWriter();
		
		output.println("<html>");
		output.println("<body>");
		output.println("<form action=\"ControladorCreate\">");
		output.println("<table border=\"1\">");
		
		
		
		output.println(
					"<tr><td>Nome:</td><td><input type=\"text\" name=\"nome\"/></td></tr>");
		output.println("<tr><td colspan=\"2\" align=\"center\">");
		output.println("<input type=\"submit\" value=\"Enviar\"/>");
		output.println("</td></tr>");
		
		
		output.println("</table>");
		output.println("</form");
		output.println("</body");
		output.println("</html");
	}
		 
}
