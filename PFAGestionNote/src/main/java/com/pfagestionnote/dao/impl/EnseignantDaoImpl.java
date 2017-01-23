package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.EnseignantDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Enseignant;
@Repository
public class EnseignantDaoImpl implements EnseignantDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Enseignant enseignant) {
		session.getCurrentSession().save(enseignant);

	}

	@Override
	public void edit(Enseignant enseignant) {
		session.getCurrentSession().update(enseignant);

	}

	@Override
	public void delete(int enseignantId) {
		session.getCurrentSession().delete(getEnseignant(enseignantId));

	}

	@Override
	public Enseignant getEnseignant(int enseignantId) {
		// TODO Auto-generated method stub
		return (Enseignant)session.getCurrentSession().get(Enseignant.class, enseignantId);
	}

	@Override
	public List getAllEnseignant() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From Enseignant").list();
	}

	@Override
	public Enseignant findUserByNumInsc(String numMatricule) {
		Criteria criteria = session.getCurrentSession().createCriteria(Enseignant.class);
		criteria.add(Restrictions.eq("numMatricule", numMatricule));		
		return (Enseignant) criteria.uniqueResult();
	}

}
