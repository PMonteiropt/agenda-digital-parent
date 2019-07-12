package com.everis.academia.java.agenda.digital.dao;

import java.util.List;

import com.everis.academia.agenda.digital.entity.PrestadorServico;

public interface IPrestadorServicoDAO {


	public void createPrestador(PrestadorServico prestador);
		
	

	public void updatePrestador(PrestadorServico prestador);
		
	
	
	public void deletePrestador(PrestadorServico prestador);
		
	
	List<PrestadorServico> readPrestador();

}
