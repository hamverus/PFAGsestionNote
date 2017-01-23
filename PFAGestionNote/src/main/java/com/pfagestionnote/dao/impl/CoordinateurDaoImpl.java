package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.CoordinateurDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Coordinateur;
@Repository
public class CoordinateurDaoImpl implements CoordinateurDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Coordinateur coordinateur) {
		session.getCurrentSession().save(coordinateur);
	}

	@Override
	public void edit(Coordinateur coordinateur) {
		session.getCurrentSession().update(coordinateur);

	}

	@Override
	public void delete(int coordinateurId) {
		session.getCurrentSession().delete(getCoordinateur(coordinateurId));

	}

	
	@Override
	public Coordinateur getCoordinateur(int coordinateurId) {
		
		return (Coordinateur)session.getCurrentSession().get(Coordinateur.class, coordinateurId);
	}

	@Override
	public List getAllCoordinateur() {
		
		return session.getCurrentSession().createQuery("From Coordinateur").list();
	}

	@Override
	public Coordinateur findUserByNumInsc(String numMatricule) {
		Criteria criteria = session.getCurrentSession().createCriteria(Coordinateur.class);
		criteria.add(Restrictions.eq("numMatricule", numMatricule));		
		return (Coordinateur) criteria.uniqueResult();
	}

}
