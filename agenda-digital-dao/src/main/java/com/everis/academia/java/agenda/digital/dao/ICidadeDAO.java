package com.everis.academia.java.agenda.digital.dao;

import java.util.List;

import com.everis.academia.agenda.digital.entity.Cidade;

public interface ICidadeDAO {

	void create(Cidade cidade);

	List<Cidade> read();

	public void update(Cidade cidade) throws Exception;

	Boolean jaExisteCidadeComNome(Cidade cidade);

	public void delete(Cidade cidade);

	public Cidade search(String nome);


	


}
