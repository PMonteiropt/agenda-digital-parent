package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.List;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface IPrestadorServicoBusiness {

	public void createPrestador(PrestadorServico prestador) throws BusinessException;
		
	public void updatePrestador(PrestadorServico prestador) throws BusinessException;
	
	public void deletePrestador(PrestadorServico prestador) throws BusinessException;

	List<PrestadorServico> read();

}
