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

    @Deprecated
    public Characters(){};
    public Characters(Integer id, String name, String type, Integer level, String description, String release_date, String gender, String skills, String passive_talent, String constellations) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.description = description;
        this.release_date = release_date;
        this.gender = gender;
        this.skills = skills;
        this.passive_talent = passive_talent;
        this.constellations = constellations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPassive_talent() {
        return passive_talent;
    }

    public void setPassive_talent(String passive_talent) {
        this.passive_talent = passive_talent;
    }

    public String getConstellations() {
        return constellations;
    }

    public void setConstellations(String constellations) {
        this.constellations = constellations;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", description='" + description + '\'' +
                ", release_date='" + release_date + '\'' +
                ", gender='" + gender + '\'' +
                ", skills='" + skills + '\'' +
                ", passive_talent='" + passive_talent + '\'' +
                ", constellations='" + constellations + '\'' +
                '}';
    }
}
