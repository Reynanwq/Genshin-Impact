package com.api.genshinimpact.entities;

import jakarta.persistence.*;

@Entity

public class Potions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String potion_name;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private String effect;

    @Deprecated
    public Potions(){}
    public Potions(Integer id, String potion_name, Integer rarity, String effect) {
        this.id = id;
        this.potion_name = potion_name;
        this.rarity = rarity;
        this.effect = effect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPotion_name() {
        return potion_name;
    }

    public void setPotion_name(String potion_name) {
        this.potion_name = potion_name;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "Potions{" +
                "id=" + id +
                ", potion_name='" + potion_name + '\'' +
                ", rarity=" + rarity +
                ", effect='" + effect + '\'' +
                '}';
    }
}
