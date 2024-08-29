package com.rfds.dio.bootcamp.designPatterns.cardsForm.controller;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> insert(@Valid @RequestBody Person person, BindingResult result) {
        if (result.hasErrors()) {
            // TODO melhorar mensagem de erro / retorno
            return ResponseEntity.badRequest().body(person);
        }
        personService.insert(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping
    public ResponseEntity<Iterable<Person>> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }

}
