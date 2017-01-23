package com.pfagestionnote.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pfagestionnote.dao.AdminDao;
import com.pfagestionnote.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	private SessionFactory session;
	@Override
	public void add(Admin admin) {
		session.getCurrentSession().save(admin);

	}

	@Override
	public void edit(Admin admin) {
		session.getCurrentSession().update(admin);

	}

	@Override
	public void delete(Admin admin) {

	}

	@Override
	public Admin getAdmin(int adminId) {
		return (Admin)session.getCurrentSession().get(Admin.class, adminId);
	}

	@Override
	public List getAllAdmin() {
		return session.getCurrentSession().createQuery("From Admin").list();
	}

	@Override
	public Admin getAdminByLogin(String userName) {
		return (Admin)session.getCurrentSession().get(Admin.class, userName);
		
	}

}
