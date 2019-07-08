package com.everis.academia.java.agenda.digital.dao;

import java.util.List;

import com.everis.academia.agenda.digital.entity.TipoServico;

public interface ITipoServicoDAO {


	

	public void createTipoServico(TipoServico tiposervico);
	
	public void deleteTipoServico();
		
	
	public void updateTipoServico();
	
	List<TipoServico> readTipoServico();


}
