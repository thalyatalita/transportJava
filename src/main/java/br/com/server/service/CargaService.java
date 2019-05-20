package br.com.server.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.server.model.Carga;
import br.com.server.repository.CargaRepository;


@Service
public class CargaService {
	
	@Autowired
	private CargaRepository repositoryCarga;
	
	public List<Carga> findAll() {
		return repositoryCarga.findAll();
	}
	
	@Transactional
	public Carga save(Carga carga) {
		return repositoryCarga.save(carga);
	}
	
	public void delete(Long id) {
		repositoryCarga.deleteById(id);
	}

	public Optional<Carga> findById(Long id) {
		return repositoryCarga.findById(id);
	}


}
