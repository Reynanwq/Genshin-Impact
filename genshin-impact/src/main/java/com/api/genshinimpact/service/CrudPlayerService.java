package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Player;
import com.api.genshinimpact.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudPlayerService {
    private PlayerRepository playerRepository;
    public CrudPlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public void insertData(){
        Player player0 = new Player(0, "", "", "", 0, 0, 0);
        this.playerRepository.save(player0);
    }
}
