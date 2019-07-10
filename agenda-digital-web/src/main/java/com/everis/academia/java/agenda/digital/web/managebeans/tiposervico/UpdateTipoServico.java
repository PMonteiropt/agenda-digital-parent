package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name="updateTipoServico")
@Component("updateTipoServico")
public class UpdateTipoServico {

	@Autowired
	private ITipoServicoBusiness businesstipo;
	
	private TipoServico tiposervico = new TipoServico();

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}
	
	public String edit(TipoServico tiposervico) {
		
		this.tiposervico=tiposervico;
		
		return "UpdateTipoServico";
		
		
	}

	public String updateTipoServico() throws Exception {
		
		
		businesstipo.updateTipoServico(tiposervico);
		
		return "ReadTipoServico";
	}

}
