package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
@Table(name = "quests")
public class Quests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String quests_name;
    @Column(nullable = false)
    private String quests_description;
    @Column(nullable = false)
    private String quests_reward;
    @Column(nullable = false)
    private String quests_chapter;
    @Column(nullable = false)
    private String quests_acts;
    @Column(nullable = false)
    private Integer adventure_rank;
}
