package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;
import com.everis.academia.agenda.digital.entity.Cidade;

public interface ICidadeDAO {


	void create(Cidade cidade);
	
	Collection<Cidade> read();
	
	Boolean delete(Cidade cidade);
	
	public void update(Cidade cidade) throws Exception;
	
	 Boolean jaExisteCidadeComNome(String nome);
		
	
	
	




}
