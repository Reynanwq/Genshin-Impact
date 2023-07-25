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
        Weapons weapons0 = new Weapons(0, "", "", "", 0, 0, 0, 0, 0, 0);
        this.weaponsRepository.save(weapons0);
    }

    //----------- SELECIONAR DADOS DA TABELA WEAPONS ------
    public void selectData(){
        Iterable<Weapons> weapons = this.weaponsRepository.findAll();
        for(Weapons weapon : weapons){
            System.out.println(weapon);
        }
    }
}
