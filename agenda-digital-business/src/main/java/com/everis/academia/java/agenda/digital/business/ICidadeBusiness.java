package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.Cidade;

public interface ICidadeBusiness  {

	void create(String nome) throws BusinessException;

	Collection<Cidade> read();

	public void delete(String nome);

	public void update(Cidade cidade) throws Exception;

	

}
