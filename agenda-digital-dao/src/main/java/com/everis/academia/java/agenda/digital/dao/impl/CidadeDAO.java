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
		
		return cidades;
	}

	@Override
	public void delete(Cidade cidade) {
		
		//remove itera e verifica se existe objecto na lista
		cidades.remove(cidade);
		
		
	}

	@Override
	public void  update(Cidade cidade) throws Exception {
		
		
		int indexOf = cidades.indexOf(cidade);
		cidades.set(indexOf, cidade);
	}

	@Override
	public Boolean jaExisteCidadeComNome(String nome) {
		
		for(Cidade cidade : cidades) {
			if(cidade.getNome().equals(nome)) 
				return true;
		}
		return false;
	
	}

	

	
}
