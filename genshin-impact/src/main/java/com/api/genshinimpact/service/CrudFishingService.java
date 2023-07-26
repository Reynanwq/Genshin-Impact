package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Fishing;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.FishingRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudFishingService {
    private FishingRepository fishingRepository;
    public CrudFishingService(FishingRepository fishingRepository){
        this.fishingRepository = fishingRepository;
    }

    public void insertData(){
        //LOCALIZADOS NA REGIAO DE MONDSTADT
        Fishing Medaka = new Fishing(1, "Medaka", "Mondstadt");
        Fishing Medaka = new Fishing(2, "", "Mondstadt");
        Fishing Medaka = new Fishing(3, "", "Mondstadt");
        Fishing Medaka = new Fishing(4, "", "Mondstadt");
        Fishing Medaka = new Fishing(5, "", "Mondstadt");
        Fishing Medaka = new Fishing(6, "", "Mondstadt");
        Fishing Medaka = new Fishing(7, "", "Mondstadt");
        Fishing Medaka = new Fishing(8, "", "Mondstadt");
        Fishing Medaka = new Fishing(9, "", "Mondstadt");
        Fishing Medaka = new Fishing(10, "", "Mondstadt");
        Fishing Medaka = new Fishing(11, "", "Mondstadt");
        Fishing Medaka = new Fishing(12, "", "Mondstadt");
        Fishing Medaka = new Fishing(13, "", "Mondstadt");
        Fishing Medaka = new Fishing(14, "", "Mondstadt");
        Fishing Medaka = new Fishing(15, "", "Mondstadt");
        Fishing Medaka = new Fishing(16, "", "Mondstadt");

        //LOCALIZADOS NA REGIAO DE LIYUE
        Fishing Dawncatcher = new Fishing(1, "Dawncatcher", "Liyue");
        Fishing Dawncatcher = new Fishing(2, "", "Liyue");
        Fishing Dawncatcher = new Fishing(3, "", "Liyue");
        Fishing Dawncatcher = new Fishing(4, "", "Liyue");
        Fishing Dawncatcher = new Fishing(5, "", "Liyue");
        Fishing Dawncatcher = new Fishing(6, "", "Liyue");
        Fishing Dawncatcher = new Fishing(7, "", "Liyue");
        Fishing Dawncatcher = new Fishing(8, "", "Liyue");
        Fishing Dawncatcher = new Fishing(9, "", "Liyue");
        Fishing Dawncatcher = new Fishing(10, "", "Liyue");
        Fishing Dawncatcher = new Fishing(11, "", "Liyue");
        Fishing Dawncatcher = new Fishing(12, "", "Liyue");
        Fishing Dawncatcher = new Fishing(13, "", "Liyue");
        Fishing Dawncatcher = new Fishing(14, "", "Liyue");
        Fishing Dawncatcher = new Fishing(15, "", "Liyue");
        Fishing Dawncatcher = new Fishing(16, "", "Liyue");
        Fishing Dawncatcher = new Fishing(17, "", "Liyue");
        Fishing Dawncatcher = new Fishing(18, "", "Liyue");

        //LOCALIZADOS NA REGIAO DE INAZUMA
        Fishing Glaze_Medaka = new Fishing(1, "Glaze Medaka", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");
        Fishing Glaze_Medaka = new Fishing(1, "", "Inazuma");


        //LOCALIZADOS NA REGIAO DE ENKANOMIYA
        Fishing Lunged = new Fishing(1, "Lunged", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");
        Fishing Lunged = new Fishing(1, "", "Enkanomiya");

        //LOCALIZADOS NA REGIAO DE THE CHASM
        Fishing Betta = new Fishing(1, "Betta", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");
        Fishing Betta = new Fishing(1, "", "The Chasm");


        //LOCALIZADOS NA REGIAO DE SUMERU
        Fishing Crystalfish = new Fishing(10, "Crystalfish", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");
        Fishing Crystalfish = new Fishing(10, "", "Sumeru");


        this.fishingRepository.save(Medaka);
        System.out.println("Fishing Send to database!");
    }

    //----------- SELECIONAR DADOS DA TABELA FISHING------
    public void selectData(){
        Iterable<Fishing> fishings = this.fishingRepository.findAll();
        for (Fishing fishing : fishings){
            System.out.println(fishing);
        }
    };
}
