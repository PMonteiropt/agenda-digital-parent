package com.everis.academia.java.agenda.digital.web.servlets;

import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(name = "error", urlPatterns = { "/erro/page" })
	public class Error extends HttpServlet {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.
		 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
		 */
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException,
				IOException {

			ValidationException validationException = (ValidationException) req
					.getAttribute(RequestDispatcher.ERROR_EXCEPTION);

			resp.getWriter().write(
					validationException.getLocalizedMessage());
		}





}
