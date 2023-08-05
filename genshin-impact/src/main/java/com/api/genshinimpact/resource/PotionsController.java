package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.PotionsDTO;
import com.api.genshinimpact.entities.Potions;
import com.api.genshinimpact.service.CrudPotionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/potions")
public class PotionsController {
    @Autowired
    private CrudPotionsService potionsService;
    public PotionsController(CrudPotionsService potionsService){
        this.potionsService = potionsService;
    }

    @GetMapping(value = "/{id}")
    public PotionsDTO findById(@PathVariable Integer id){
        return potionsService.findById(id);
    }
}
