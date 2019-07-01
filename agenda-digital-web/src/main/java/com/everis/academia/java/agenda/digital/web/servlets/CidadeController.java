package com.everis.academia.java.agenda.digital.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.agenda.digital.entity.Cidade;

	@WebServlet(name = "formulario3", urlPatterns = "/Controlador")
	public class CidadeController extends HttpServlet {

		
		private static final long serialVersionUID = 1L;
		
		List<Cidade> lista = new ArrayList<>();
		
		

		protected void service(HttpServletRequest pedido1,
				HttpServletResponse resposta1) throws ServletException,IOException {

			Short codigo = Short.valueOf(pedido1.getParameter("codigo"));
			String nome = pedido1.getParameter("nome");
			
	
			PrintWriter out = resposta1.getWriter();
			out.println("<html>");
			out.println("<table border=\"1\">");
			
			
			out.println(
					"<tr><td>Codigo:</td><td>"+codigo+"</td></tr>");
			
			
			out.println(
					"<tr><td>Nome:</td><td>"+nome+"</td></tr>");
			
			
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
	
			
		
		 
		
			
}
}
