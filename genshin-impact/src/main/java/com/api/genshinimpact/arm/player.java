package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String player_name;
    @Column(nullable = false)
    private String player_email;
    @Column(nullable = false)
    private String player_password;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer experience;
    @Column(nullable = false)
    private Integer currency;


}
