package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Fornecedor;
import br.com.server.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repositoryFornecedor;
	
	public List<Fornecedor> findAll() {
		return repositoryFornecedor.findAll();
	}
	
	@Transactional
	public Fornecedor save(Fornecedor fornecedor) {
		return repositoryFornecedor.save(fornecedor);
	}
	
	public void delete(Long id) {
		repositoryFornecedor.deleteById(id);
	}

	public Optional<Fornecedor> findById(Long id) {
		return repositoryFornecedor.findById(id);
	}

}
