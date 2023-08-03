package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.PlayerDTO;
import com.api.genshinimpact.service.CrudPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/players") //away how the controller will response
public class PlayerController {

    @Autowired
    private CrudPlayerService playerService;

    public PlayerController(CrudPlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping(value = "/{id}")
    public PlayerDTO findById(@PathVariable Integer id){
        //controller call the service
        return playerService.findById(id);
    }
}
