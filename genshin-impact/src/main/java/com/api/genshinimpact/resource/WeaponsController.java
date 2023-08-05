package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.WeaponsDTO;
import com.api.genshinimpact.service.CrudWeaponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weapons")
public class WeaponsController {
    @Autowired
    private CrudWeaponsService weaponsService;

    public WeaponsController(CrudWeaponsService weaponsService){
        this.weaponsService = weaponsService;
    }

    @GetMapping(value = "/{id}")
    public WeaponsDTO findById(@PathVariable Integer id){
        return weaponsService.findById(id);
    }
}
