package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Fishing;
import com.api.genshinimpact.repository.FishingRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudFishingService {
    private FishingRepository fishingRepository;
    public CrudFishingService(FishingRepository fishingRepository){
        this.fishingRepository = fishingRepository;
    }

    public void insertData(){
        Fishing fishing0 = new Fishing();
        this.fishingRepository.save(fishing0);
    }
}
