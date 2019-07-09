package com.everis.academia.java.agenda.digital.business.interfaces;

import java.util.List;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;

public interface ICidadeBusiness  {

	void create(Cidade cidade) throws BusinessException;

	List<Cidade> read();

	public void delete (Cidade cidade) throws BusinessException;

	public void update(Cidade cidade) throws Exception;

	

}
