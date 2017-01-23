package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.ReleveNote;


public interface ReleveNoteService {
	public void add(ReleveNote releveNote);
	
	public void edit(ReleveNote section);
	public void delete(int releveNoteId);
	public ReleveNote getReleveNote(int releveNoteId);
	public List getAllReleveNote();

}
