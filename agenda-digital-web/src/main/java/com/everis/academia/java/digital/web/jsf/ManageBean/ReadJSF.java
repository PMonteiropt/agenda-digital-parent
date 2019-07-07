package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="read")
public class ReadJSF {

	ICidadeBusiness business = new CidadeBusiness();
	
	private short codigo;
	private String nome;
	
	public void readJSF() {
		
		
	business.read();
		
		
		
		
		
		
	}
	
	

}
