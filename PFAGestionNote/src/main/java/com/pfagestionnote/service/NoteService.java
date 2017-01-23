package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.Note;



public interface NoteService {
	public void add(Note note);
	public void edit(Note note);
	public void delete(int noteId);
	public Note getNote(int noteId);
	public List getAllNote();
}
