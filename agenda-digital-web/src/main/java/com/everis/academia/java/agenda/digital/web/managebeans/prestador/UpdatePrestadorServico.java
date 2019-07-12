package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name="updatePrestadorServico")
@Component("updatePrestadorServico")
@RequestScope
public class UpdatePrestadorServico {

	@Autowired
	private IPrestadorServicoBusiness businessprestador;
	
	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}
	
	public String edit(PrestadorServico prestador) {
		this.prestador=prestador;
				
				return "updateprestador";
		
	}
	public String UpdatePrestador() {
		
		businessprestador.updatePrestador(prestador);
		
		return "readprestador";
	}

}
