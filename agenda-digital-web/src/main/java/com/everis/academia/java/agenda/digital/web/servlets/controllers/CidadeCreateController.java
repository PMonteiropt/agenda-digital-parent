package com.everis.academia.java.agenda.digital.web.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlets.CidadeDAO;


@WebServlet(name = "Create", urlPatterns = "/cidade/ControladorCreate")
	public class CidadeCreateController extends HttpServlet {

		
	
		private static final long serialVersionUID = 1L;
		
		private short id;
		
		

		protected void service(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException,IOException {

			
			PrintWriter writer = resp.getWriter();
			
			String nome = req.getParameter("nome");
			
			
			if(nome == null || nome.trim().isEmpty()) {				
				
				writer.write("Não foi possivel fazer a introdução");
			}
			
				
				
			//Adiciona Cidade
			Cidade cidade = new Cidade();
			cidade.setCodigo(id++);
			cidade.setNome(nome);
			
			CidadeDAO.cidades.add(cidade);
			
			
			//Imprime Mensagem
			writer.println("<html>");
			writer.println("<body>");
			writer.println("Registo incluido com sucesso");
			writer.println("</body>");
			writer.println("</html>");
		 
		
			
	}
}
