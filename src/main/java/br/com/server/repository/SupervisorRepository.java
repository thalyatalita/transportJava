package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Supervisor;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long>{

}
