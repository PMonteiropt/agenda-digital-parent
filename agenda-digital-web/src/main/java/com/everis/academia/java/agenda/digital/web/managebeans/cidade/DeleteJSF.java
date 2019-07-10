package com.everis.academia.java.agenda.digital.web.managebeans.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name = "deleteCidade")
@Component("deleteCidade")
public class DeleteJSF {

	
	
	private ICidadeBusiness business;

	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void delete() {

		
		try {
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Cidade Apagada com sucesso",null));
			
			
			business.delete(cidade);

	
		
		}catch(Exception e) {
			
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro ao apagar cidade",
					
					
					
					e.getLocalizedMessage()));
		}

}
}