package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.Cidade;

public interface ICidadeBusiness {

	Boolean create(Cidade cidade);

	Collection<Cidade> read();

	Boolean delete(Cidade cidade);

	Boolean update(Cidade cidade);

}
