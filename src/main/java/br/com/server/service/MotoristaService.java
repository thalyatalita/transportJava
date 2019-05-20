package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Motorista;
import br.com.server.repository.MotoristaRepository;

@Service
public class MotoristaService {
	
	@Autowired
	private MotoristaRepository repositoryMotorista;
	
	public List<Motorista> findAll() {
		return repositoryMotorista.findAll();
	}
	
	@Transactional
	public Motorista save(Motorista motorista) {
		return repositoryMotorista.save(motorista);
	}
	
	public void delete(Long id) {
		repositoryMotorista.deleteById(id);
	}

	public Optional<Motorista> findById(Long id) {
		return repositoryMotorista.findById(id);
	}

}
