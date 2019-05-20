package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Carregador;
import br.com.server.repository.CarregadorRepository;


@Service
public class CarregadorService {

	@Autowired
	private CarregadorRepository repositoryCarregador;
	
	public List<Carregador> findAll() {
		return repositoryCarregador.findAll();
	}
	
	@Transactional
	public Carregador save(Carregador carregador) {
		return repositoryCarregador.save(carregador);
	}
	
	public void delete(Long id) {
		repositoryCarregador.deleteById(id);
	}

	public Optional<Carregador> findById(Long id) {
		return repositoryCarregador.findById(id);
	}

}
