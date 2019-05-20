package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}
