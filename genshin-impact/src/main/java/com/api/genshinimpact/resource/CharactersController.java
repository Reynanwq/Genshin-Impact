package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.service.CrudAchievementsService;
import com.api.genshinimpact.service.CrudCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/characters")
public class CharactersController {
    @Autowired
    private CrudCharactersService charactersService;

    public CharactersController(CrudCharactersService charactersService){
        this.charactersService = charactersService;
    }

    @GetMapping("/{id}")
    public CharactersDTO findById(@PathVariable Integer id){
        return charactersService.findById(id);
    }
}
