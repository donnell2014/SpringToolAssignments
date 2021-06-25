package com.albertie.ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertie.ninjas.models.Dojo;
import com.albertie.ninjas.models.Ninja;
import com.albertie.ninjas.services.AppService;

@Controller
public class DojoController {
	
	private final AppService appService;
	
	public DojoController(AppService appService) {
		this.appService = appService;
	}
	
	@GetMapping("/")
	public String dojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		List<Dojo> allDojos = this.appService.findAllTeams();
		model.addAttribute("allDojos", allDojos);
		return "index.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			this.appService.createDojo(dojo);
			return"redirect:/";
		}
	}
	
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja n, Model model) {
		List<Dojo> allDojos = this.appService.findAllTeams();
		model.addAttribute("allDojos", allDojos);
		return "NewNinja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "NewNinja.jsp";
		}else {
			this.appService.newNinja(ninja);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojo/{id}/info")
	public String dojoInfo(@PathVariable("id") Long id, Model model) {
		Dojo d = this.appService.dojoInfo(id);
		
		model.addAttribute("dojo", d);
		return "dojoInfo.jsp";
	}
}
