package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Characters;
import com.api.genshinimpact.repository.CharactersRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudCharactersService {

    private CharactersRepository charactersRepository;
    public CrudCharactersService(CharactersRepository charactersRepository){
        this.charactersRepository = charactersRepository;
    }
    public void insertData(){
        Characters characters0 = new Characters(0, "", "", 0, "", "", "", "", "", "");
        this.charactersRepository.save(characters0);
    }
}
