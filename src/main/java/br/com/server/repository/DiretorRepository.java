package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Diretor;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {

}
