package com.everis.academia.java.digital.web.jsf.ManageBean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="create")
public class CreateJSF {
	
	private ICidadeBusiness business = new CidadeBusiness();
	
	private Cidade cidade = new Cidade();
	
	
	

 	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}
	
	public String criarCidade() throws BusinessException {
		
		try {
			business.create(cidade);
			
			FacesContext.getCurrentInstance().addMessage("nome", new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Cidade criada com sucesso",null));
		
			
		
		
		return "Read";
		}catch(Exception e) {
			
			FacesContext.getCurrentInstance().addMessage("nome", 
			new FacesMessage(FacesMessage.SEVERITY_ERROR,
			"Erro ao criar cidade",
			
			
			
			e.getLocalizedMessage()));
			
			return null;
		}
		
		
		
	}
	
	
	
	
	public String limpar() {

		this.cidade = new Cidade();
		
		return null;
	
	}
	
	


}
