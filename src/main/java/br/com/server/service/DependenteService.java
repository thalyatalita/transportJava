package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Dependente;
import br.com.server.repository.DependenteRepository;


@Service
public class DependenteService {

	@Autowired
	private DependenteRepository repositoryDependente;
	
	public List<Dependente> findAll() {
		return repositoryDependente.findAll();
	}
	
	@Transactional
	public Dependente save(Dependente dependente) {
		return repositoryDependente.save(dependente);
	}
	
	public void delete(Long id) {
		repositoryDependente.deleteById(id);
	}

	public Optional<Dependente> findById(Long id) {
		return repositoryDependente.findById(id);
	}
}
