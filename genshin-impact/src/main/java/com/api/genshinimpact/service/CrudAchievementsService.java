package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Achievements;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.AchievementsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudAchievementsService {
    private AchievementsRepository achievementsRepository;
    public CrudAchievementsService(AchievementsRepository achievementsRepository){
        this.achievementsRepository = achievementsRepository;
    }

    public void insertData(){
        Achievements  = new Achievements(1, "", "", "", 0, 0);

        this.achievementsRepository.save();

        System.out.println("Achievements save in database");
    }

    //----------- SELECIONAR DADOS DA TABELA ACHIEVEMENTS------
    public void selectData(){
        Iterable<Achievements> achievements = this.achievementsRepository.findAll();
        for (Achievements achievement : achievements){
            System.out.println(achievement);
        }
    };

}
