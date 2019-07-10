package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;

@Service
public class TipoServicoBusiness implements ITipoServicoBusiness {

	@Autowired
	private ITipoServicoDAO daotipo;
	
	
	@Override
	public void createTipoServico(TipoServico tiposervico) throws BusinessException {
		
		
		
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
