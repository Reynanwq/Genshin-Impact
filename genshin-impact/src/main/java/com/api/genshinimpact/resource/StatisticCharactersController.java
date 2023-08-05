package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.StatisticCharactersDTO;
import com.api.genshinimpact.service.CrudStatisticCharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/statistics")
public class StatisticCharactersController {
    @Autowired
    private CrudStatisticCharactersService statisticCharactersServices;

    public StatisticCharactersController(CrudStatisticCharactersService statisticCharactersService){
        this.statisticCharactersServices = statisticCharactersService;
    }

    @GetMapping(value = "/{id}")
    public StatisticCharactersDTO findById(@PathVariable Integer id){
        return statisticCharactersServices.findById(id);
    }

}
