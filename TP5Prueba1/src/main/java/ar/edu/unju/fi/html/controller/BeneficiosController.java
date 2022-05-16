package ar.edu.unju.fi.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeneficiosController {
	@GetMapping("/beneficios")
	public String getBeneficiosPge(Model model) {
		return "beneficios";
	}
}
