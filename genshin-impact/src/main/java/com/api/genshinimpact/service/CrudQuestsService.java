package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Quests;
import com.api.genshinimpact.repository.QuestsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudQuestsService {
    private QuestsRepository questsRepository;
    public CrudQuestsService(QuestsRepository questsRepository){
        this.questsRepository = questsRepository;
    }

    public void insertData(){
        Quests quests0 = new Quests(0, "", "", "", "", "", 0);
        this.questsRepository.save(quests0);

    }
}
