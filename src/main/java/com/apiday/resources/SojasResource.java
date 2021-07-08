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

import com.apiday.domain.Soja;
import com.apiday.repository.ISojaRepository;

@RestController
@RequestMapping("/soja")
public class SojasResource { 

	@Autowired
	private ISojaRepository repository;
	
	@GetMapping()
		public ResponseEntity<List<Soja>> listarSojas() {
			return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}   		
    	
    	@PostMapping()
    	public void SalvarArroz(@RequestBody Soja s) {
    		
    		repository.save(s);
    		
    	}
    	
    	@PutMapping()
    	public void AtualizarSoja() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirSoja(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}