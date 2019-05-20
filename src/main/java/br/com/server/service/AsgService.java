package br.com.server.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.server.model.ASG;
import br.com.server.repository.AsgRepository;

@Service
public class AsgService {
	
	@Autowired
	private AsgRepository repositoryASG;
	
	public List<ASG> findAll() {
		return repositoryASG.findAll();
	}
	
	@Transactional
	public ASG save(ASG asg) {
		return repositoryASG.save(asg);
	}
	
	public void delete(Long id) {
		repositoryASG.deleteById(id);
	}

	public Optional<ASG> findById(Long id) {
		return repositoryASG.findById(id);
	}

}
