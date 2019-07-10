package com.everis.academia.java.agenda.digital.web.managebeans.cidade;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="read")
@Component("read")
public class ReadJSF {

	@Autowired
	private ICidadeBusiness business;
	
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
	
	


