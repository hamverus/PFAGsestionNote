package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.GroupeDao;
import com.pfagestionnote.model.Groupe;
@Repository
public class GroupeDaoImpl implements GroupeDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Groupe groupe) {
		session.getCurrentSession().save(groupe);

	}

	@Override
	public void edit(Groupe groupe) {
		session.getCurrentSession().update(groupe);

	}

	@Override
	public void delete(int groupeId) {
		session.getCurrentSession().delete(getGroupe(groupeId));

	}

	@Override
	public Groupe getGroupe(int groupeId) {
		// TODO Auto-generated method stub
		return (Groupe)session.getCurrentSession().get(Groupe.class, groupeId);
	}

	@Override
	public List getAllGroupe() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From Groupe").list();
	}

}
