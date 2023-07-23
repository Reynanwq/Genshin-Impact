package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String food_name;
    @Column(nullable = false)
    private String food_description;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private String food_type;

}
