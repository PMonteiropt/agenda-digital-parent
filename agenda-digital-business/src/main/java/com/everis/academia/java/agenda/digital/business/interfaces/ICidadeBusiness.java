package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface ICidadeBusiness  {

	void create(Cidade cidade) throws BusinessException;

	Collection<Cidade> read();

	public void delete(Cidade cidade);

	public void update(Cidade cidade) throws Exception;

	

}