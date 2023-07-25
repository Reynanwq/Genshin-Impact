package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.StatisticCharacters;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.StatisticCharactersRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudStatisticCharactersService {
    private StatisticCharactersRepository statisticCharactersRepository;

    public CrudStatisticCharactersService(StatisticCharactersRepository statisticCharactersRepository){
        this.statisticCharactersRepository = statisticCharactersRepository;
    }
    public void insertData(){
        StatisticCharacters statisticCharacters0 = new StatisticCharacters(0, "", 0, 0, 0, 0, 0, 0);
        this.statisticCharactersRepository.save(statisticCharacters0);
    }

    //----------- SELECIONAR DADOS DA TABELA STATISTIC CHARACTERS------
    public void selectData(){
        Iterable<StatisticCharacters> statisticCharacters = this.statisticCharactersRepository.findAll();
        for (StatisticCharacters statisticCharacter : statisticCharacters){
            System.out.println(statisticCharacter);
        }
    };
}
