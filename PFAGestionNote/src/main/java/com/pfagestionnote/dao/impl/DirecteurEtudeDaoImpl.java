package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.DirecteurEtudeDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.DirecteurEtude;
@Repository
public class DirecteurEtudeDaoImpl implements DirecteurEtudeDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(DirecteurEtude directeurEtude) {
		session.getCurrentSession().save(directeurEtude);

	}

	@Override
	public void edit(DirecteurEtude directeurEtude) {
		session.getCurrentSession().update(directeurEtude);

	}

	@Override
	public void delete(int directeurEtudeId) {
		session.getCurrentSession().delete(getDirecteurEtude(directeurEtudeId));

	}

	@Override
	public DirecteurEtude getDirecteurEtude(int directeurEtudeId) {
		// TODO Auto-generated method stub
		return (DirecteurEtude)session.getCurrentSession().get(DirecteurEtude.class, directeurEtudeId);
				
	}

	@Override
	public List getAllDirecteurEtude() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From DirecteurEtude").list();
	}

	@Override
	public DirecteurEtude findUserByNumInsc(String numMatricule) {
		Criteria criteria = session.getCurrentSession().createCriteria(DirecteurEtude.class);
		criteria.add(Restrictions.eq("numMatricule", numMatricule));		
		return (DirecteurEtude) criteria.uniqueResult();
	}

}
