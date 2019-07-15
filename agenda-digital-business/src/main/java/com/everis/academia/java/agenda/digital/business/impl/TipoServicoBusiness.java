package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;

@Service
public class TipoServicoBusiness implements ITipoServicoBusiness {

	@Autowired
	private ITipoServicoDAO dao;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void createTipoServico(TipoServico tiposervico) throws BusinessException {
		
		
		
		if(tiposervico.getDescricao()==null) {
			throw new BusinessException("Descrição Obrigatória");
		}
		
		
		dao.createTipoServico(tiposervico);
		
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteTipoServico(TipoServico tiposervico) throws BusinessException {
	
		if(tiposervico.getCodigo()==null) {
			throw new BusinessException("Codigo Obrigatório para eliminar Tipo de Serviço");
			
		}
		dao.deleteTipoServico(tiposervico);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void updateTipoServico(TipoServico tiposervico) throws BusinessException {
		
		if(tiposervico.getDescricao()==null||tiposervico.getDescricao().trim().isEmpty()) {
			throw new BusinessException("Descrição Obrigatória");
		}
		
		
		dao.updateTipoServico(tiposervico);
	}

	@Override
	@Transactional(readOnly=true)
	public List<TipoServico> readTipoServico() {
		
		return dao.readTipoServico();
	}

}
