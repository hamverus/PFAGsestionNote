package com.pfagestionnote.controller ;


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pfagestionnote.model.Groupe;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.model.PlanEtude;
import com.pfagestionnote.model.Section;
import com.pfagestionnote.service.MatiereService;
import com.pfagestionnote.service.ModuleService;
import com.pfagestionnote.service.PlanEtudeService;
import com.pfagestionnote.service.SectionService;
import com.pfagestionnote.model.Module;;
 
@Controller
public class PlanEtudeController {
    
	@Autowired
    private PlanEtudeService PlanEtudeService;
	@Autowired
	private SectionService SectionService;
    @Autowired
    private ModuleService ModuleService;
    @Autowired
    private MatiereService MatiereService;
    
    
	@RequestMapping(value = "/ChefDepartement/PlanEtude_section/{sId}", method = RequestMethod.GET)
    public String planEtudeSection(@PathVariable("sId") int sId,Model model) {
        model.addAttribute("planEtude", new PlanEtude());
        model.addAttribute("listPlanEtudes", this.PlanEtudeService.getAllPlanEtude());
        model.addAttribute("listModules",this.ModuleService.getModuleBySection(sId));
        model.addAttribute("section", this.SectionService.getSection(sId));
        model.addAttribute("module", new Module());
        model.addAttribute("matiere", new Matiere());
        model.addAttribute("listMatieres", this.MatiereService.getAllMatiere());
        return "contenuPlanEtude";
    }
	
	public String matiereModule(@PathVariable("id") int id,Model model){
		model.addAttribute("matiere", new Matiere());
        model.addAttribute("listMatieres", this.MatiereService.getMatiereByModule(id));
		return "matiereModule";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List listeMatieres(int moduleId){
		ArrayList<Matiere> listeMatieres = (ArrayList<Matiere>) MatiereService.getMatiereByModule(moduleId);
		
		return listeMatieres;
	}
	
    @RequestMapping(value = "/ChefDepartement_PlanEtude", method = RequestMethod.GET)
    public String listPlanEtudes(Model model) {
        model.addAttribute("planEtude", new PlanEtude());
        model.addAttribute("listPlanEtudes", this.PlanEtudeService.getAllPlanEtude());
        return "planEtude";
    }
    
    //vers page d'ajout PlanEtude
    @RequestMapping(value="/add/planEtude",method = RequestMethod.GET)
	public String accueilRedirection(Model model){
    	model.addAttribute("planEtude", new PlanEtude());
		return "planEtudeAdd";
	}
     
    //For add
    @RequestMapping(value= "/planEtude/add", method = RequestMethod.POST)
    public String addPlanEtude(@ModelAttribute("planEtude") PlanEtude p){
            this.PlanEtudeService.add(p);
         
        return "redirect:/ChefDepartement_PlanEtude";
   }
    
  //For update
    @RequestMapping(value= "/planEtude/edit", method = RequestMethod.POST)
    public String editPlanEtude(@ModelAttribute("planEtude") PlanEtude p){
    
            //existing Groupe, call update
            this.PlanEtudeService.edit(p);
         
        return "redirect:/ChefDepartement_PlanEtude";
         
    }
     
    @RequestMapping("/planEtude/remove/{id}")
    public String removePlanEtude(@PathVariable("id") int id){
         
        this.PlanEtudeService.delete(id);
        return "redirect:/ChefDepartement_PlanEtude";
    }
  
    @RequestMapping("/planEtude/edit/{id}")
    public String editPlanEtude(@PathVariable("id") int id, Model model){
        model.addAttribute("planEtude", this.PlanEtudeService.getPlanEtude(id));
        model.addAttribute("listPlanEtudes", this.PlanEtudeService.getAllPlanEtude());
        return "planEtudeEdit";
    }

	public PlanEtudeService getPlanEtudeService() {
		return PlanEtudeService;
	}

	public void setPlanEtudeService(PlanEtudeService planEtudeService) {
		PlanEtudeService = planEtudeService;
	}
     
}