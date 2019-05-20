package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Cliente;
import br.com.server.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repositoryCliente;
	
	public List<Cliente> findAll() {
		return repositoryCliente.findAll();
	}
	
	@Transactional
	public Cliente save(Cliente cliente) {
		return repositoryCliente.save(cliente);
	}
	
	public void delete(Long id) {
		repositoryCliente.deleteById(id);
	}

	public Optional<Cliente> findById(Long id) {
		return repositoryCliente.findById(id);
	}

}
