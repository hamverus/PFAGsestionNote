package com.pfagestionnote.controller ;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.model.Module;
import com.pfagestionnote.model.Section;
import com.pfagestionnote.service.ModuleService;
import com.pfagestionnote.service.SectionService;
 
@Controller
public class ModuleController {
    
	@Autowired
    private ModuleService ModuleService;
    @Autowired
    private SectionService SectionService;
    
     
    @RequestMapping(value = "/ChefDepartement_Module", method = RequestMethod.GET)
    public String listModulesChefDepartement(Model model) {
        model.addAttribute("Module", new Module());
        model.addAttribute("listModules", this.ModuleService.getAllModule());
        return "contenuPlanEtude";
    }
    
    @RequestMapping(value = "/Etudiant_Module", method = RequestMethod.GET)
    public String listModulesEtudiant(Model model) {
        model.addAttribute("Module", new Module());
        model.addAttribute("listModules", this.ModuleService.getAllModule());
        return "etudiantModule";
    }
    
    //vers page d'ajout Module
    @RequestMapping(value="/ChefDepartement/PlanEtude_section/add/module/{sId}",method = RequestMethod.GET)
	public String accueilRedirection(@PathVariable("sId") int sId,Model model){

    	model.addAttribute("module", new Module(sId));

		return "moduleAdd";
	}
     
    //For add
    @RequestMapping(value= "/module/add", method = RequestMethod.POST)
    public String addModule(@ModelAttribute("module") Module p){
    	Section s = this.SectionService.getSection(p.getsId());
    		p.setSection(s);
            this.ModuleService.add(p);
        return "redirect:/ChefDepartement/PlanEtude_section/"+p.getsId();
         
    }
    
  //For update
    @RequestMapping(value= "/module/edit", method = RequestMethod.POST)
    public String editModule(@ModelAttribute("module") Module p){
    
            //existing Groupe, call update
            this.ModuleService.edit(p);
         
        return "redirect:/ChefDepartement_Module";
         
    }
     
    @RequestMapping("/module/remove/{id}")
    public String removeModule(@PathVariable("id") int id){
         
        this.ModuleService.delete(id);
        return "redirect:/ChefDepartement_Module";
    }
  
    @RequestMapping("/Module/edit/{id}")
    public String editModule(@PathVariable("id") int id, Model model){
        model.addAttribute("module", this.ModuleService.getModule(id));
        model.addAttribute("listModules", this.ModuleService.getAllModule());
        return "moduleEdit";
    }

	public ModuleService getModuleService() {
		return ModuleService;
	}

	public void setModuleService(ModuleService moduleService) {
		ModuleService = moduleService;
	}
     
}