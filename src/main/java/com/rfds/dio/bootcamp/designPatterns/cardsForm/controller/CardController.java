package com.rfds.dio.bootcamp.designPatterns.cardsForm.controller;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Card;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.CardService;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("cards")
public class CardController {
    @Autowired
    private PersonService personService;
    @Autowired
    private CardService cardService;


    @PostMapping
    public ResponseEntity<String> insert(Long personId) {
        Optional<Person> person = personService.findById(personId);
        if(person.isEmpty()){
            return ResponseEntity.badRequest().body("Person with id " + personId + " not found");
        }
        Card cardForPerson = cardService.createCardFor(person.get());
        cardService.insert(cardForPerson);

        return ResponseEntity.ok(cardForPerson.toString());
    }

    @GetMapping
    public ResponseEntity<Iterable<Card>> findAll() {
        return ResponseEntity.ok(cardService.findAll());
    }
}
