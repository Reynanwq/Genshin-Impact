package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.dto.QuestsDTO;
import com.api.genshinimpact.service.CrudQuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/quests")
public class QuestsController {
    @Autowired
    private CrudQuestsService questsService;

    public QuestsController(CrudQuestsService questsService){
        this.questsService = questsService;
    }

    @GetMapping(value = "/{id}")
    public QuestsDTO findById(@PathVariable Integer id){
        return questsService.findById(id);
    }
}
