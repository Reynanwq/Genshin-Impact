package com.api.genshinimpact.dto;

import com.api.genshinimpact.entities.Achievements;
import jakarta.persistence.Column;
public class AchievementsDTO {
    private Integer id;
    private String achievements_topic;
    private String achievements_name;
    private String achievements_description;
    private Integer rarity;
    private Integer total_amount_rarity;

    public AchievementsDTO(){};

    public  AchievementsDTO(Integer id, String achievements_topic, String achievements_name, String achievements_description, Integer rarity, Integer total_amount_rarity){
        super();
        this.id = id;
        this.achievements_topic = achievements_topic;
        this.achievements_name = achievements_name;
        this.achievements_description = achievements_description;
        this.rarity = rarity;
        this.total_amount_rarity = total_amount_rarity;
    }

    public  AchievementsDTO(Achievements achievements){
        this.id = achievements.getId();
        this.achievements_topic = achievements.getAchievements_topic();
        this.achievements_name = achievements.getAchievements_name();
        this.achievements_description = achievements.getAchievements_description();
        this.rarity = achievements.getRarity();
        this.total_amount_rarity = achievements.getTotal_amount_rarity();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAchievements_topic() {
        return achievements_topic;
    }

    public void setAchievements_topic(String achievements_topic) {
        this.achievements_topic = achievements_topic;
    }

    public String getAchievements_name() {
        return achievements_name;
    }

    public void setAchievements_name(String achievements_name) {
        this.achievements_name = achievements_name;
    }

    public String getAchievements_description() {
        return achievements_description;
    }

    public void setAchievements_description(String achievements_description) {
        this.achievements_description = achievements_description;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getTotal_amount_rarity() {
        return total_amount_rarity;
    }

    public void setTotal_amount_rarity(Integer total_amount_rarity) {
        this.total_amount_rarity = total_amount_rarity;
    }
}
