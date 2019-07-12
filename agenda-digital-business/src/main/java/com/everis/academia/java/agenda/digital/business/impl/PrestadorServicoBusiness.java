package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;


@Service
public class PrestadorServicoBusiness implements IPrestadorServicoBusiness {

	@Autowired
	private IPrestadorServicoDAO dao;
	
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void createPrestador(PrestadorServico prestador) throws BusinessException {
		
		dao.createPrestador(prestador);
	
	
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void updatePrestador(PrestadorServico prestador) {
		
		dao.updatePrestador(prestador);
		

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void deletePrestador(PrestadorServico prestador) {
		

		dao.deletePrestador(prestador);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<PrestadorServico> read() {
		
		return dao.readPrestador();
	}

}
