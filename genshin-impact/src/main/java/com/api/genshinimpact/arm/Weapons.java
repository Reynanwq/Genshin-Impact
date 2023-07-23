package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
public class Weapons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String achievements_name;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String achievements_description;
    @Column(nullable = false)
    private Integer basic_attack;
    @Column(nullable = false)
    private Integer basic_defense;
    @Column(nullable = false)
    private Integer crit_damage;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer ascension;
    @Column(nullable = false)
    private Integer amounts_stars;
}
