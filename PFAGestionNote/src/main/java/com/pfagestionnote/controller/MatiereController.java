package com.pfagestionnote.controller ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.model.Module;
import com.pfagestionnote.service.MatiereService;
import com.pfagestionnote.service.ModuleService;
import com.pfagestionnote.service.SectionService;

@Controller
public class MatiereController {
    
	@Autowired
    private MatiereService MatiereService;
    @Autowired
    private ModuleService ModuleService;
    @Autowired
    private SectionService SectionService;
    
     
    @RequestMapping(value = "/ChefDepartement_Matiere", method = RequestMethod.GET)
    public String listMatieresChefDepartement(Model model) {
        model.addAttribute("matiere", new Matiere());
        model.addAttribute("listMatieres", this.MatiereService.getAllMatiere());
        return "matiere";
    }
    
   
    
    //vers page d'ajout Matiere
    @RequestMapping(value="/ChefDepartement/PlanEtude_section/add/matiere/{mId}",method = RequestMethod.GET)
	public String accueilRedirection(@PathVariable("mId") int mId,Model model){
    	model.addAttribute("matiere", new Matiere(mId));
		return "matiereAdd";
	}
     
    //For add
    @RequestMapping(value= "/matiere/add", method = RequestMethod.POST)
    public String addMatiere(@ModelAttribute("matiere") Matiere p){
    		Module m = this.ModuleService.getModule(p.getmId());
    		p.setModule(m);
            this.MatiereService.add(p);
         
        return "redirect:/ChefDepartement/PlanEtude_section/"+this.SectionService.getSection(this.ModuleService.getModule(p.getmId()).getsId()).getId();
         
    }
    
  //For update
    @RequestMapping(value= "/matiere/edit", method = RequestMethod.POST)
    public String editMatiere(@ModelAttribute("matiere") Matiere p){
    
            //existing Groupe, call update
            this.MatiereService.edit(p);
         
        return "redirect:/ChefDepartement_Matiere";
         
    }
     
    @RequestMapping("/matiere/remove/{id}")
    public String removeMatiere(@PathVariable("id") int id){
         
        this.MatiereService.delete(id);
        return "redirect:/ChefDepartement_Matiere";
    }
  
    @RequestMapping("/matiere/edit/{id}")
    public String editMatiere(@PathVariable("id") int id, Model model){
        model.addAttribute("matiere", this.MatiereService.getMatiere(id));
        model.addAttribute("listMatieres", this.MatiereService.getAllMatiere());
        return "matiereEdit";
    }

	public MatiereService getMatiereService() {
		return MatiereService;
	}

	public void setMatiereService(MatiereService matiereService) {
		MatiereService = matiereService;
	}
     
}