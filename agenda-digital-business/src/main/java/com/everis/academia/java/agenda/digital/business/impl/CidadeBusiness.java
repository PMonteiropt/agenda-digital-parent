package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;



import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.dao.impl.CidadeDAO;




public class CidadeBusiness implements ICidadeBusiness {

	
	
	@Override
	public void create(String nome) throws BusinessException {
		
		/*if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {				
			
			throw new BusinessException("Nome Obrigatório");
		}
		
		ICidadeDAO dao = null;
		
		if(dao.jaExisteCidadeComNome(cidade.getNome())) {
		
			
		}
		
		dao.create(cidade);*/
		ICidadeDAO dao = null;
		
		Cidade cidade = new Cidade();
		
		if(cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {				
			
			throw new BusinessException("Nome Obrigatório");
		}
		
		if(dao.jaExisteCidadeComNome(cidade.getNome())) {
		
			
		}
		
		dao.create(cidade);
		
		
	
	}
	
	@Override
	public Collection<Cidade> read() {
		
		return null;
	}

	@Override
	public void delete(String nome) {
		
		
		
		
		ICidadeDAO dao2 = null;
		
		if(dao2.jaExisteCidadeComNome(nome)) {
			dao2.delete(nome);
		}else {
			System.out.println("Não existe");
		}
		
		
		
		
		
	}

	@Override
	public void update (Cidade cidade) throws Exception {
	
		
		
		if(cidade.getNome()==null || cidade.getNome().trim().isEmpty()) {
			
			throw new BusinessException("Nome Obrigatório");
			
		}
		
		ICidadeDAO dao1 = null;
		
		if(dao1.jaExisteCidadeComNome(cidade.getNome())) {
			
			
		}
		dao1.update(cidade);
		
		
		
		
				
			
			}	
		
	
	
	public CidadeBusiness() {
		super();
	
	}

	

}
