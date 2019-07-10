package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name="readTipoServico")
@Component("readTipoServico")
public class ReadTipoServico {

	@Autowired
	private ITipoServicoBusiness businesstipo;
	
	private List<TipoServico> servicos = null;
	
	@PostConstruct
	public void init() {
		
		this.servicos=businesstipo.readTipoServico();
		
		
	}

	public List<TipoServico> getServico() {
		return servicos;
	}

	public void setServico(List<TipoServico> servico) {
		this.servicos = servico;
	}

	

}
