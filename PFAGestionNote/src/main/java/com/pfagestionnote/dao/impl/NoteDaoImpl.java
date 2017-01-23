package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.NoteDao;
import com.pfagestionnote.model.Note;
@Repository
public class NoteDaoImpl implements NoteDao{
	
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Note note) {
		session.getCurrentSession().save(note);
	}

	

	@Override
	public void edit(Note note) {
		session.getCurrentSession().update(note);

	}
	@Override
	public void delete(int noteId) {
		session.getCurrentSession().delete(getNote(noteId));

	}

	@Override
	public Note getNote(int noteId) {
		
		return (Note)session.getCurrentSession().get(Note.class, noteId);
	}

	@Override
	public List getAllNote() {
		return session.getCurrentSession().createQuery("From Note").list();
	}


}
