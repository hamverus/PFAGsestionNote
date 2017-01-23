package com.pfagestionnote.controller ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.model.PlanEtude;
import com.pfagestionnote.model.Section;
import com.pfagestionnote.service.SectionService;
import com.pfagestionnote.service.PlanEtudeService;
 
@Controller
public class SectionController {
    
	@Autowired
    private SectionService SectionService;
	@Autowired
    private PlanEtudeService PlanEtudeService;
     
    
     
    @RequestMapping(value = "/ChefDepartement_Section", method = RequestMethod.GET)
    public String listSections(Model model) {
        model.addAttribute("section", new Section());
        model.addAttribute("listSections", this.SectionService.getAllSection());
        return "section";
    }
    
    //vers page d'ajout section
    @RequestMapping(value="/add/section",method = RequestMethod.GET)
	public String accueilRedirection(Model model){
    	model.addAttribute("section", new Section());
		return "sectionAdd";
	}
     
    //For add
    @RequestMapping(value= "/section/add", method = RequestMethod.POST)
    public String addSection(@ModelAttribute("section") Section p){
         
        
            //new Section, add it
            this.SectionService.add(p);
         
        return "redirect:/ChefDepartement_Section";
         
    }
    
  //For update
    @RequestMapping(value= "/section/edit", method = RequestMethod.POST)
    public String editSection(@ModelAttribute("section") Section p){
    
            //existing Groupe, call update
            this.SectionService.edit(p);
         
        return "redirect:/ChefDepartement_Section";
         
    }
     
    @RequestMapping("/section/remove/{id}")
    public String removeSection(@PathVariable("id") int id){
         
        this.SectionService.delete(id);
        return "redirect:/ChefDepartement_Section";
    }
  
    @RequestMapping("/section/edit/{id}")
    public String editSection(@PathVariable("id") int id, Model model){
        model.addAttribute("section", this.SectionService.getSection(id));
        model.addAttribute("listSections", this.SectionService.getAllSection());
        return "sectionEdit";
    }

	public SectionService getSectionService() {
		return SectionService;
	}

	public void setSectionService(SectionService sectionService) {
		SectionService = sectionService;
	}
     
	
	 //vers page d'ajout PlanEtude
    @RequestMapping(value="/add/planEtude/{sId}")
	public String addPE(@PathVariable("sId") int sId,Model model){
    	model.addAttribute("planEtude", new PlanEtude(sId));
		return "creerPlanEtude";
	}
     
    //For add
    @RequestMapping(value= "/planEtude/creer", method = RequestMethod.POST)
    public String addPlanEtude(@ModelAttribute("planEtude") PlanEtude p){
    		Section s = this.SectionService.getSection(p.getsId());
            this.PlanEtudeService.add(p);
            s.setPlanEtude(p);
    		this.SectionService.edit(s);
         
        return "redirect:/ChefDepartement_PlanEtude";
   }
}