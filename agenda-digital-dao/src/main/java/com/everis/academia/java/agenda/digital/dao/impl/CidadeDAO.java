package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;



public class CidadeDAO implements ICidadeDAO {

	static List<Cidade> cidades = new ArrayList<>();
	
	private static short id=0;
	
	@Override
	public void create(Cidade cidade) {
		
		//incremento proximo id
		id++;
		
		//Actualiza o codigo da cidade.
		cidade.setCodigo(id);
		
		//Adiciona cidade a lista
		cidades.add(cidade);
		
	
	}

	@Override
	public Collection<Cidade> read() {
		return null;
	}

	@Override
	public void delete(String nome) {
		
		if(jaExisteCidadeComNome(nome)) {
			
		}
		
		CidadeDAO.cidades.remove(nome);
	}

	@Override
	public void  update(Cidade cidade) throws Exception {
		
		
		int IndexOf = CidadeDAO.cidades.indexOf(cidade);
		
		CidadeDAO.cidades.set(IndexOf, cidade);
		
		((CidadeDAO) CidadeDAO.cidades).update(cidade);
	}

	@Override
	public Boolean jaExisteCidadeComNome(String nome) {
		
		return null;
	}

	
}
