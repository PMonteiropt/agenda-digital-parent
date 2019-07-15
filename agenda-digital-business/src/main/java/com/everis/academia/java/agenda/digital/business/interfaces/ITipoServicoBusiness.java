package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.List;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface ITipoServicoBusiness {


	public void createTipoServico(TipoServico tiposervico) throws BusinessException;
	
	public void deleteTipoServico(TipoServico tiposervico) throws BusinessException;
		
	
	public void updateTipoServico(TipoServico tiposervico) throws BusinessException;
	
	public List<TipoServico> readTipoServico();

	

}
