package com.everis.academia.java.agenda.digital.web.managebeans.cidade;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name="cidadeUpdate")
@Component("cidadeUpdate")
public class UpdateJSF {
	
	private ICidadeBusiness business;
	
	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
    public String edit(Cidade cidade) {
    	
    	this.cidade=cidade;
    	
    	return "Update";
    }

    public String update() throws Exception {
    	
    	
    	try {
    		
    	business.update(cidade);
    	
    	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Cidade actualizada com sucesso",null));
		
			
		
		return "Read";
    	}catch(Exception e) {
    	
    		FacesContext.getCurrentInstance().addMessage(null, 
    				new FacesMessage(FacesMessage.SEVERITY_ERROR,
    				"Erro ao atualizar cidade",
    				
    				
    				
    				e.getLocalizedMessage()));
    				
    				return null;
    	}
    }
}