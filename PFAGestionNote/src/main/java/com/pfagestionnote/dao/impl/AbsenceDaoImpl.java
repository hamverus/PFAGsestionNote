package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.AbsenceDao;
import com.pfagestionnote.model.Absence;
@Repository
public class AbsenceDaoImpl implements AbsenceDao {
    @Autowired
	private SessionFactory session;
	
    @Override
	public void add(Absence absence) {
		session.getCurrentSession().save(absence);

	}

    @Override
	public void edit(Absence absence) {
		session.getCurrentSession().update(absence);

	}

    @Override
	public void delete(int absenceId) {
		session.getCurrentSession().delete((getAbsence(absenceId)));

	}

    @Override
	public Absence getAbsence(int absenceId) {
		
		return (Absence)session.getCurrentSession().get(Absence.class, absenceId);
	}

    @Override
	public List getAllAbsence() {
		return session.getCurrentSession().createQuery("From Absence").list();
	}

}
