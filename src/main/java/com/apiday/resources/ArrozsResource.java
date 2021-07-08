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

import com.apiday.domain.Arroz;
import com.apiday.repository.IArrozRepository;

@RestController
@RequestMapping("/arroz")
public class ArrozsResource { 

	@Autowired
	private IArrozRepository repository;
	
	@GetMapping()
		public ResponseEntity<List<Arroz>> listarArrozs() {
			return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}   		
    	
    	@PostMapping()
    	public void SalvarArroz(@RequestBody Arroz a) {
    		
    		repository.save(a);
    		
    	}
    	
    	@PutMapping()
    	public void AtualizarArroz() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirArroz(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}