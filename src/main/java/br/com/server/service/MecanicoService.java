package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Mecanico;
import br.com.server.repository.MecanicoRepository;

@Service
public class MecanicoService {
	
	@Autowired
	private MecanicoRepository repositoryMecanico;
	
	public List<Mecanico> findAll() {
		return repositoryMecanico.findAll();
	}
	
	@Transactional
	public Mecanico save(Mecanico mecanico) {
		return repositoryMecanico.save(mecanico);
	}
	
	public void delete(Long id) {
		repositoryMecanico.deleteById(id);
	}

	public Optional<Mecanico> findById(Long id) {
		return repositoryMecanico.findById(id);
	}

}
