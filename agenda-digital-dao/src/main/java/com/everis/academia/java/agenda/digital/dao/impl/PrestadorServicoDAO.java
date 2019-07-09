package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;

public class PrestadorServicoDAO implements IPrestadorServicoDAO {

	
	private static List<PrestadorServico> prestadordeservicos = new ArrayList<>();
	
	private static int id = 0;
	
	@Override
	public void create(PrestadorServico prestador) {
		
		id++;
		
		prestador.setCodigo(id);
		
		prestadordeservicos.add(prestador);
		
		
		
		
		

	}

	@Override
	public void update(PrestadorServico prestador) {
		

	}

	@Override
	public void delete(PrestadorServico prestador) {
		
	}

	@Override
	public List<PrestadorServico> read() {
		
		return null;
	}

}
