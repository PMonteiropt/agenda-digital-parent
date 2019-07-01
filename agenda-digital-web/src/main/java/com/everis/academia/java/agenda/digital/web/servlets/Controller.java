package com.everis.academia.java.agenda.digital.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "formulario2", urlPatterns = "/Controller")
public class Controller extends HttpServlet {

	

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest pedido,
		HttpServletResponse resposta) throws ServletException,IOException {
	
	
	String nome = pedido.getParameter("nome");
	Integer idade = Integer.valueOf(pedido.getParameter("idade"));
	Double salario = Double.valueOf(pedido.getParameter("salario"));
	
	
	PrintWriter out = resposta.getWriter();
	out.println("<html>");
	out.println("<body bgcolor=\"#FF0000\">");
	out.println("<table border=\"1\">");
	out.println("<tr><td colspan=\"2\"> Parametros Recebidos</td></tr>");
	out.println(
				"<tr><td>Nome:</td><td>"+nome+"</td></tr>");
	out.println(
			"<tr><td>Idade:</td><td>"+idade+"</td></tr>");
	out.println(
			"<tr><td>Salario:</td><td>"+salario+"</td></tr>");
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");
	
	
}



}
