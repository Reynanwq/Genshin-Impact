package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.service.CrudFishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fishing")
public class FishingController {
    @Autowired
    private CrudFishingService fishingService;

    public FishingController(CrudFishingService fishingService){
        this.fishingService = fishingService;
    }

    @GetMapping(value = "/{id}")
    public FishingDTO findById(@PathVariable Integer id){
        return fishingService.findById(id);
    }
}
