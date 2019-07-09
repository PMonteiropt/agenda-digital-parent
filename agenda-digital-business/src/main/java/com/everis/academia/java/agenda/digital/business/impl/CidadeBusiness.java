package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.dao.impl.CidadeDAO;

public class CidadeBusiness implements ICidadeBusiness {

	private ICidadeDAO dao = new CidadeDAO();

	@Override
	public void create(Cidade cidade) throws BusinessException {

		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigat�rio");

		}

		if (dao.jaExisteCidadeComNome(cidade.getNome())) {

			throw new BusinessException("Cidade j� existe");

		}

		dao.create(cidade);

	}

	@Override

	public List<Cidade> read() {

		return dao.read();
	}

	@Override
	public void delete(Cidade cidade) throws BusinessException {

		if(cidade.getCodigo()==null) {
			
			throw new BusinessException("O codigo � obrigat�rio para Remover Cidade");
		}
		
		
		dao.delete(cidade);

	}

	@Override
	public void update(Cidade cidade) throws Exception {

		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {
			throw new BusinessException("Nome Obrigat�rio");
		}

		/// query para ver se existe cidade na lista
		//if (dao.search(cidade.getNome()) != null) {
			dao.update(cidade);
		}

	

	public CidadeBusiness() {
		super();

	}

}
