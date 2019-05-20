package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Long> {

}
