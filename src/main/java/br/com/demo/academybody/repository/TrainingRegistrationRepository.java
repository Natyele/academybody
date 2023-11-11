package br.com.demo.academybody.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.demo.academybody.model.TrainingEntity;
	
	public interface TrainingRegistrationRepository extends CrudRepository<TrainingEntity, Integer> {


}
