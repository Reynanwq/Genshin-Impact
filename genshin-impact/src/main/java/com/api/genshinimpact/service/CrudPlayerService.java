package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Player;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudPlayerService {
    private PlayerRepository playerRepository;
    public CrudPlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public void insertData(){

        //ESTARÁ RELACIONADO COM UM PROVAVEL SISTEMA DE AUTENTICAÇÃO DE USUARIO - FAVOR, IGNORE ESTE ARQUIVO, NO MOMENTO.
        Player player0 = new Player(0, "", "", "", 0, 0, 0);
        this.playerRepository.save(player0);
    }

    //----------- SELECIONAR DADOS DA TABELA PLAYER------
    public void selectData(){
        Iterable<Player> players = this.playerRepository.findAll();
        for (Player player : players){
            System.out.println(player);
        }
    };
}
