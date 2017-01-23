package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.Section;

public interface SectionService {
	public void add(Section section);
	
	public void edit(Section section);
	public void delete(int section);
	public Section getSection(int sectionId);
	public List getAllSection();

}
