package br.com.demo.academybody.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.demo.academybody.model.AcademyEntity;

public interface AcademyRepository extends CrudRepository<AcademyEntity, Integer> {

}
