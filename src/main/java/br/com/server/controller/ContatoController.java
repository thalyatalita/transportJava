package br.com.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.server.model.Contato;
import br.com.server.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	@GetMapping("/all")
	public List<Contato> findAll(){
		return service.findAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save (@RequestBody Contato contato){
		service.save(contato);
		return ResponseEntity.ok().body(contato);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find (@PathVariable Integer id){
		Optional<Contato> contato = service.findById(id);
		return ResponseEntity.ok().body(contato);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
		
	@PutMapping("/update")
	public ResponseEntity<?> update (@RequestBody Contato contato){
		service.save(contato);
		return ResponseEntity.ok().body(contato);
	}
	
}
