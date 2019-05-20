package br.com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.server.model.ASG;

@Repository
public interface AsgRepository extends JpaRepository<ASG, Long>{
	
	

}
