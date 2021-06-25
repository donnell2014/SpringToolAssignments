package com.albertie.ninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.albertie.ninjas.models.Dojo;
import com.albertie.ninjas.models.Ninja;
import com.albertie.ninjas.repositories.DojoRepository;
import com.albertie.ninjas.repositories.NinjaRepository;

@Service
public class AppService {
	private final DojoRepository dojoRepo;
	
	private final NinjaRepository ninjaRepo;
	
	public AppService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Dojo> findAllTeams(){
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return this.dojoRepo.save(d);
	}
	
	public Ninja newNinja(Ninja n) {
		return this.ninjaRepo.save(n);
	}
	
	public Dojo dojoInfo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}
