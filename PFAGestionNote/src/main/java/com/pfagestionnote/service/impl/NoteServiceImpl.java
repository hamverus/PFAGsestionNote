package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.NoteDao;
import com.pfagestionnote.model.Note;
@Service

public class NoteServiceImpl implements NoteDao{
	
	@Autowired
	private NoteDao noteDao;
	@Transactional
	public void add(Note note) {
		noteDao.add(note);
	}

	

	@Transactional
	public void edit(Note note) {
		noteDao.edit(note);
	}
	@Transactional
	public void delete(int noteId) {
		noteDao.delete(noteId);
	}

	@Transactional
	public Note getNote(int noteId) {
		
		return noteDao.getNote(noteId);
	}

	@Transactional
	public List getAllNote() {
		return noteDao.getAllNote();
	}


}
