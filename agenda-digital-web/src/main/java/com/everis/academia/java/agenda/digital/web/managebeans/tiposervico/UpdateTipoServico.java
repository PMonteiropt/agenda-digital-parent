package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean
public class UpdateTipoServico {

	private ITipoServicoBusiness businesstipo = new TipoServicoBusiness();
	
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
