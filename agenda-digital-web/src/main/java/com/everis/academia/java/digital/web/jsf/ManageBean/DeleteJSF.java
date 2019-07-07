package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="delete")
public class DeleteJSF {

	ICidadeBusiness business = new CidadeBusiness();
	
	private short codigo;

	public short getCodigo() {
		return codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}
	
	public void deleteCidade() {
		
		Cidade cidade = new Cidade();
		
		cidade.setCodigo(codigo);
		
		business.delete(cidade);
	
	
	}

}
