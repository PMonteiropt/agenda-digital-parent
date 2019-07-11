package com.everis.academia.java.agenda.digital.web.managebeans.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name = "deleteCidade")
@Component("deleteCidade")
@RequestScope
public class DeleteJSF {

	@Autowired
	private ICidadeBusiness business;

	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String delete() {

		try {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Cidade Apagada com sucesso", null));

			business.delete(cidade);

		} catch (Exception e) {
			e.printStackTrace();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao apagar cidade",

							e.getLocalizedMessage()));
		}

		return null;
	}
}