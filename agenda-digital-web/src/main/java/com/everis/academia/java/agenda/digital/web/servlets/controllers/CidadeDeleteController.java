package com.everis.academia.java.agenda.digital.web.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@WebServlet(name = "Delete", urlPatterns = "/delete/controller")
public class CidadeDeleteController extends HttpServlet {

	private ICidadeBusiness business = new CidadeBusiness();

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			Short codigo = Short.valueOf(req.getParameter("codigo"));// Exige implementaçao do equals() pelo codigo

			Cidade cidade = new Cidade();
			
			cidade.setCodigo(codigo);
			
			
			
			business.delete(cidade);

			PrintWriter writer = resp.getWriter();
			writer.write("<html>");
			writer.write("<body>");
			writer.write("Registo Excluido com sucesso");
			writer.write("<body>");
			writer.write("</body>");
		} catch (Exception e) {
			
		
		}

	}

}
