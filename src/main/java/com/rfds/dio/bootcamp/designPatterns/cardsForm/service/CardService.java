package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.AvailableAnimals;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Card;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.Person;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto.ImageUrlDTO;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.repository.CardRepository;
import com.rfds.dio.bootcamp.designPatterns.cardsForm.utils.CardImageServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private CardImageServiceFactory cardImageServiceFactory;

    public void insert(Card card){
        cardRepository.save(card);
    }

    public Iterable<Card> findAll() {
        return cardRepository.findAll();
    }

    public Card createCardFor(Person person) {
        // TODO buscar alternativa usando o próprio spring para selecionar a interface correta

        CardImageService cardImageService = cardImageServiceFactory.getImageServiceByFavoriteAnimal(person.getFavoriteAnimal());

        ImageUrlDTO imageUrlDTO = cardImageService.getImageURL();
        String url = imageUrlDTO.getUrl();

        Card cardForPerson = new Card();
        cardForPerson.setCardOwner(person);
        cardForPerson.setAnimalImageURL(url);
        cardForPerson.setQuote("Uma frase bonita");

        return cardForPerson;
    }
}
