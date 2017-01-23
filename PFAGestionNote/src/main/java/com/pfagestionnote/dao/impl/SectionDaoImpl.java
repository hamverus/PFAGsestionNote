package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.SectionDao;
import com.pfagestionnote.model.Section;

@Repository
public class SectionDaoImpl implements SectionDao{
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Section section) {
		session.getCurrentSession().save(section);
		
	}

	

	@Override
	public void edit(Section section) {
		session.getCurrentSession().update(section);
		
	}
	@Override
	public void delete(int sectionId) {
		session.getCurrentSession().delete(getSection(sectionId));
		
	}
	
	@Override
	public Section getSection(int sectionId) {
		
		return (Section)session.getCurrentSession().get(Section.class, sectionId);
	}

	@Override
	public List getAllSection() {
		
		return session.getCurrentSession().createQuery("From Section").list();
	}


}
