package com.example.contactForm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.contactForm.model.Contactform;


@Controller
public class contactController {

	@GetMapping("/")
	public String HelloForm(Model model)
	{
		model.addAttribute("contact", new Contactform());
		return "contact";
	}
	
	@PostMapping("/contact")
	public String responserSubmit(@ModelAttribute Contactform contact, Model model) {
	    model.addAttribute("contact", contact);
	    return "resonse";
	}
}