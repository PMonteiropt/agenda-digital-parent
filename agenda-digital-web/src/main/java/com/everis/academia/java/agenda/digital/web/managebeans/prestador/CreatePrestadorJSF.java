package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.enums.TipoLogradouro;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name = "createPrestadores")
@Component("createPrestadores")
@RequestScope
public class CreatePrestadorJSF {

	@Autowired
	private IPrestadorServicoBusiness businessprestador;

	private PrestadorServico prestador = new PrestadorServico();

	@Autowired
	ICidadeBusiness cidadebusiness;

	// FrontEnd chama a entidade do metodo
	public PrestadorServico getPrestadorservico() {
		return prestador;
	}

	public void setPrestadorservico(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public TipoLogradouro[] getEnum() {

		return TipoLogradouro.values();

	}

	public String criarPrestadorServico() throws BusinessException {

		try {
		
		businessprestador.createPrestador(prestador);

		FacesContext.getCurrentInstance().addMessage("nome",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Prestador Criado com sucesso", null));
		
		return "readprestador";
	}catch(Exception e) {


		FacesContext.getCurrentInstance().addMessage("nome",
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao criar prestador",

						e.getLocalizedMessage()));
	return null;
	}

	}		
}		
		
		
		
		
		