package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
@Table(name = "updates")
public class Updates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String path_version;
    @Column(nullable = false)
    private String path_name;
    @Column(nullable = false)
    private String path_status;
    @Column(nullable = false)
    private String path_weapons;
    @Column(nullable = false)
    private String path_characters;
    @Column(nullable = false)
    private String path_time;
    @Column(nullable = false)
    private String path_characters_limited;
}
