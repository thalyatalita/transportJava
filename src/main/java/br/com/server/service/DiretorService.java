package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.server.model.Diretor;
import br.com.server.repository.DiretorRepository;

public class DiretorService {
	
	@Autowired
	private DiretorRepository repositoryDiretor;
	
	public List<Diretor> findAll() {
		return repositoryDiretor.findAll();
	}
	
	@Transactional
	public Diretor save(Diretor diretor) {
		return repositoryDiretor.save(diretor);
	}
	
	public void delete(Long id) {
		repositoryDiretor.deleteById(id);
	}

	public Optional<Diretor> findById(Long id) {
		return repositoryDiretor.findById(id);
	}

}
