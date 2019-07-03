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
import com.everis.academia.java.agenda.digital.web.servlets.CidadeDAO;




@WebServlet(name="Delete", urlPatterns = "/delete/controller")
public class CidadeDeleteController extends HttpServlet {

	private ICidadeBusiness business = new CidadeBusiness();
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException,IOException{
		
		
		
		Short codigo = Short.valueOf(req.getParameter("codigo"));//Exige implementašao do equals() pelo codigo
		
		business.delete(new Cidade(codigo));
		
		//???Construtor
		CidadeDAO.cidades.remove(new Cidade(codigo));
		
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<body>");
		writer.write("Registo Excluido com sucesso");
		writer.write("<body>");
		writer.write("</body>");
		
		
		
	}
	
	
	

}
