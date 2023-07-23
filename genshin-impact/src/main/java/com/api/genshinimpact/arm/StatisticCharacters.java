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

}
