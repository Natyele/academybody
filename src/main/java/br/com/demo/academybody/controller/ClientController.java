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
import br.com.demo.academybody.model.ClientEntity;
import br.com.demo.academybody.repository.ClientRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	//Criar um objeto contendo os métodos para ações de banco de dados 
	@Autowired
	private ClientRepository repository;
	
	// Método de seleção
	@GetMapping("/client/")
	public Iterable<ClientEntity> get() {
		return repository.findAll();
	}
	
	//Método de cadastro
	@PostMapping("/client/")
	public ClientEntity cadastrar(@RequestBody ClientEntity obj) {
		obj.setDiscount(0);
		return repository.save(obj);
	}

	// Método de alteração
	@PutMapping("/client/")
	public ClientEntity update(@RequestBody ClientEntity obj) {		
		return repository.save(obj);
	}
	
	protected ClientEntity verifyDiscount(ClientEntity clientEntity, int discount) {
		if(clientEntity.getDiscount() < 50) {     //desconto menor que 50;
			clientEntity.setDiscount(clientEntity.getDiscount()+ discount);  //somar o desconto que ja tem, com o que esta vindo
		}
			
		return clientEntity;
	}

	// Método de remoção
	@DeleteMapping("/client/{id}")
		public ResponseEntity<String> remove(@PathVariable int id) {
			Optional<ClientEntity> client = repository.findById(id);
			if (client.isPresent()) {
				repository.deleteById(id);
				return ResponseEntity.ok("Cliente deletado com sucesso.");
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível deletar o cliente.");

	}
}




