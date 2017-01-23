package com.pfagestionnote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfagestionnote.dao.AdminDao;
import com.pfagestionnote.model.Admin;
import com.pfagestionnote.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;


	@Transactional
	public void add(Admin admin) {
		adminDao.add(admin);

	}

	@Transactional
	public void edit(Admin admin) {
		adminDao.edit(admin);

	}

	@Transactional
	public void delete(Admin admin) {
		adminDao.delete(admin);

	}

	@Transactional
	public Admin getAdmin(int adminId) {
		
		return adminDao.getAdmin(adminId);
	}

	@Transactional
	public List getAllAdmin() {
		
		return adminDao.getAllAdmin();
	}

	@Override
	public Admin getAdminByLogin(String userName) {
		return adminDao.getAdminByLogin(userName);
	}

}
