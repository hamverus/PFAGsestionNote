package com.pfagestionnote.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pfagestionnote.dao.UserDao;
import com.pfagestionnote.model.Role;
import com.pfagestionnote.model.User;

@Controller
public class RedirectionController {
	@Autowired
	private UserDao userDao;
			
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String urlRedirection(Model model){
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		 String name=auth.getAuthorities().toString();
		switch (name) {
		case "[Admin]":	return "";
		case "[Etudiant]":	return "redirect:/Etudiant";
		case "[Enseignant]":	return "redirect:/Enseignant";
		case "[Coordinateur]":	return "redirect:/Coordinateur";
		case "[ChefDepartement]":	return "redirect:/ChefDepartement";
		case "[DirecteurEtude]":	return "redirect:/DirecteurEtude";

		default:
			return "accueil";
		}
		 
		
	}
	
	@RequestMapping(value="/403",method = RequestMethod.GET)
	public String accessdenied(Model model){
		return "403";
	}

}
