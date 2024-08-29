package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.AvailableAnimals;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Card;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto.ImageUrlDTO;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private DogImageService dogImageService;
    @Autowired
    private DuckImageService duckImageService;
    @Autowired
    private FoxImageService foxImageService;

    public void insert(Card card){
        cardRepository.save(card);
    }

    public Iterable<Card> findAll() {
        return cardRepository.findAll();
    }

    public Card createCardFor(Person person) {
        // TODO buscar alternativa usando o próprio spring para selecionar a interface correta
        CardImageService cardImageService = switch (person.getFavoriteAnimal()){
            case AvailableAnimals.DOG -> dogImageService;
            case DUCK -> duckImageService;
            case FOX -> foxImageService;
        };

        ImageUrlDTO imageUrlDTO = cardImageService.getImageURL();
        String url = imageUrlDTO.getUrl();

        Card cardForPerson = new Card();
        cardForPerson.setCardOwner(person);
        cardForPerson.setAnimalImageURL(url);
        cardForPerson.setQuote("Uma frase bonita");

        return cardForPerson;
    }
}
