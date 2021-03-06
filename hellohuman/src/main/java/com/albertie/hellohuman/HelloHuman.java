package com.albertie.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	
	@RequestMapping("/your_server")
	public String human(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "Hello Human! " + "\n Welcome to SpringBoot!" ;
		}else {
			return "Hello "+ searchQuery +"!" + "\n Welcome to SpringBoot!";
			
		}
		
	}
	

}
