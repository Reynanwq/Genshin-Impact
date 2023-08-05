package com.api.genshinimpact.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "achievements")
public class Achievements implements Serializable {
    private static final long serialVersionUID = 1L;
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

    @Deprecated
    public Achievements(){ } //um como vazio é algo padrão

    public Achievements(Integer id, String achievements_topic, String achievements_name, String achievements_description, Integer rarity, Integer total_amount_rarity) {
        this.id = id;
        this.achievements_topic = achievements_topic;
        this.achievements_name = achievements_name;
        this.achievements_description = achievements_description;
        this.rarity = rarity;
        this.total_amount_rarity = total_amount_rarity;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getAchievements_topic() {
        return achievements_topic;
    }

    public String getAchievements_description() {
        return achievements_description;
    }

    public void setAchievements_description(String achievements_description) {
        this.achievements_description = achievements_description;
    }

    public String getAchievements_name() {
        return achievements_name;
    }

    public void setAchievements_name(String achievements_name) {
        this.achievements_name = achievements_name;
    }

    public void setAchievements_topic(String achievements_topic) {
        this.achievements_topic = achievements_topic;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal_amount_rarity() {
        return total_amount_rarity;
    }

    public void setTotal_amount_rarity(Integer total_amount_rarity) {
        this.total_amount_rarity = total_amount_rarity;
    }

    @Override
    public String toString() {
        return "Achievements{" +
                "id=" + id +
                ", achievements_topic='" + achievements_topic + '\'' +
                ", achievements_name='" + achievements_name + '\'' +
                ", achievements_description='" + achievements_description + '\'' +
                ", rarity=" + rarity +
                ", total_amount_rarity=" + total_amount_rarity +
                '}';
    }
}
