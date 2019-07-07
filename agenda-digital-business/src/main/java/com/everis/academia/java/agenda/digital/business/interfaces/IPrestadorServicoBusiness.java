package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface IPrestadorServicoBusiness {

	public void createPrestador(PrestadorServico servico) throws BusinessException;
		
	public void updatePrestador(PrestadorServico servico);
	
	public void deletePrestador(PrestadorServico servico);

	Collection<PrestadorServico> read();

}
