package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.dao.impl.CidadeDAO;

public class CidadeBusiness implements ICidadeBusiness {

	private ICidadeDAO dao = new CidadeDAO();

	@Override
	public void create(Cidade cidade) throws BusinessException {

		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			System.out.println("primeiro");
			throw new BusinessException("Nome Obrigatório");

		}

		if (dao.jaExisteCidadeComNome(cidade.getNome())) {

			throw new BusinessException("Cidade já existe");

		}

		dao.create(cidade);

	}

	@Override
	public Collection<Cidade> read() {

		return dao.read();
	}

	@Override
	public void delete(Cidade cidade) {

		dao.delete(cidade);

	}

	@Override
	public void update(Cidade cidade) throws Exception {

		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigatório");
			
		

		}
		
			
		
		dao.update(cidade);

	}

	public CidadeBusiness() {
		super();

	}

}
