package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Gerente;
import br.com.server.repository.GerenteRepository;

@Service
public class GerenteService {

	@Autowired
	private GerenteRepository repositoryGerente;
	
	public List<Gerente> findAll() {
		return repositoryGerente.findAll();
	}
	
	@Transactional
	public Gerente save(Gerente gerente) {
		return repositoryGerente.save(gerente);
	}
	
	public void delete(Long id) {
		repositoryGerente.deleteById(id);
	}

	public Optional<Gerente> findById(Long id) {
		return repositoryGerente.findById(id);
	}
}
