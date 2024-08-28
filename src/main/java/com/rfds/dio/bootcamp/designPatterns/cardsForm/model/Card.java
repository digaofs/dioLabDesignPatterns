package com.rfds.dio.bootcamp.designPatterns.cardsForm.model;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String animalImageURL;
    private String quote;
    @OneToOne
    private Person cardOwner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnimalImageURL() {
        return animalImageURL;
    }

    public void setAnimalImageURL(String animalImageURL) {
        this.animalImageURL = animalImageURL;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Person getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(Person cardOwner) {
        this.cardOwner = cardOwner;
    }

}
