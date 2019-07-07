package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;

@ManagedBean(name="update")
public class UpdateJSF {
	
	private ICidadeBusiness business = new CidadeBusiness();
	
	private String nome;
	private short codigo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public short getCodigo() {
		return codigo;
	}
	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	
	
	public void  updateCidade() throws Exception {
		
		Cidade cidade = new Cidade();
		
		cidade.setNome(nome);
		cidade.setCodigo(codigo);
		
		business.update(cidade);
	}
	
	



}
