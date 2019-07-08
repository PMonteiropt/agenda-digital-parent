package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.List;

import com.everis.academia.agenda.digital.entity.TipoServico;

public interface ITipoServicoBusiness {


	public void createTipoServico(TipoServico tiposervico);
	
	public void deleteTipoServico();
		
	
	public void updateTipoServico();
	
	public List<TipoServico> readTipoServico();

	

}
