package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Achievements;
import com.api.genshinimpact.repository.AchievementsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudAchievementsService {
    private AchievementsRepository achievementsRepository;
    public CrudAchievementsService(AchievementsRepository achievementsRepository){
        this.achievementsRepository = achievementsRepository;
    }

    public void insertData(){
        Achievements achievements0 = new Achievements(1, "apenas_teste", "only_Teste", "DEDAED", 1, 1);
        this.achievementsRepository.save(achievements0);
        System.out.println(achievements0);
    }
}
