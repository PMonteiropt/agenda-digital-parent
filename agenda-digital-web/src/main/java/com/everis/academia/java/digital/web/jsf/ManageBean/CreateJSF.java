package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="create")
public class CreateJSF {
	
	private ICidadeBusiness business = new CidadeBusiness();
	
	
	private String nome;
	

 	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void criarCidade() throws BusinessException {
		
		Cidade cidade = new Cidade();
		
		cidade.setNome(nome);
		
		business.create(cidade);
		
		
		
		
	}
	
	public String limpar() {

		return nome=null;
	
	}
	
	


}
