package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;

@Service
public class CidadeBusiness implements ICidadeBusiness {

	@Autowired
	private ICidadeDAO dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void create(Cidade cidade) throws BusinessException {

		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigatório");

		}

		

		dao.create(cidade);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cidade> read() {

		return dao.read();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Cidade cidade) throws BusinessException {

		if (cidade.getCodigo() == null) {

			throw new BusinessException("O codigo é obrigatório para Remover Cidade");
		}

		dao.delete(cidade);

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(Cidade cidade) throws Exception {

		//if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
		//	throw new BusinessException("Nome Obrigatório");
		//}

		
		dao.update(cidade);
	}

	public CidadeBusiness() {
		super();

	}

}
