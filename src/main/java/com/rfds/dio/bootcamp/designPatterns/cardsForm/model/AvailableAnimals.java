package com.rfds.dio.bootcamp.designPatterns.cardsForm.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AvailableAnimals {
    @JsonProperty("dog")
    DOG,
    @JsonProperty("duck")
    DUCK,
    @JsonProperty("fox")
    FOX;
}
