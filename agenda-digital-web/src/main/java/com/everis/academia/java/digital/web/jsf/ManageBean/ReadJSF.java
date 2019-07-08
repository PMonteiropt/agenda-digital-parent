package com.everis.academia.java.digital.web.jsf.ManageBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="read")
public class ReadJSF {

	ICidadeBusiness business = new CidadeBusiness();
	
	private List<Cidade> cidades =  null;

	
	@PostConstruct
	public void init() {
		
		this.cidades = business.read();
	}
	
	
	
	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	
	
	
		
		
		
		
		
		
	}
	
	


