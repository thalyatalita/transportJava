package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.Carregador;

@Repository
public interface CarregadorRepository extends JpaRepository<Carregador, Long> {

}
