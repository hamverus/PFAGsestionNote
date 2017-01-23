package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.AbsenceDao;
import com.pfagestionnote.model.Absence;
import com.pfagestionnote.service.AbsenceService;

@Service
public class AbsenceServiceImpl implements AbsenceService {
    @Autowired
	private AbsenceDao absenceDao;
	
    @Transactional
	public void add(Absence absence) {
		absenceDao.add(absence);

	}

    @Transactional
	public void edit(Absence absence) {
		absenceDao.edit(absence);

	}

    @Transactional
	public void delete(int absenceId) {
		absenceDao.delete(absenceId);

	}

    @Transactional
	public Absence getAbsence(int absenceId) {
		
		return absenceDao.getAbsence(absenceId);
	}

    @Transactional
	public List getAllAbsence() {
		return absenceDao.getAllAbsence();
	}

}
