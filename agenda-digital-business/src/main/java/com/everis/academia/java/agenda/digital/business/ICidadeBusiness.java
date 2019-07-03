package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.Cidade;

public interface ICidadeBusiness  {

	void create(Cidade cidade) throws BusinessException;

	Collection<Cidade> read();

	Boolean delete(Cidade cidade);

	public void update(Cidade cidade) throws BusinessException;

}
