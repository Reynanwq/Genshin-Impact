package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Potions;
import com.api.genshinimpact.repository.PotionsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudPotionsService {
    private PotionsRepository potionsRepository;
    public CrudPotionsService(PotionsRepository potionsRepository){
        this.potionsRepository = potionsRepository;
    }
    public void insertData(){
        Potions potions0 = new Potions();
        this.potionsRepository.save(potions0);
    }
}
