package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface IPrestadorServicoBusiness {

	public void createPrestador(PrestadorServico prestador) throws BusinessException;
		
	public void updatePrestador(PrestadorServico prestador);
	
	public void deletePrestador(PrestadorServico prestador);

	Collection<PrestadorServico> read();

}
