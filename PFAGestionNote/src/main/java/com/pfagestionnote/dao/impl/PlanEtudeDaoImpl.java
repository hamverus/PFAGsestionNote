package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.PlanEtudeDao;
import com.pfagestionnote.model.PlanEtude;

@Repository
public class PlanEtudeDaoImpl implements PlanEtudeDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(PlanEtude planEtude) {
		session.getCurrentSession().save(planEtude);

	}

	

	@Override
	public void edit(PlanEtude planEtude) {
		session.getCurrentSession().update(planEtude);

	}
	@Override
	public void delete(int planEtudeId) {
		session.getCurrentSession().delete(getPlanEtude(planEtudeId));

	}

	@Override
	public PlanEtude getPlanEtude(int planEtudeId) {
		
		return (PlanEtude)session.getCurrentSession().get(PlanEtude.class, planEtudeId);
	}

	@Override
	public List getAllPlanEtude() {
		return session.getCurrentSession().createQuery("From PlanEtude").list();
	}

}
