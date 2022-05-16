package ar.edu.unju.fi.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.html.model.Docente;
import ar.edu.unju.fi.html.util.ListaDocente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	private ListaDocente listaDocente = new ListaDocente();
	
	@GetMapping("/nuevo")
	public String getFormularioDocenteNuevoPage(Model model) {
		model.addAttribute("docente", new Docente());
		return "nuevo_docente";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaDocentePage(@ModelAttribute("docente")Docente docente) {
		ModelAndView mav = new ModelAndView("lista_docentes");
		mav.addObject("docentes", listaDocente.getDocentes());
		return mav;
	}
	@GetMapping("/listaDocentes")
	public ModelAndView getListaDocentesPage(@ModelAttribute("docente")Docente docente) {
		ModelAndView mav = new ModelAndView("lista_docentes");
		mav.addObject("docentes", listaDocente.getDocentes());
		return mav;
	}

}
