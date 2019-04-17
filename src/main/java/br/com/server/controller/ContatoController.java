package br.com.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.server.model.Contato;
import br.com.server.service.ContatoService;

@Controller
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("contatos", service.findAll());
		return mv;
	}
	
	@GetMapping("/signup")
    public ModelAndView FormCliente(Contato contato) {
        ModelAndView mv = new ModelAndView("/addContato");
        mv.addObject("contato", contato);
		return mv;
    }
	
	@PostMapping("/adduser")
    public String addUser(Contato contato, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addContato";
        }
         
        service.save(contato);
        model.addAttribute("contatos", service.findAll());
        return "index";
    }
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return findAll();
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
		Contato contato = service.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	     
	    model.addAttribute("contato", contato);
	    return "editContato";
	}
	
	@PostMapping("/update/{id}") 
	public String edit(Contato contato, @PathVariable("id") Integer id, Model model, BindingResult result) { 
		if (result.hasErrors()) {
			contato.setId(id);
	        return "editContato";
	    }
		service.save(contato);
		model.addAttribute("contatos", service.findAll());
		return "index";
		}	
}
