package com.everis.academia.java.agenda.digital.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;

@Service
public class PrestadorServicoBusiness implements IPrestadorServicoBusiness {

	@Autowired
	private IPrestadorServicoDAO daoprestador;
	
	
	@Override
	public void createPrestador(PrestadorServico prestador) throws BusinessException {
		
		if(prestador.getNome()==null||prestador.getNome().trim().isEmpty()) {
			throw new BusinessException("Nome Obrigatório");
			
		}
		if(prestador.getBairro()==null||prestador.getBairro().trim().isEmpty()) {
			throw new BusinessException("Bairro Obrigatório");
			
		}
		if(prestador.getCep()==null) {
			
			throw new BusinessException("CEP Obrigatório");
			
		}
	
		if(prestador.getLogradouro()==null||prestador.getLogradouro().trim().isEmpty()) {
			throw new BusinessException("Logradouro Obrigatório");
		}
		if(prestador.getNumero()==null) {
			throw new BusinessException("Numero Obrigatório");
		}
		if(prestador.getEmail()==null||prestador.getEmail().trim().isEmpty()) {
			throw new BusinessException("Email Obrigatório");
			}
		daoprestador.create(prestador);
	
	
	
	}

	@Override
	public void updatePrestador(PrestadorServico prestador) {
	

	}

	@Override
	public void deletePrestador(PrestadorServico prestador) {
		

	}

	@Override
	public List<PrestadorServico> read() {
		
		return null;
	}

}
