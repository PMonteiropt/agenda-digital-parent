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
		

	}

	@Override
	public void deleteTipoServico() {
		

	}

	@Override
	public void updateTipoServico() {
		

	}

	@Override
	public void readTipoServico() {
	

	}

}
