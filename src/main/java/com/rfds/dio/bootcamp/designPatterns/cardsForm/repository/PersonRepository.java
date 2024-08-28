package com.rfds.dio.bootcamp.designPatterns.cardsForm.repository;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
