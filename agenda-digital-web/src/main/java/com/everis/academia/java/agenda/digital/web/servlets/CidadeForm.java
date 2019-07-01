package com.everis.academia.java.agenda.digital.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "formulariocidade", urlPatterns = "/cidade")
public class CidadeForm extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter output = response.getWriter();
		
		output.println("<html>");
		output.println("<body>");
		output.println("<form action=\"Controlador\">");
		output.println("<table border=\"1\">");
		
		output.println("<tr><td colspan=\"2\">Formulario</td><tr>");
		output.println(
					"<tr><td>Codigo:</td><td><input type=\"text\" name=\"codigo\"/></td></tr>");
		
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
