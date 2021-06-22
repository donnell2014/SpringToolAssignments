package com.albertie.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.albertie.languages.models.Language;
import com.albertie.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langService;
	
	public LanguageController(LanguageService langService) {
		this.langService= langService;
	}
	
	@RequestMapping("/lang")
	public String index(Model model, @ModelAttribute("langs") Language lang){
		List<Language> allLang = this.langService.allLanguages();
		model.addAttribute("allLang", allLang);
		System.out.println(allLang);
		return "languageinfo.jsp";
	}
	
	@PostMapping("/lang/create")
	public String create(@Valid @ModelAttribute("langs") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "languageinfo.jsp";
        } else {
            this.langService.createLanguage(lang);
            return "redirect:/lang";
        }
        
//        Language l = new Langauge(name, creator, version);
//		return this.langService.createLanguage(l);
	}
		
	@GetMapping("/lang/{id}")
	public String getOne(@PathVariable("id") Long id, Model model) {
		Language l = this.langService.getOne(id);
		model.addAttribute("onelang", l);
		return "onelanguage.jsp";
	}
	
	@GetMapping("/lang/edit/{id}")
	public String editone(@PathVariable("id") Long id, Model model) {
		Language l = this.langService.getOne(id);
		model.addAttribute("oneLang", l);
		return "edit.jsp";
	}
	
	@PostMapping("/lang/update/{id}")
	public String update(@Valid @ModelAttribute("langs") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            this.langService.updateLang(lang);
            return "redirect:/lang";
        }
	}
	
	@GetMapping("/lang/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.langService.deleteLang(id);
		return "redirect:/lang";
	}
	
	
//    @RequestMapping("/books/{id}/edit")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        Book book = langService.findBook(id);
//        model.addAttribute("book", book);
//        return "/books/edit.jsp";
//    }
    
}