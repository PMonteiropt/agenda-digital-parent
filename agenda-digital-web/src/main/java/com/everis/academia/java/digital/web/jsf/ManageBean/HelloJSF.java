package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloJSF")
public class HelloJSF {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String digaOI( ) {
		return null;
	}
	
}
