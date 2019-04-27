package br.com.server.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.server.model.Contato;
import br.com.server.repository.ContatoRepository;
@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repositoryContato;
	
	public List<Contato> findAll() {
		return repositoryContato.findAll();
	}
	
	public Contato save(Contato contato) {
		return repositoryContato.saveAndFlush(contato);
	}
	
	public void delete(Integer id) {
		repositoryContato.deleteById(id);
	}

	public Optional<Contato> findById(Integer id) {
		return repositoryContato.findById(id);
	}
}
