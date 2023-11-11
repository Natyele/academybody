package br.com.demo.academybody.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.academybody.model.AcademyEntity;
import br.com.demo.academybody.repository.AcademyRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AcademyController {

	// Criar um objeto contendo os métodos para ações de banco de dados
	@Autowired
	private AcademyRepository repository;

	// Método de seleção
	@GetMapping("/academy/")
	public Iterable<AcademyEntity> get() {
		return repository.findAll();
	}

	// Método de cadastro
	@PostMapping("/academy/")
	public AcademyEntity cadastrar(@RequestBody AcademyEntity obj) {
		return repository.save(obj);
	}

	// Método de alteração
	@PutMapping("/academy/")
	public AcademyEntity update(@RequestBody AcademyEntity obj) {
		return repository.save(obj);
	}

	// Método de remoção
	@DeleteMapping("/academy/{id}")
	public ResponseEntity<String> remove(@PathVariable int id) {
		Optional<AcademyEntity> academy = repository.findById(id);
		if (academy.isPresent()) {
			repository.deleteById(id);
			return ResponseEntity.ok("Academia deletada com sucesso.");
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível deletar a academia.");
	}
}