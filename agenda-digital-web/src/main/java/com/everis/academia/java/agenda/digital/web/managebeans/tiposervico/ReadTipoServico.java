package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name="readTipoServico")
public class ReadTipoServico {

	ITipoServicoBusiness businesstipo = new TipoServicoBusiness();
	
	private List<TipoServico> servico = null;
	
	@PostConstruct
	public void init() {
		
		this.servico=businesstipo.readTipoServico();
		
		
	}

	public List<TipoServico> getServico() {
		return servico;
	}

	public void setServico(List<TipoServico> servico) {
		this.servico = servico;
	}

	

}
