package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.ReleveNoteDao;
import com.pfagestionnote.model.ReleveNote;

@Service
public class ReleveNoteServiceImpl implements ReleveNoteDao {
	@Autowired
	private ReleveNoteDao releveNoteDao;
	@Transactional
	public void add(ReleveNote releveNote) {
		releveNoteDao.add(releveNote);

	}

	
	@Transactional
	public void edit(ReleveNote releveNote) {
		releveNoteDao.edit(releveNote);

	}
	@Transactional
	public void delete(int releveNoteId) {
		releveNoteDao.delete(releveNoteId);
	}


	@Transactional
	public ReleveNote getReleveNote(int releveNoteId) {
		return releveNoteDao.getReleveNote(releveNoteId);
	}

	@Transactional
	public List getAllReleveNote() {
		return releveNoteDao.getAllReleveNote();
	}

}
