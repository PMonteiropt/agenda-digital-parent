package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;

public class TipoServicoDAO implements ITipoServicoDAO {

	private static List<TipoServico> tiposervicos = new ArrayList<>();
	
	private static short id = 0;
	
	@Override
	public void createTipoServico(TipoServico tiposervico) {
		
		id++;
		
		tiposervico.setCodigo(id);
		
		tiposervicos.add(tiposervico);
		

	}

	@Override
	public void deleteTipoServico(TipoServico tiposervico) {
		
		tiposervicos.remove(tiposervico);
	}

	@Override
	public void updateTipoServico(TipoServico tiposervico) {
		
		int indexOf = tiposervicos.indexOf(tiposervico);
		tiposervicos.set(indexOf, tiposervico);
	}

	@Override
	
	public List<TipoServico> readTipoServico() {
	
		return tiposervicos;
	}

}
