package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;

@Repository
public class TipoServicoHibernateDAO implements ITipoServicoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createTipoServico(TipoServico tiposervico) {

		Session session = sessionFactory.getCurrentSession();
		session.save(tiposervico);
		session.flush();
	}

	@Override
	public void deleteTipoServico(TipoServico tiposervico) {

		Session session = sessionFactory.getCurrentSession();

		sessionFactory.getCurrentSession().delete(tiposervico);

	}

	@Override
	public void updateTipoServico(TipoServico tiposervico) {

		Session session = sessionFactory.getCurrentSession();

		session.update(tiposervico);
		session.flush();

	}

	@Override
	public List<TipoServico> readTipoServico() {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TipoServico.class);

		return criteria.list();
	}

}
