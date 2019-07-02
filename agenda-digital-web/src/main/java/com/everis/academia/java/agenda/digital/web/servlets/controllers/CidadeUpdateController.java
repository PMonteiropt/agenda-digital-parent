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

	@WebServlet(name="Update", urlPatterns = "/ControladorUpdate")
	public class CidadeUpdateController extends HttpServlet{

		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void service(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException,IOException {
			
			
			Short codigo = Short.valueOf(req.getParameter("codigo"));
			String nome = req.getParameter("nome");
			
			if(nome==null || nome.trim().isEmpty()) {
				
				throw new ServletException("Nome Obrigatório");
			}		
				for(Cidade cidade : CidadeDAO.cidades) {
					if(cidade.getNome().trim().equalsIgnoreCase(nome)
						&& !cidade.getCodigo().equals(codigo)) {
						
						throw new ServletException("Já existe uma outra cidade com o mesmo nome");
					}
					
				}
			//Actualiza cidade	
			Cidade cidade = new Cidade(codigo,nome);
			int IndexOf = CidadeDAO.cidades.indexOf(cidade);
			
			//Imprime Mensagem.
			PrintWriter writer = resp.getWriter();
			writer.write("<html>");
			writer.write("<body>");
			writer.write("Registo Actualizado com Sucesso");
			writer.write("</body>");
			writer.write("</body>");
			
			}
			
			
			
		}


