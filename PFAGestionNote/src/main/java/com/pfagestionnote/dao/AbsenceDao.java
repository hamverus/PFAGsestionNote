package com.pfagestionnote.dao;

import java.util.List;

import com.pfagestionnote.model.Absence;

public interface AbsenceDao {
	public void add(Absence absence);
	public void edit(Absence absence);
	public void delete(int absenceId);
	public Absence getAbsence(int absenceId);
	public List getAllAbsence();

}
