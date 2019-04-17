package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
