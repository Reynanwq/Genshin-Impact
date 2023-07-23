package com.api.genshinimpact.arm;

import jakarta.persistence.*;

@Entity
public class Fishing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String fish_name;
    @Column(nullable = false)
    private String localization;
}
