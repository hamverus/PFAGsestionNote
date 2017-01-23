package com.pfagestionnote.service;

import java.util.List;

import com.pfagestionnote.model.Admin;

public interface AdminService {
	
	public void add(Admin admin);
	public void edit(Admin admin);
	public void delete(Admin admin);
	public Admin getAdmin(int adminId);
	public Admin getAdminByLogin(String userName);
	public List getAllAdmin();

}
