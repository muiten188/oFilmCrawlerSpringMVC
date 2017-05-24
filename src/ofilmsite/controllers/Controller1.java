package oFilmSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	@RequestMapping("/wel")
	public ModelAndView welcome() {		
		return new ModelAndView("welcome");
	}
}
