package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.ReleveNoteDao;
import com.pfagestionnote.model.ReleveNote;

@Repository
public class ReleveNoteDaoImpl implements ReleveNoteDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void add(ReleveNote releveNote) {
		session.getCurrentSession().save(releveNote);

	}

	

	@Override
	public void edit(ReleveNote releveNote) {
		session.getCurrentSession().update(releveNote);

	}
	@Override
	public void delete(int releveNoteId) {
		session.getCurrentSession().delete(getReleveNote(releveNoteId));
	}

	@Override
	public ReleveNote getReleveNote(int releveNoteId) {
		return (ReleveNote)session.getCurrentSession().get(ReleveNote.class, releveNoteId);
	}

	@Override
	public List getAllReleveNote() {
		return session.getCurrentSession().createQuery("From ReleveNote").list();
	}

}
