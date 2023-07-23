package com.api.genshinimpact.arm;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "statistic_characters")
public class StatisticCharacters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name_characters;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer ascender;
    @Column(nullable = false)
    private Integer basic_life;
    @Column(nullable = false)
    private Integer basic_attack;
    private Integer basic_defense;
    @Column(nullable = false)
    private Integer damage_bonus;

    @Deprecated
    public StatisticCharacters(){};
    public StatisticCharacters(Integer id, String name_characters, Integer level, Integer ascender, Integer basic_life, Integer basic_attack, Integer basic_defense, Integer damage_bonus) {
        this.id = id;
        this.name_characters = name_characters;
        this.level = level;
        this.ascender = ascender;
        this.basic_life = basic_life;
        this.basic_attack = basic_attack;
        this.basic_defense = basic_defense;
        this.damage_bonus = damage_bonus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_characters() {
        return name_characters;
    }

    public void setName_characters(String name_characters) {
        this.name_characters = name_characters;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAscender() {
        return ascender;
    }

    public void setAscender(Integer ascender) {
        this.ascender = ascender;
    }

    public Integer getBasic_life() {
        return basic_life;
    }

    public void setBasic_life(Integer basic_life) {
        this.basic_life = basic_life;
    }

    public Integer getBasic_attack() {
        return basic_attack;
    }

    public void setBasic_attack(Integer basic_attack) {
        this.basic_attack = basic_attack;
    }

    public Integer getBasic_defense() {
        return basic_defense;
    }

    public void setBasic_defense(Integer basic_defense) {
        this.basic_defense = basic_defense;
    }

    public Integer getDamage_bonus() {
        return damage_bonus;
    }

    public void setDamage_bonus(Integer damage_bonus) {
        this.damage_bonus = damage_bonus;
    }
}
