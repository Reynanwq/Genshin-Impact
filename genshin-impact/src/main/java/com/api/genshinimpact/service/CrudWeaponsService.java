package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Weapons;
import com.api.genshinimpact.repository.WeaponsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudWeaponsService {
    private WeaponsRepository weaponsRepository;
    public CrudWeaponsService(WeaponsRepository weaponsRepository){
        this.weaponsRepository = weaponsRepository;
    }
    public void insertData(){
        Weapons weapons0 = Weapons();
        this.weaponsRepository.save(weapons0);
    }
}
