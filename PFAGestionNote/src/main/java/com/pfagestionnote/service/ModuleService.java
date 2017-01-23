package com.pfagestionnote.service;

import java.util.List;



import com.pfagestionnote.model.Module;



public interface ModuleService {
	public void add(Module module);
	public void edit(Module module);
	public void delete(int moduleId);
	public Module getModule(int moduleId);
	public List getAllModule();
	public List getModuleBySection(int sectionId);

}
