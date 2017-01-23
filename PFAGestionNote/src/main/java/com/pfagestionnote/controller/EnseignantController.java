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

import com.pfagestionnote.model.Enseignant;
import com.pfagestionnote.model.Etudiant;
import com.pfagestionnote.model.Groupe;
import com.pfagestionnote.model.Matiere;
import com.pfagestionnote.service.EnseignantService;
import com.pfagestionnote.service.EtudiantService;
import com.pfagestionnote.service.GroupeService;
import com.pfagestionnote.service.MatiereService;
 
@Controller
public class EnseignantController {
     @Autowired
     private EnseignantService EnseignantService;
     @Autowired
     private GroupeService GroupeService;
     @Autowired
     private EtudiantService EtudiantService;
     @Autowired
     private MatiereService MatiereService;
     
     @RequestMapping(value = "/Enseignant", method = RequestMethod.GET)
     public String enseignant(Model model) {
    	 Authentication auth=SecurityContextHolder.getContext().getAuthentication();
     	 String name=auth.getName();
      	Enseignant coord=new Enseignant();
      	 
      	 coord=EnseignantService.findUserByNumInsc(name);
         model.addAttribute("enseignant", coord);
         model.addAttribute("listEnseignants", this.EnseignantService.getAllEnseignant());
         return "accueilEnseignant";
     }
     @RequestMapping(value = "Enseignant/profile", method = RequestMethod.GET)
     public String etudiant(Model model) {
    	 Authentication auth=SecurityContextHolder.getContext().getAuthentication();
     	 String name=auth.getName();
      	Enseignant coord=new Enseignant();
      	 
      	 coord=EnseignantService.findUserByNumInsc(name);
         model.addAttribute("enseignant", coord);
         model.addAttribute("listEtudiants", this.EtudiantService.getAllEtudiant());

         return "enseignantProfile";
     }
     
     @RequestMapping(value = "/Enseignant/groupes", method = RequestMethod.GET)
     public String groupeEnseignant(Model model) {
         model.addAttribute("groupe", new Groupe());
         model.addAttribute("listGroupes", this.GroupeService.getAllGroupe());
         return "groupeEnseignant";
     }
     
     @RequestMapping(value = "/Enseignant/matieres", method = RequestMethod.GET)
     public String matiereEnseignant(Model model) {
    	 Authentication auth=SecurityContextHolder.getContext().getAuthentication();
     	 String name=auth.getName();
      	Enseignant coord=new Enseignant();
      	coord=EnseignantService.findUserByNumInsc(name);
      	 
         model.addAttribute("matiere", new Matiere());
         model.addAttribute("listMatieres", this.MatiereService.getMatiereByEnseignant(coord.getId()));
         return "matiereEnseignant";
     }
     
    @RequestMapping(value = "/Coordinateur_Enseignants", method = RequestMethod.GET)
    public String listEnseignants(Model model) {
        model.addAttribute("enseignant", new Enseignant());
        model.addAttribute("listEnseignants", this.EnseignantService.getAllEnseignant());
        return "enseignant";
    }
     
    //vers page d'ajout enseignant
    @RequestMapping(value="/add/enseignant",method = RequestMethod.GET)
	public String accueilRedirection(Model model){
    	model.addAttribute("enseignant", new Enseignant());
		return "enseignantAdd";
	}
    
    //For add
    @RequestMapping(value= "/enseignant/add", method = RequestMethod.POST)
    public String addEnseignant(@ModelAttribute("enseignant") Enseignant p){

            this.EnseignantService.add(p);

        return "redirect:/Coordinateur_Enseignants";
         
    }
    
  //For edit
    @RequestMapping(value= "/enseignant/edit", method = RequestMethod.POST)
    public String editEnseignant(@ModelAttribute("enseignant") Enseignant p){

            this.EnseignantService.edit(p);

        return "redirect:/Coordinateur_Enseignants";
         
    }
     
    @RequestMapping("/enseignant/remove/{id}")
    public String removeEsneignant(@PathVariable("id") int id){
         
        this.EnseignantService.delete(id);
        return "redirect:/Coordinateur_Enseignants";
    }
  
    @RequestMapping("/enseignant/edit/{id}")
    public String editEnseignants(@PathVariable("id") int id, Model model){
        model.addAttribute("enseignant", this.EnseignantService.getEnseignant(id));
        model.addAttribute("listEnseignants", this.EnseignantService.getAllEnseignant());
        return "enseignantEdit";
    }

	public EnseignantService getEnseignantService() {
		return EnseignantService;
	}

	public void setEnseignantService(EnseignantService enseignantService) {
		EnseignantService = enseignantService;
	}
     
}