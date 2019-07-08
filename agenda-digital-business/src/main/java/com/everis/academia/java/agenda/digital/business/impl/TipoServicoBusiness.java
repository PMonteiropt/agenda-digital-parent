package com.everis.academia.java.agenda.digital.business.impl;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.dao.impl.TipoServicoDAO;

public class TipoServicoBusiness implements ITipoServicoBusiness {

	private ITipoServicoDAO daotipo = new TipoServicoDAO();
	
	
	@Override
	public void createTipoServico(TipoServico tiposervico) {
		
		daotipo.createTipoServico(tiposervico);
		
		
	}

	@Override
	public void deleteTipoServico() {
	

	}

	@Override
	public void updateTipoServico() {
		

	}

	@Override
	public void readTipoServico() {
		

	}

}
