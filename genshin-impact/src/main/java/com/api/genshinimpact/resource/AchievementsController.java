package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.AchievementsDTO;
import com.api.genshinimpact.service.CrudAchievementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/achievements")
public class AchievementsController {

    private final CrudAchievementsService achievementsService;

    public AchievementsController(CrudAchievementsService achievementsService){this.achievementsService = achievementsService;};

    @GetMapping(value = "/{id}")
    public AchievementsDTO findById(@PathVariable Integer id){
        return achievementsService.findById(id);
    }
}