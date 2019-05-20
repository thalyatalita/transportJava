package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Supervisor;
import br.com.server.repository.SupervisorRepository;

@Service
public class SupervisorService {

	
	@Autowired
	private SupervisorRepository repositorySupervisor;
	
	public List<Supervisor> findAll() {
		return repositorySupervisor.findAll();
	}
	
	@Transactional
	public Supervisor save(Supervisor supervisor) {
		return repositorySupervisor.save(supervisor);
	}
	
	public void delete(Long id) {
		repositorySupervisor.deleteById(id);
	}

	public Optional<Supervisor> findById(Long id) {
		return repositorySupervisor.findById(id);
	}
}
