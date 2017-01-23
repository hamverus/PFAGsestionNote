package com.pfagestionnote.controller ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.model.DirecteurEtude;
import com.pfagestionnote.model.Etudiant;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.model.Module;
import com.pfagestionnote.model.PlanEtude;
import com.pfagestionnote.model.Section;
import com.pfagestionnote.service.DirecteurEtudeService;
import com.pfagestionnote.service.MatiereService;
import com.pfagestionnote.service.ModuleService;
import com.pfagestionnote.service.PlanEtudeService;
import com.pfagestionnote.service.SectionService;
 
@Controller
public class DirecteurEtudeController {
    @Autowired
    private DirecteurEtudeService DirecteurEtudeService;
    @Autowired
    private SectionService SectionService;
    @Autowired
    private PlanEtudeService PlanEtudeService;
    @Autowired
    private ModuleService ModuleService;
    @Autowired
    private MatiereService MatiereService;
     
    @RequestMapping(value = "/DirecteurEtude", method = RequestMethod.GET)
    public String listDirecteurEtudes(Model model) {
    	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    	 String name=auth.getName();
     	DirecteurEtude coord=new DirecteurEtude();
     	 
     	 coord=DirecteurEtudeService.findUserByNumInsc(name);
        model.addAttribute("directeurEtude", coord);
        model.addAttribute("listDirecteurEtudes", this.DirecteurEtudeService.getAllDirecteurEtude());
        return "accueilDirecteurEtude";
    }
    @RequestMapping(value = "DirecteurEtude/Profile", method = RequestMethod.GET)
    public String etudiant(Model model) {
    	
        	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
        	 String name=auth.getName();
         	DirecteurEtude coord=new DirecteurEtude();
         	 
         	 coord=DirecteurEtudeService.findUserByNumInsc(name);
        model.addAttribute("directeurEtude", coord);
       

        return "directeurEtudeProfile";
    }
    
    @RequestMapping(value = "/DirecteurEtude/sections", method = RequestMethod.GET)
    public String listSections(Model model) {
        model.addAttribute("section", new Section());
        model.addAttribute("listSections", this.SectionService.getAllSection());
        return "sectionDE";
    }
    
    @RequestMapping(value = "/DirecteurEtude/PlanEtude_section/{sId}", method = RequestMethod.GET)
    public String planEtudeSection(@PathVariable("sId") int sId,Model model) {
        model.addAttribute("planEtude", new PlanEtude());
        model.addAttribute("listPlanEtudes", this.PlanEtudeService.getAllPlanEtude());
        model.addAttribute("listModules",this.ModuleService.getModuleBySection(sId));
        model.addAttribute("section", this.SectionService.getSection(sId));
        model.addAttribute("module", new Module());
        model.addAttribute("matiere", new Matiere());
        model.addAttribute("listMatieres", this.MatiereService.getAllMatiere());
        return "validerPlanEtude";
    }
	
    
    //For add
    @RequestMapping(value= "/DirecteurEtude/add", method = RequestMethod.POST)
    public String addDirecteurEtude(@ModelAttribute("directeurEtude") DirecteurEtude p){
            this.DirecteurEtudeService.add(p);

        return "redirect:/DirecteurEtude";
         
    }
    
  //For edit
    @RequestMapping(value= "/DirecteurEtude/edit", method = RequestMethod.POST)
    public String editDirecteurEtude(@ModelAttribute("directeurEtude") DirecteurEtude p){
            this.DirecteurEtudeService.edit(p);

        return "redirect:/DirecteurEtude";
         
    }
     
    @RequestMapping("/DirecteurEtude/remove/{id}")
    public String removeDirecteurEtude(@PathVariable("id") int id){
         
        this.DirecteurEtudeService.delete(id);
        return "redirect:/DirecteurEtude";
    }
  
    @RequestMapping("/DirecteurEtude/edit/{id}")
    public String editEtudiant(@PathVariable("id") int id, Model model){
        model.addAttribute("etudiant", this.DirecteurEtudeService.getDirecteurEtude(id));
        model.addAttribute("listDirecteurEtudes", this.DirecteurEtudeService.getAllDirecteurEtude());
        return "accueilDirecteurEtude";
    }

    public DirecteurEtudeService getDirecteurEtudeService() {
		return DirecteurEtudeService;
	}

	public void setDirecteurEtudeService(DirecteurEtudeService directeurEtudeService) {
		DirecteurEtudeService = directeurEtudeService;
	}
     
}