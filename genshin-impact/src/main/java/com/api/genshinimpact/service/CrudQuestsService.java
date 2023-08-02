package com.api.genshinimpact.service;

import com.api.genshinimpact.entities.Quests;
import com.api.genshinimpact.repository.QuestsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudQuestsService {
    private QuestsRepository questsRepository;
    public CrudQuestsService(QuestsRepository questsRepository){
        this.questsRepository = questsRepository;
    }

    public void insertData(){
        /*----------------- MISSÕES DO ARCODONTE ---------------*/
        Quests quests0 = new Quests(1, "Missões do Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "PRÓLOGO: O Forasteiro que Voa a Favor do Vento", "Ato I: O Forasteiro que Voa a Favor do Vento -> Ato II: -> Ato III:", 0);
       /* Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Arcodonte", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES LENDÁRIAS ---------------*//*
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões Lendárias", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES DE MUNDO ---------------*//*
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Mundo", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        /*----------------- MISSÕES DE AVENTURA ---------------*//*
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);
        Quests quests0 = new Quests(2, "Missões de Aventura", "COPIAR DEPOIS", "NOME DAS RECONPENSAS", "", "", 0);*/

        this.questsRepository.save(quests0);
        System.out.println("Quests save in database!");
    }

    //----------- SELECIONAR DADOS DA TABELA QUESTS------
    public void selectData(){
        Iterable<Quests> quests = this.questsRepository.findAll();
        for (Quests quest : quests){
            System.out.println(quest);
        }
    };
}
