package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}
