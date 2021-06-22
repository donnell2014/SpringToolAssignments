package com.albertie.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.albertie.languages.models.Language;
import com.albertie.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLanguages(){
		return (List<Language>)this.langRepo.findAll();
	}
	
	public Language createLanguage(Language l) {
		return this.langRepo.save(l);
	}
	
	public Language getOne(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	public Language updateLang(Language l) {
		return this.langRepo.save(l);
	}
	
	public void deleteLang(Long id) {
		this.langRepo.deleteById(id);
	}
}
