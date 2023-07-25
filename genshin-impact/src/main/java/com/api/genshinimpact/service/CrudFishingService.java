package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Fishing;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.FishingRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudFishingService {
    private FishingRepository fishingRepository;
    public CrudFishingService(FishingRepository fishingRepository){
        this.fishingRepository = fishingRepository;
    }

    public void insertData(){
        Fishing fishing0 = new Fishing(0, "", "");
        this.fishingRepository.save(fishing0);
    }

    //----------- SELECIONAR DADOS DA TABELA FISHING------
    public void selectData(){
        Iterable<Fishing> fishings = this.fishingRepository.findAll();
        for (Fishing fishing : fishings){
            System.out.println(fishing);
        }
    };
}
