package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.ReleveNote;


public interface ReleveNoteDao {
	public void add(ReleveNote releveNote);
	
	public void edit(ReleveNote section);
	public void delete(int releveNoteId);
	public ReleveNote getReleveNote(int releveNoteId);
	public List getAllReleveNote();

}
