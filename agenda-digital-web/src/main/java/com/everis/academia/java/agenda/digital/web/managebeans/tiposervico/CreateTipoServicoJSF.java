package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name = "createTipoServico")
@Component("createTipoServico")
@RequestScope
public class CreateTipoServicoJSF {

	@Autowired
	private ITipoServicoBusiness businesstipo;

	private TipoServico tiposervico = new TipoServico();

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}

	public String criarTipoServico() throws BusinessException {

		try {

			businesstipo.createTipoServico(tiposervico);

			FacesContext.getCurrentInstance().addMessage("tipo",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Tipo de Serviço criado com sucesso", null));

			return "readtiposervico";

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao criar cidade",

							e.getLocalizedMessage()));

			return null;
		}

	}
}
