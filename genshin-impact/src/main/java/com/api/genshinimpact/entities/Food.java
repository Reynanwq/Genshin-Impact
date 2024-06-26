package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "food_type")
public abstract class Food implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String food_name;

    @Column(nullable = false)
    private String food_description;

    @Column(nullable = false)
    private Integer rarity;

    public Food() {
    }

    public Food(Integer id, String food_name, String food_description, Integer rarity) {
        this.id = id;
        this.food_name = food_name;
        this.food_description = food_description;
        this.rarity = rarity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    
    public abstract String getFoodType();
}
