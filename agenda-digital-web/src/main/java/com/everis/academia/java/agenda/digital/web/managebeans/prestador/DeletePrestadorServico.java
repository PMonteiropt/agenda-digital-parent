package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name = "deletePrestadorServico")
@Component("deletePrestadorServico")
@RequestScope
public class DeletePrestadorServico {

	@Autowired
	private IPrestadorServicoBusiness businessprestador;

	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestadorservico() {
		return prestador;
	}

	public void setPrestadorservico(PrestadorServico prestadorservico) {
		this.prestador = prestadorservico;
	}

	public void removePrestadorServico() throws BusinessException {

		businessprestador.deletePrestador(prestador);

	}

}
