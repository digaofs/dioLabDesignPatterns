package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto.ImageUrlDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "randomDogImage", url = "https://random.dog")
public interface DogImageService extends CardImageService {
    @Override
    @GetMapping("/woof.json")
    public ImageUrlDTO getImageURL();
}
