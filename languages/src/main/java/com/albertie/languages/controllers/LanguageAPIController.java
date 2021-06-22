package com.albertie.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.albertie.languages.models.Language;
import com.albertie.languages.services.LanguageService;

@RestController
public class LanguageAPIController {
	private final LanguageService langService;
	
	public LanguageAPIController(LanguageService langService) {
		this.langService= langService;
	}
	
	@RequestMapping("/api/lang")
	public List<Language> index(){
		return this.langService.allLanguages();
	}
	
	@PostMapping("/api/lang/create")
	public Language create(@RequestParam(value="name")String name, @RequestParam(value="creator")String creator, @RequestParam(value="version")Double version) {
		Language l = new Language(name, creator, version);
		return this.langService.createLanguage(l);
	}
	
	@GetMapping("/api/lang/{id}")
	public Language getOne(@PathVariable("id") Long id) {
		return this.langService.getOne(id);
	}
	
}
