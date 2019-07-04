package com.everis.academia.java.agenda.digital.web.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "MeuFiltro", urlPatterns = "/cidade/create")
public class MeuFiltro implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		request.getParameterMap().forEach((key,value) -> {
			
			System.out.println(key+  Arrays.toString(value));
		});
		
		
	
		
		chain.doFilter(request, response);
		
	}

	public void destroy()  {
		
	}

	

}