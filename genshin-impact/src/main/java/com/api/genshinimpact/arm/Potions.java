package com.api.genshinimpact.arm;

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
}
