package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.ChefDepartementDao;
import com.pfagestionnote.model.ChefDepartement;
@Repository
public class ChefDepartementDaoImpl implements ChefDepartementDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(ChefDepartement chefDepartement) {
		session.getCurrentSession().save(chefDepartement);

	}

	@Override
	public void edit(ChefDepartement chefDepartement) {
		session.getCurrentSession().update(chefDepartement);
	}

	@Override
	public void delete(int chefDepartementId) {
		session.getCurrentSession().delete(getChefDepartement(chefDepartementId));

	}

	@Override
	public ChefDepartement getChefDepartement(int chefDepartementId) {
		
		return (ChefDepartement)session.getCurrentSession().get(ChefDepartement.class, chefDepartementId);
	}

	@Override
	public List getAllChefDepartement() {
		return session.getCurrentSession().createQuery("From ChefDepartement").list();
	}

	@Override
	public ChefDepartement findUserByNumInsc(String numMatricule) {
		Criteria criteria = session.getCurrentSession().createCriteria(ChefDepartement.class);
		criteria.add(Restrictions.eq("numMatricule", numMatricule));		
		return (ChefDepartement) criteria.uniqueResult();
	}

}
