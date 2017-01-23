package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.SectionDao;
import com.pfagestionnote.model.Section;
import com.pfagestionnote.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService{
	@Autowired
	private SectionDao sectionDao;
	@Transactional
	public void add(Section section) {
		sectionDao.add(section);
		
	}

	

	@Transactional
	public void edit(Section section) {
		sectionDao.edit(section);
		
	}
	@Transactional
	public void delete(int sectionId) {
		sectionDao.delete(sectionId);;
		
	}
	
	@Transactional
	public Section getSection(int sectionId) {
		
		return sectionDao.getSection(sectionId);
	}

	@Transactional
	public List getAllSection() {
		
		return sectionDao.getAllSection();
	}


}
