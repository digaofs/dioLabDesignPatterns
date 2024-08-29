package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto.ImageUrlDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "randomDuckImage", url = "https://random-d.uk/api/v2")
public interface DuckImageService extends CardImageService {
    @Override
    @GetMapping("/random")
    public ImageUrlDTO getImageURL();
}
