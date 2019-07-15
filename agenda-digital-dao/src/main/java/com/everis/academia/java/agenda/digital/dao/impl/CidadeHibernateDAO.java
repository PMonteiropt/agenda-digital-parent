package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;

@Repository
public class CidadeHibernateDAO implements ICidadeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Cidade cidade) {

		Session session = sessionFactory.getCurrentSession();
		session.save(cidade);
		session.flush();

	}

	@Override
	public List<Cidade> read() {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Cidade.class);

		return criteria.list();

	}

	@Override
	public void update(Cidade cidade) throws Exception {

		Session session = sessionFactory.getCurrentSession();

		session.update(cidade);
		session.flush();

	}

	@Override
	public Boolean jaExisteCidadeComNome(Cidade cidade) {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Cidade.class);

		criteria.add(Restrictions.eq("nome", cidade.getNome()).ignoreCase());

		criteria.setProjection(Projections.count("codigo"));

		return (Long) criteria.uniqueResult() > 0;

	}

	@Override
	public void delete(Cidade cidade) {

		Session session = sessionFactory.getCurrentSession();

		sessionFactory.getCurrentSession().delete(cidade);

	}

	@Override
	public Cidade search(String nome) {

		return null;
	}

}
