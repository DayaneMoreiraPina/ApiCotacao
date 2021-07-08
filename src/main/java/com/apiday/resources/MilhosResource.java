package com.apiday.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiday.domain.Milho;
import com.apiday.repository.IMilhoRepository;

@RestController
@RequestMapping("/milho")
public class MilhosResource { 

	@Autowired
	private IMilhoRepository repository;
	
	@GetMapping()
		public ResponseEntity<List<Milho>> listarMilhos() {
			return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}   		
    	
    	@PostMapping()
    	public void SalvarMilho(@RequestBody Milho m) {
    		
    		repository.save(m);
    		
    	}
    	
    	@PutMapping()
    	public void AtualizarMilho() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirMilho(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}