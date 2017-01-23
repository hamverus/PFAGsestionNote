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

import com.pfagestionnote.model.ChefDepartement;
import com.pfagestionnote.model.Enseignant;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.service.ChefDepartementService;
import com.pfagestionnote.service.EnseignantService;
import com.pfagestionnote.service.MatiereService;
import com.pfagestionnote.service.ModuleService;
import com.pfagestionnote.service.SectionService;
 
@Controller
public class ChefDepartementController {
     @Autowired
    private ChefDepartementService ChefDepartementService;
     @Autowired
     private MatiereService MatiereService;
     @Autowired
     private SectionService SectionService ;
     @Autowired
     private EnseignantService EnseignantService;
     @Autowired
     private ModuleService ModuleService;
     
     
     
    @RequestMapping(value = "/ChefDepartement", method = RequestMethod.GET)
    public String listChefDepartements(Model model) {
    	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
      	 String name=auth.getName();
       	ChefDepartement chefDep=new ChefDepartement();
       	 
       	 chefDep=ChefDepartementService.findUserByNumInsc(name);
        model.addAttribute("chefDepartement", chefDep);
        model.addAttribute("listChefDepartements", this.ChefDepartementService.getAllChefDepartement());
        return "accueilChefDepartement";
    }
     
    //For add
    @RequestMapping(value= "/ChefDepartement/add", method = RequestMethod.POST)
    public String addChefDepartement(@ModelAttribute("chefDepartement") ChefDepartement p){
            this.ChefDepartementService.add(p);

        return "redirect:/ChefDepartement";
         
    }
    
  //For edit
    @RequestMapping(value= "/ChefDepartement/edit", method = RequestMethod.POST)
    public String editChefDepartement(@ModelAttribute("chefDepartement") ChefDepartement p){
            this.ChefDepartementService.edit(p);

        return "redirect:/ChefDepartement";
         
    }
     
    @RequestMapping("/ChefDepartement/remove/{id}")
    public String removeChefDepartement(@PathVariable("id") int id){
         
        this.ChefDepartementService.delete(id);
        return "redirect:/ChefDepartement";
    }
  
    @RequestMapping("/ChefDepartement/edit/{id}")
    public String editEtudiant(@PathVariable("id") int id, Model model){
        model.addAttribute("etudiant", this.ChefDepartementService.getChefDepartement(id));
        model.addAttribute("listChefDepartements", this.ChefDepartementService.getAllChefDepartement());
        return "ChefDepartement";
    }

    @RequestMapping("/ChefDepartement/PlanEtude_section/affecter/matiere/{id}")
    public String affecterMatiere(@PathVariable("id") int id, Model model){
        model.addAttribute("matiere", this.MatiereService.getMatiere(id));
        model.addAttribute("enseignant", new Enseignant());
        model.addAttribute("listEnseignant", this.EnseignantService.getAllEnseignant());
        return "affecterEnseignant";
    }
    @RequestMapping("/ChefDepartement/PlanEtude_section/modifier/matiere/{id}")
    public String modifierMatiere(@PathVariable("id") int id, Model model){
        model.addAttribute("matiere", this.MatiereService.getMatiere(id));
        model.addAttribute("enseignant", new Enseignant());
        model.addAttribute("listEnseignant", this.EnseignantService.getAllEnseignant());
        return "affecterEnseignant";
    }
    
    @RequestMapping(value= "/ChefDepartement/PlanEtude_section/affecter", method = RequestMethod.POST)
    public String affecterEnseignant(@ModelAttribute("matiere") Matiere p){  
    	p.setModule(this.ModuleService.getModule(p.getModule().getId()));
    	p.setEnseignant(this.EnseignantService.getEnseignant(p.getmId()));
    	this.MatiereService.edit(p);
        return "redirect:/ChefDepartement/PlanEtude_section/"+this.SectionService.getSection(this.ModuleService.getModule(this.MatiereService.getMatiere(p.getId()).getModule().getId()).getsId()).getId();
         
    }
    
    public ChefDepartementService getChefDepartementService() {
		return ChefDepartementService;
	}

	public void setChefDepartementService(ChefDepartementService chefDepartementService) {
		ChefDepartementService = chefDepartementService;
	}
     
}