package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.dao.impl.TipoServicoDAO;

public class TipoServicoBusiness implements ITipoServicoBusiness {

	private ITipoServicoDAO daotipo = new TipoServicoDAO();
	
	
	@Override
	public void createTipoServico(TipoServico tiposervico) throws BusinessException {
		
		if(tiposervico.getCodigo()==null) {	
			throw new BusinessException("Codigo Obrigatório");
		
		}
		
		if(tiposervico.getDescricao()==null) {
			throw new BusinessException("Descrição Obrigatória");
		}
		
		
		daotipo.createTipoServico(tiposervico);
		
		
	}

	@Override
	public void deleteTipoServico(TipoServico tiposervico) throws BusinessException {
	
		if(tiposervico.getCodigo()==null) {
			throw new BusinessException("Codigo Obrigatório para eliminar Tipo de Serviço");
			
		}
		daotipo.deleteTipoServico(tiposervico);
	}

	@Override
	public void updateTipoServico(TipoServico tiposervico) {
		
		daotipo.updateTipoServico(tiposervico);
	}

	@Override
	public List<TipoServico> readTipoServico() {
		
		return daotipo.readTipoServico();
	}

}
