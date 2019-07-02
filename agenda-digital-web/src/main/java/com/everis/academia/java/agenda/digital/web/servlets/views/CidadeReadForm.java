package com.everis.academia.java.agenda.digital.web.servlets.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlets.CidadeDAO;


	@WebServlet(name = "CidadeReadForm", urlPatterns = "/cidade/read")
	public class CidadeReadForm extends HttpServlet {

	
		private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
			
			
		
		
		
			PrintWriter out = resp.getWriter();
			
			out.write("<html>");
			out.write("<body>");
			out.write("<table border=\"1\">");
			
			out.write("<tr><td>Codigo:</td><td>Nome:</td></tr>");
				for (Cidade cidade : CidadeDAO.cidades) {
					out.write("<tr><td>"+cidade.getCodigo()+"</td><td>"+cidade.getNome()+"</td></tr>");
				}
			out.write("</body>");
			out.write("</html>");
		
	
	
	}
}
