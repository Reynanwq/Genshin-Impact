package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.PotionsDTO;
import com.api.genshinimpact.entities.Potions;
import com.api.genshinimpact.repository.PotionsRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CrudPotionsService {
    private PotionsRepository potionsRepository;
    public CrudPotionsService(PotionsRepository potionsRepository){
        this.potionsRepository = potionsRepository;
    }
    public void insertData(){
        Potions pocao_dentrocida = new Potions(1, "Poção Dendrocida", 3, "Aumenta RES Dentro de todos os membros da Equipe em 25% por 300s.", "");
        Potions pocao_protetora = new Potions(2, "Poção Protetora", 3, "Aumenta a RES Dendro de todos os membros da Equipe em 25% por 300s.", "");

        this.potionsRepository.save(pocao_dentrocida);
        this.potionsRepository.save(pocao_protetora);
        System.out.println("Save potions on database");
    }

    //----------- SELECIONAR DADOS DA TABELA POTIONS ------
    public void selectData(){
        Iterable<Potions> potions = this.potionsRepository.findAll();
        for (Potions potion : potions){
            System.out.println(potion);
        }
    };

    public PotionsDTO findById(Integer id){
        Potions obj = potionsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Potions not found in database with id: " + id)
        );
        return new PotionsDTO(obj);
    };
}
