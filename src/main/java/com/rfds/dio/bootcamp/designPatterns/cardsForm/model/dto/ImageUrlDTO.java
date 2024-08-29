package com.rfds.dio.bootcamp.designPatterns.cardsForm.model.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ImageUrlDTO {

    @JsonAlias({"link", "url"})
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
