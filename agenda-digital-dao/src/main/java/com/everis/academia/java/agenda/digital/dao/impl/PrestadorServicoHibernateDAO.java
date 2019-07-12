package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;

@Repository
public class PrestadorServicoHibernateDAO implements IPrestadorServicoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createPrestador(PrestadorServico prestador) {
		
			Session session=sessionFactory.getCurrentSession();
			session.save(prestador);
			session.flush();
	
	}

	@Override
	public void updatePrestador(PrestadorServico prestador) {
		

		Session session=sessionFactory.getCurrentSession();
		session.update(prestador);
		session.flush();
		
		
	}

	@Override
	public void deletePrestador(PrestadorServico prestador) {
	
		
		Session session = sessionFactory.getCurrentSession();

		sessionFactory.getCurrentSession().delete(prestador);

	}

	@Override
	public List<PrestadorServico> readPrestador() {
		
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(PrestadorServico.class);

		return criteria.list();
	}

}
