package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Potions;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.PotionsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudPotionsService {
    private PotionsRepository potionsRepository;
    public CrudPotionsService(PotionsRepository potionsRepository){
        this.potionsRepository = potionsRepository;
    }
    public void insertData(){
        Potions pocao_dentrocida = new Potions(1, "Poção Dendrocida", 3, "Aumenta RES Dentro de todos os membros da Equipe em 25% por 300s.");
        Potions potions0 = new Potions(2, "", 0, "");
        Potions potions0 = new Potions(3, "", 0, "");
        Potions potions0 = new Potions(4, "", 0, "");
        Potions potions0 = new Potions(5, "", 0, "");
        Potions potions0 = new Potions(6, "", 0, "");
        Potions potions0 = new Potions(7, "", 0, "");
        Potions potions0 = new Potions(8, "", 0, "");
        Potions potions0 = new Potions(9, "", 0, "");
        Potions potions0 = new Potions(10, "", 0, "");
        Potions potions0 = new Potions(11, "", 0, "");
        Potions potions0 = new Potions(12, "", 0, "");
        Potions potions0 = new Potions(13, "", 0, "");
        Potions potions0 = new Potions(14, "", 0, "");

        this.potionsRepository.save(pocao_dentrocida);
        System.out.println("Save potions on database");
    }

    //----------- SELECIONAR DADOS DA TABELA POTIONS ------
    public void selectData(){
        Iterable<Potions> potions = this.potionsRepository.findAll();
        for (Potions potion : potions){
            System.out.println(potion);
        }
    };
}
