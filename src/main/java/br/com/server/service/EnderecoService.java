package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Endereco;
import br.com.server.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repositoryEndereco;
	
	public List<Endereco> findAll() {
		return repositoryEndereco.findAll();
	}
	
	@Transactional
	public Endereco save(Endereco endereco) {
		return repositoryEndereco.save(endereco);
	}
	
	public void delete(Long id) {
		repositoryEndereco.deleteById(id);
	}

	public Optional<Endereco> findById(Long id) {
		return repositoryEndereco.findById(id);
	}

}
