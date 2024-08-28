package com.rfds.dio.bootcamp.designPatterns.cardsForm.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private AvailableAnimals favoriteAnimal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AvailableAnimals getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(AvailableAnimals favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }
}
