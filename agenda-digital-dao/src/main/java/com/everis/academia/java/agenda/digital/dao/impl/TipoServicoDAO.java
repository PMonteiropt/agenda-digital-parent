package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;

@Repository
public class TipoServicoDAO implements ITipoServicoDAO {

	private static List<TipoServico> servicos = new ArrayList<>();
	
	private static short id = 0;
	
	@Override
	public void createTipoServico(TipoServico tiposervico) {
		
		id++;
		
		tiposervico.setCodigo(id);
		
		servicos.add(tiposervico);
		

	}

	@Override
	public void deleteTipoServico(TipoServico tiposervico) {
		
		servicos.remove(tiposervico);
	}

	@Override
	public void updateTipoServico(TipoServico tiposervico) {
		
		int indexOf = servicos.indexOf(tiposervico);
		servicos.set(indexOf, tiposervico);
	}

	@Override
	
	public List<TipoServico> readTipoServico() {
	
		return servicos;
	}

}
