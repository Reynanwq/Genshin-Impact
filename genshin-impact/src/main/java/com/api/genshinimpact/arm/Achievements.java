package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
@Table(name = "achievements")
public class Achievements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String achievements_topic;
    @Column(nullable = false)
    private String achievements_name;
    @Column(nullable = false)
    private String achievements_description;
    @Column(nullable = false)
    private Integer rarity;
    @Column(nullable = false)
    private Integer total_amount_rarity;
}
