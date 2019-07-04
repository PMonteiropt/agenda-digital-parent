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

@WebServlet(name = "Update", urlPatterns = "/cidade/ControladorUpdate")
public class CidadeUpdateController extends HttpServlet {

	private ICidadeBusiness business = new CidadeBusiness();

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			// Recupera Parametros

			String nome = req.getParameter("nome");

			Cidade cidade = new Cidade();
			cidade.setNome(nome);

			business.update(cidade);

			// Imprime Mensagem.
			PrintWriter writer = resp.getWriter();
			writer.write("<html>");
			writer.write("<body>");
			writer.write("Registo Actualizado com Sucesso");
			writer.write("</body>");
			writer.write("</body>");

		} catch (Exception e) {

		}

	}
}
