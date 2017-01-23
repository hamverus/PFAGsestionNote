package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.DepartementDao;
import com.pfagestionnote.model.Departement;
@Repository
public class DepartementDaoImp implements DepartementDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Departement departement) {
		session.getCurrentSession().save(departement);
	}

	@Override
	public void edit(Departement departement) {
		session.getCurrentSession().update(departement);

	}

	@Override
	public void delete(int departementId) {
		session.getCurrentSession().delete(getDepartement(departementId));
	}

	@Override
	public Departement getDepartement(int departementId) {
		// TODO Auto-generated method stub
		return (Departement)session.getCurrentSession().get(Departement.class, departementId);
	}

	@Override
	public List getAllDepartement() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From Departement").list();
	}

}
