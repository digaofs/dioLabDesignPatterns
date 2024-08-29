package com.rfds.dio.bootcamp.designPatterns.cardsForm.repository;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
