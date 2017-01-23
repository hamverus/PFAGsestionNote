package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.EtudiantDao;
import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Etudiant;
@Repository
public class EtudiantDaoImpl implements EtudiantDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Etudiant etudiant) {
		session.getCurrentSession().save(etudiant);

	}

	@Override
	public void edit(Etudiant etudiant) {
		session.getCurrentSession().update(etudiant);

	}

	@Override
	public void delete(int etudiantId) {
		session.getCurrentSession().delete(getEtudiant(etudiantId));

	}

	@Override
	public Etudiant getEtudiant(int etudiantId) {
		// TODO Auto-generated method stub
		return (Etudiant)session.getCurrentSession().get(Etudiant.class, etudiantId);
	}

	@Override
	public List getAllEtudiant() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From Etudiant").list();
	}

	@Override
	public Etudiant findUserByNumInsc(String numInsc) {
		Criteria criteria = session.getCurrentSession().createCriteria(Etudiant.class);
		criteria.add(Restrictions.eq("numInsc", numInsc));		
		return (Etudiant) criteria.uniqueResult();
	}

}
