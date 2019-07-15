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
	@Transactional(propagation = Propagation.REQUIRED)
	public void createPrestador(PrestadorServico prestador) throws BusinessException {

		validacaoPrestador(prestador);

		dao.createPrestador(prestador);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updatePrestador(PrestadorServico prestador) throws BusinessException {

		validacaoPrestador(prestador);

		dao.updatePrestador(prestador);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void deletePrestador(PrestadorServico prestador) throws BusinessException {

		

		dao.deletePrestador(prestador);

	}

	@Override
	@Transactional(readOnly = true)
	public List<PrestadorServico> read() {

		return dao.readPrestador();
	}

	public void validacaoPrestador(PrestadorServico prestador) throws BusinessException {

		if (prestador.getNome() == null || prestador.getNome().trim().isEmpty()) {
			throw new BusinessException("Nome obrigatório para criar prestador!");
		}
		if (prestador.getCidade() == null) {
			throw new BusinessException("Cidade obrigatória para criar prestador!");
		}
		if (prestador.getBairro() == null || prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("Bairro obrigatório para criar prestador!");
		}
		if (prestador.getCep() == null || prestador.getCep().trim().isEmpty()) {
			throw new BusinessException("CEP obrigatório para criar prestador!");
		}

		if (prestador.getLogradouro() == null || prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("Logradouro obrigatório para criar prestador!");
		}

		if (prestador.getNumero() == null || prestador.getNumero().trim().isEmpty()) {
			throw new BusinessException("Numero obrigatório para criar prestador!");
		}
		if (prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("Email obrigatório para criar prestador!");

		}
		if (prestador.getServicosCredenciados().isEmpty())
			throw new BusinessException("Tipo de Serviço Obrigatório para criar prestador.");
	
	}

}
