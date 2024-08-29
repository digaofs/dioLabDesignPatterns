package com.rfds.dio.bootcamp.designPatterns.cardsForm.utils;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.AvailableAnimals;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.CardImageService;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.DogImageService;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.DuckImageService;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.service.FoxImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CardImageServiceFactory {

    private final Map<AvailableAnimals, CardImageService> cardImageServices = new HashMap<>();

    @Autowired
    public CardImageServiceFactory(DogImageService dogImageService, DuckImageService duckImageService, FoxImageService foxImageService) {
        cardImageServices.put(AvailableAnimals.DOG, dogImageService);
        cardImageServices.put(AvailableAnimals.DUCK, duckImageService);
        cardImageServices.put(AvailableAnimals.FOX, foxImageService);
    }

    public CardImageService getImageServiceByFavoriteAnimal(AvailableAnimals favoriteAnimal){
        return cardImageServices.get(favoriteAnimal);
    }
}
