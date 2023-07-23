package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
@Table(name = "characters")
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String release_date;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String skills;
    @Column(nullable = false)
    private String passive_talent;
    @Column(nullable = false)
    private String constellations;
}
