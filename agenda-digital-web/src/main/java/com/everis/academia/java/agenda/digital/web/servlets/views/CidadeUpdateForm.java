package com.everis.academia.java.agenda.digital.web.servlets.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.web.servlets.CidadeDAO;
import com.everis.academia.agenda.digital.entity.Cidade;

@WebServlet(name = "CidadeUpdateForm", urlPatterns = "/cidade/update")
public class CidadeUpdateForm extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Short codigo = Short.valueOf(req.getParameter("codigo"));

		int indexOf = CidadeDAO.cidades.indexOf(new Cidade(codigo));
		Cidade cidade = CidadeDAO.cidades.get(indexOf);

		PrintWriter out = resp.getWriter();

		out.write("<html>");
		out.write("<body");
		out.write("<form action=\"ControladorUpdate\">");
		out.write("<table>");
		out.write("<tr><td>Nome:</td><td><input type=\"text\" name=\"nome\" value=\"" + cidade.getNome()
				+ "\"/></td></tr>");
		out.write("<tr><td>Codigo:</td><td><input type=\"text\" name=\"codigo\" value=\"" + cidade.getCodigo()
				+ "\"/></td></tr>");
		out.write("</table>");

		out.write("<input type=\"submit\" value=\"Update\"/>");
		out.write("</form>");
		out.write("</body>");
		out.write("</html>");

	}

}
