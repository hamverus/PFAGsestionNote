package com.pfagestionnote.controller ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 



import com.pfagestionnote.model.Groupe;
import com.pfagestionnote.service.GroupeService;
import com.pfagestionnote.service.SectionService;

 
@Controller
public class GroupeController {
    @Autowired
    private GroupeService GroupeService;
    @Autowired
    private SectionService SectionService;
    

     
     @RequestMapping(value = "/Coordinateur_Groupes", method = RequestMethod.GET)
     public String listGroupes(Model model) {
    	 model.addAttribute("groupe", new Groupe());
         model.addAttribute("listGroupes", this.GroupeService.getAllGroupe());
         return "groupe";
     }
     
     //vers page d'ajout groupe
     @RequestMapping(value="/add/groupe",method = RequestMethod.GET)
 	public String addGroupeRedirection(Model model){
     	model.addAttribute("groupe", new Groupe());
 		return "groupeAdd";
 	}
     
    //For add
    @RequestMapping(value= "/groupe/add", method = RequestMethod.POST)
    public String addGroupe(@ModelAttribute("groupe") Groupe p){

            //existing Groupe, call update
            this.GroupeService.add(p);
         
        return "redirect:/Coordinateur_Groupes";
         
    }
    
  //For edit
    @RequestMapping(value= "/groupe/edit", method = RequestMethod.POST)
    public String editGroupe(@ModelAttribute("groupe") Groupe p){

            //existing Groupe, call update
            this.GroupeService.edit(p);
         
        return "redirect:/Coordinateur_Groupes";
         
    }
     
    @RequestMapping("/groupe/remove/{id}")
    public String removeGroupe(@PathVariable("id") int id){
         
        this.GroupeService.delete(id);
        return "redirect:/Coordinateur_Groupes";
    }
  
    @RequestMapping("/groupe/edit/{id}")
    public String editGroupe(@PathVariable("id") int id, Model model){
        model.addAttribute("groupe", this.GroupeService.getGroupe(id));
        model.addAttribute("listGroupes", this.GroupeService.getAllGroupe());
        return "groupeEdit";
    }

	public GroupeService getGroupeService() {
		return GroupeService;
	}

	public void setGroupeService(GroupeService groupeService) {
		GroupeService = groupeService;
	}
     
}