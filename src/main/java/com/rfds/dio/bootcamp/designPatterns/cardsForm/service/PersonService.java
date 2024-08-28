package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void insert(Person person){
        personRepository.save(person);
    }

    public Iterable<Person> buscarTodos() {
        return personRepository.findAll();
    }
}
