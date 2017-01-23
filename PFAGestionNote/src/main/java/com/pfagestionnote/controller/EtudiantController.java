package com.pfagestionnote.controller ;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pfagestionnote.model.Etudiant;
import com.pfagestionnote.model.Groupe;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.service.EtudiantService;
import com.pfagestionnote.service.GroupeService;
import com.pfagestionnote.service.MatiereService;
 
@Controller
public class EtudiantController {
    @Autowired
    private EtudiantService EtudiantService;
	@Autowired
	private GroupeService GroupeService;
	
	@Autowired
	private MatiereService MatiereService;
	
	@RequestMapping(value = "Etudiant", method = RequestMethod.GET)
	public String accueilEtudiant(Model model){
		return "accueilEtudiant";
	}
	
	@RequestMapping(value = "Etudiant/profile", method = RequestMethod.GET)
    public String etudiant(Model model) {
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    	 String name=auth.getName();
     	Etudiant coord=new Etudiant();
     	 
     	 coord=EtudiantService.findUserByNumInsc(name);
        model.addAttribute("etudiant", coord);
        model.addAttribute("listEtudiants", this.EtudiantService.getAllEtudiant());

        return "etudiantProfile";
    }
	
	@RequestMapping(value = "Coordinateur_Etudiants", method = RequestMethod.GET)
    public String listEtudiants(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        model.addAttribute("listEtudiants", this.EtudiantService.getAllEtudiant());

        return "etudiant";
    }
    
    //vers page d'ajout etudiant
	@RequestMapping(value="/add/etudiant",method = RequestMethod.GET)
	public String accueilRedirection(Model model){
    	model.addAttribute("etudiant", new Etudiant());
    	model.addAttribute("groupe", new Groupe());
    	@SuppressWarnings("unchecked")
		ArrayList<Groupe> Groupes = (ArrayList<Groupe>) GroupeService.getAllGroupe();
    	model.addAttribute("Groupes", Groupes);
		return "etudiantAdd";
	}
     
    //For add
    @RequestMapping(value= "/etudiant/add/", method = RequestMethod.POST)
    public String addEtudiant(@ModelAttribute("etudiant") Etudiant p){    
    	p.setGroupe(this.GroupeService.getGroupe(p.getgId()));
    	this.EtudiantService.add(p);
        return "redirect:/Coordinateur_Etudiants";
         
    }
    
  //For edit
    @RequestMapping(value= "/etudiant/edit", method = RequestMethod.GET)
    public String editEtudiant(@ModelAttribute("etudiant") Etudiant p){

            this.EtudiantService.edit(p);
         
        return "redirect:/Coordinateur_Etudiants";
         
    }
     
    @RequestMapping("/etudiant/remove/{id}")
    public String removeEtudiant(@PathVariable("id") int id){
         
        this.EtudiantService.delete(id);
        return "redirect:/Coordinateur_Etudiants";
    }
  
    @RequestMapping("/etudiant/edit/{id}")
    public String editEtudiant(@PathVariable("id") int id, Model model){
        model.addAttribute("etudiant", this.EtudiantService.getEtudiant(id));
        model.addAttribute("listEtudiants", this.EtudiantService.getAllEtudiant());
        return "etudiantEdit";
    }
    @RequestMapping(value = "/Etudiant_Matiere", method = RequestMethod.GET)
    public String listMatieresEtudiant(Model model) {
        model.addAttribute("matiere", new Matiere());
        model.addAttribute("listMatieres", this.MatiereService.getAllMatiere());
        return "etudiantMatiere";
    }

	public EtudiantService getEtudiantService() {
		return EtudiantService;
	}

	public void setEtudiantService(EtudiantService etudiantService) {
		EtudiantService = etudiantService;
	}
     
}