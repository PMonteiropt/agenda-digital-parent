package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.PrestadorServico;


public interface IPrestadorServicoDAO {


	void create(PrestadorServico prestador);
	
	void update(PrestadorServico prestador);
	
	void delete(PrestadorServico prestador);

	Collection<PrestadorServico> read();
}
