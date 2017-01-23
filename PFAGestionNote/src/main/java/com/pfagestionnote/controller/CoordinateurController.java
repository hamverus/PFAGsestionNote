package com.pfagestionnote.controller ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.dao.UserDao;
import com.pfagestionnote.model.Coordinateur;
import com.pfagestionnote.service.CoordinateurService;
import com.pfagestionnote.service.DepartementService;
 
@Controller
public class CoordinateurController {
     @Autowired
    private CoordinateurService CoordinateurService;
     @Autowired
     private UserDao userDao;
    @Autowired
    DepartementService DepartementService;
     
    @RequestMapping(value = "/Coordinateur", method = RequestMethod.GET)
    public String listCoordinateurs(Model model) {
    	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
     	 String name=auth.getName();
      	Coordinateur coord=new Coordinateur();
      	 
      	 coord=CoordinateurService.findUserByNumInsc(name);
        model.addAttribute("coordinateur", coord);
        model.addAttribute("listCoordinateurs", this.CoordinateurService.getAllCoordinateur());
        return "accueilCoordinateur";
    }
    
    @RequestMapping(value = "/Coordinateur/matieres", method = RequestMethod.GET)
    public String matiereCoordinateur(Model model) {
        model.addAttribute("coordinateur", new Coordinateur());
        model.addAttribute("listCoordinateurs", this.CoordinateurService.getAllCoordinateur());
        return "matiereCoordinateur";
    }
    
    @RequestMapping(value = "/ChefDepartement_Coordinateur", method = RequestMethod.GET)
    public String listCoordinateursChefD(Model model) {
        model.addAttribute("coordinateur", new Coordinateur());
        model.addAttribute("listCoordinateurs", this.CoordinateurService.getAllCoordinateur());
        return "chefDepartementCoordinateur";
    }
    
  //vers page d'ajout coordinateur
    @RequestMapping(value="/add/coordinateur",method = RequestMethod.GET)
	public String addRedirection(Model model){
    	model.addAttribute("coordinateur", new Coordinateur());
		return "coordinateurAdd";
	}
     
    //For add
    @RequestMapping(value= "/coordinateur/add/", method = RequestMethod.POST)
    public String addCoordinateur(@ModelAttribute("coordinateur") Coordinateur p){
    	p.setDepartement(this.DepartementService.getDepartement(1));
            this.CoordinateurService.add(p); 
        return "redirect:/ChefDepartement_Coordinateur";
         
    }
    
  //For edit
    @RequestMapping(value= "/coordinateur/edit", method = RequestMethod.POST)
    public String editCoordinateur(@ModelAttribute("coordinateur") Coordinateur p){
            this.CoordinateurService.edit(p); 
        return "redirect:/ChefDepartement_Coordinateur";
         
    }
     
    @RequestMapping("/coordinateur/remove/{id}")
    public String removeCoordinateur(@PathVariable("id") int id){
         
        this.CoordinateurService.delete(id);
        return "redirect:/ChefDepartement_Coordinateur";
    }
  
    @RequestMapping("/coordinateur/edit/{id}")
    public String editEtudiant(@PathVariable("id") int id, Model model){
        model.addAttribute("coordinateur", this.CoordinateurService.getCoordinateur(id));
        model.addAttribute("listCoordinateurs", this.CoordinateurService.getAllCoordinateur());
        return "coordinateurEdit";
    }

    public CoordinateurService getCoordinateurService() {
		return CoordinateurService;
	}

	public void setCoordinateurService(CoordinateurService coordinateurService) {
		CoordinateurService = coordinateurService;
	}
     
}