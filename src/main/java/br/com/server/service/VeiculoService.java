package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Veiculo;
import br.com.server.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repositoryVeiculo;
	
	public List<Veiculo> findAll() {
		return repositoryVeiculo.findAll();
	}
	
	@Transactional
	public Veiculo save(Veiculo veiculo) {
		return repositoryVeiculo.save(veiculo);
	}
	
	public void delete(Long id) {
		repositoryVeiculo.deleteById(id);
	}

	public Optional<Veiculo> findById(Long id) {
		return repositoryVeiculo.findById(id);
	}

}
