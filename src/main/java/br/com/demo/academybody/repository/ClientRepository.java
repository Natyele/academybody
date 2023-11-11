package br.com.demo.academybody.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.demo.academybody.model.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
}
