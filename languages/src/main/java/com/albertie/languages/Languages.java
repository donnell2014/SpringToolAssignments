package com.albertie.languages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Languages {

	@RequestMapping("/")
	public String yuuuh() {
		return "languageinfo.jsp";
	}
}
