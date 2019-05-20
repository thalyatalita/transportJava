package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Carga;

@Repository
public interface CargaRepository extends JpaRepository<Carga, Long> {

}
