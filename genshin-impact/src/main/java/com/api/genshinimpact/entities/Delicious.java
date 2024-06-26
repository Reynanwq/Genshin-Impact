package com.api.genshinimpact.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Delicious extends Food {
    @Column(nullable = false)
    private String url;

    public Delicious() {
    }

    public Delicious(Integer id, String food_name, String food_description, Integer rarity, String url) {
        super(id, food_name, food_description, rarity);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getFoodType() {
        return "Delicioso";
    }
}
