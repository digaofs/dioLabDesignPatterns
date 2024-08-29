package com.rfds.dio.bootcamp.designPatterns.cardsForm.service;

import com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto.ImageUrlDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "foxImageService", url = "https://randomfox.ca")
public interface FoxImageService extends CardImageService{
    @Override
    @GetMapping("/floof")
    public ImageUrlDTO getImageURL();
}
