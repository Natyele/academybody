package br.com.demo.academybody.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
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

import br.com.demo.academybody.model.ClientEntity;
import br.com.demo.academybody.model.TrainingEntity;
import br.com.demo.academybody.repository.TrainingRegistrationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrainingRegistrationController {

	// Criar um objeto contendo os métodos para ações de banco de dados
	@Autowired
	private TrainingRegistrationRepository repository;

	@Autowired
	private ClientController clientController;

	// Método de seleção
	@GetMapping("/training/")
	public Iterable<TrainingEntity> get() {
		return repository.findAll();
	}

	// Método de cadastro
	@PostMapping("/training/")
	public TrainingEntity cadastrar(@RequestBody TrainingEntity obj) {
		return repository.save(obj);
	}

	// Método de alteração
	@PutMapping("/training/")
	public TrainingEntity update(@RequestBody TrainingEntity obj) {
		obj.setConclusion(true);
		obj.setPoint(10);
		int discount = calculateDiscount(obj);
		List<ClientEntity> clients = (List<ClientEntity>) clientController.get();
		for (ClientEntity clientEntity : clients) {
			if (clientEntity.isFidelityProgram()) {
				ClientEntity clientDiscount = clientController.verifyDiscount(clientEntity, discount);
				clientController.update(clientDiscount);
			}
		}
		return repository.save(obj);
	}

	// Método de remoção
	@DeleteMapping("/training/{id}")
	public ResponseEntity<String> remove(@PathVariable int id) {
		Optional<TrainingEntity> client = repository.findById(id);
		if (client.isPresent()) {
			repository.deleteById(id);
			return ResponseEntity.ok("Treino deletado com sucesso.");
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível deletar o treino.");


	}

	public int calculateDiscount(TrainingEntity trainingEntity) {

		// Precisa estar em um período de 30 dias para ter treino válido
		if (ChronoUnit.DAYS.between(LocalDate.now(), trainingEntity.getDate()) <= 30) {
			// Para ter o desconto precisa concluir o treino
			if (trainingEntity.isConclusion()) {
				// Precisa ter no mínimo 10 pontos para ganhar o desconto
				if (trainingEntity.getPoint() >= 10) {
					return 10;
				}
			}

		}
		return 0;

	}

}
