package com.everis.academia.java.agenda.digital.web.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;

@WebServlet(name = "Create", urlPatterns = "/ControladorCreate")
public class CidadeCreateController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ICidadeBusiness business = new CidadeBusiness();

	@Override
		protected void service(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException,IOException {

			
			
			
				PrintWriter writer = resp.getWriter();
			
			
				try {
				String nome = req.getParameter("nome");
				
				//Adiciona Cidade
				Cidade cidade = new Cidade();
				cidade.setNome(nome);
				
				business.create(cidade);
		
			
			
			
			
			//Imprime Mensagem
			writer.println("<html>");
			writer.println("<body>");
			writer.println("Registo incluido com sucesso");
			writer.println("</body>");
			writer.println("</html>");
			
				}catch(Exception e) {
			}
		 }
}
