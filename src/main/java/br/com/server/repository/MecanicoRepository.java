package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Mecanico;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Long>{

}
