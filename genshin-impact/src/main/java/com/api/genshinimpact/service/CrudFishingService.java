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
        Fishing MedakaM = new Fishing(1, "Medaka", "Mondstadt");
        Fishing Medaka AzuladoM = new Fishing(2, "Medaka Azulado", "Mondstadt");
        Fishing Peixe-leão Esgana-GatoM = new Fishing(3, "Peixe-leão Esgana-Gato", "Mondstadt");
        Fishing Shirakodai Cor de CháM = new Fishing(4, "Shirakodai Cor de Chá", "Mondstadt");
        Fishing Apanhador da AuroraM = new Fishing(5, "Apanhador da Aurora", "Mondstadt");
        Fishing Peixe CristalM = new Fishing(6, "Peixe Cristal", "Mondstadt");
        Fishing Koi DouradoM = new Fishing(7, "Koi Dourado", "Mondstadt");
        Fishing Akai MaouM = new Fishing(8, "Akai Maou", "Mondstadt");
        Fishing FuguM = new Fishing(9, "Fugu", "Mondstadt");
        Fishing Fugu AmargoM = new Fishing(10, "Fugu Amargo", "Mondstadt");
        Fishing Koi EnferrujadoM = new Fishing(11, "Koi Enferrujado", "Mondstadt");
        Fishing Rei da NeveM = new Fishing(12, "Rei da Neve", "Mondstadt");

        //LOCALIZADOS NA REGIAO DE LIYUE
        Fishing Dawncatcher = new Fishing(13, "Dawncatcher", "Liyue");
        Fishing Flor Doce Medaka = new Fishing(14, "Flor Doce Medaka", "Liyue");
        Fishing Apanhador da Aurora = new Fishing(15, "Apanhador da Aurora", "Liyue");
        Fishing Peixe Cristal = new Fishing(16, "Peixe Cristal", "Liyue");
        Fishing Betta Esgana-Gato = new Fishing(17, "Betta Esgana-Gato", "Liyue");
        Fishing Shirakodai Marrom = new Fishing(18, "Shirakodai Marrom", "Liyue");
        Fishing Fugu Amargo = new Fishing(19, "Fugu Amargo", "Liyue");
        Fishing Medaka = new Fishing(20, "Medaka", "Liyue");
        Fishing Apanhador da Aurora = new Fishing(21, "Apanhador da Aurora", "Liyue");
        Fishing Acará Devoto = new Fishing(22, "Acará Devoto", "Liyue");
        Fishing Akai Maou = new Fishing(23, "Akai Maou", "Liyue");
        Fishing Koi Dourado = new Fishing(24, "Koi Dourado", "Liyue");
        Fishing Koi Enferrujado" = new Fishing(25, "Koi Enferrujado", "Liyue");
        Fishing Fugu = new Fishing(26, "Fugu", "Liyue");

        //LOCALIZADOS NA REGIAO DE INAZUMA
        Fishing Glaze_Medaka = new Fishing(27, "Glaze Medaka", "Inazuma");
        Fishing Medaka = new Fishing(28, "Medaka", "Inazuma");
        Fishing Medaka Envernizado = new Fishing(29, "Medaka Envernizado", "Inazuma");
        Fishing Apanhador da Aurora = new Fishing(30, "Apanhador da Aurora", "Inazuma");
        Fishing Peixe Cristal = new Fishing(31, "Peixe Cristal", "Inazuma");
        Fishing Piramboia Esgana-Gato = new Fishing(32, "Piramboia Esgana-Gato", "Inazuma");
        Fishing Shirakodai Roxo = new Fishing(33, "Shirakodai Roxo", "Inazuma");
        Fishing Fugu Amargo = new Fishing(34, "Fugu Amargo", "Inazuma");
        Fishing Acará Raimei = new Fishing(35, "Acará Raimei", "Inazuma");
        Fishing Fugu = new Fishing(36, "Fugu", "Inazuma");
        Fishing Akai Maou = new Fishing(37, "Akai Maou", "Inazuma");
        Fishing Koi Dourado = new Fishing(38, "Koi Dourado", "Inazuma");
        Fishing Koi Enferrujado = new Fishing(39, "Koi Enferrujado", "Inazuma");

        //LOCALIZADOS NA REGIAO DE ENKANOMIYA
        Fishing Peixe Cristal = new Fishing(40, "Peixe Cristal", "Enkanomiya");
        Fishing Piramboia Esgana-Gato = new Fishing(41, "Piramboia Esgana-Gato", "Enkanomiya");
        Fishing Arraia Divda = new Fishing(42, "Arraia Divda", "Enkanomiya");
        Fishing Arraia Formalo = new Fishing(43, "Arraia Formalo", "Enkanomiya");
        Fishing Apanhador da Aurora = new Fishing(44, "Apanhador da Aurora", "Enkanomiya");
        Fishing Shirakodai Roxo = new Fishing(45, "Shirakodai Roxo", "Enkanomiya");
        Fishing Akai Maou = new Fishing(46, "Akai Maou", "Enkanomiya");

        //LOCALIZADOS NA REGIAO DE THE CHASM
        Fishing Medaka = new Fishing(47, "Medaka", "The Chasm");
        Fishing Betta Esgana-Gato = new Fishing(48, "Betta Esgana-Gato", "The Chasm");
        Fishing Akai Maou = new Fishing(49, "Akai Maou", "The Chasm");
        Fishing Shirakodai Marrom = new Fishing(50, "Shirakodai Marrom", "The Chasm");
        Fishing ugu Amargo = new Fishing(51, "Fugu Amargo", "The Chasm");
        Fishing Doce Medaka = new Fishing(52, "Flor Doce Medaka", "The Chasm");
        Fishing Apanhador da Aurora = new Fishing(53, "Apanhador da Aurora", "The Chasm");
        Fishing Peixe Cristal = new Fishing(54, "Peixe Cristal", "The Chasm");
        Fishing Fugu = new Fishing(55, "Fugu", "The Chasm");

        //LOCALIZADOS NA REGIAO DE SUMERU
        Fishing Peixe Cristal = new Fishing(56, "Peixe Cristal", "Sumeru");
        Fishing Peixe Fruta Verdadeira = new Fishing(57, "Peixe Fruta Verdadeira", "Sumeru");
        Fishing Peixe Bola da Areia = new Fishing(58, "Peixe Bola da Areia", "Sumeru");
        Fishing Peixe Bola das Nuvens Crepusculares = new Fishing(59, "Peixe Bola das Nuvens Crepusculares", "Sumeru");
        Fishing Marlim Machado de Lazurita = new Fishing(60, "Marlim Machado de Lazurita", "Sumeru");
        Fishing Marlim Machado de Jade = new Fishing(61, "Marlim Machado de Jade", "Sumeru");
        Fishing Apanhador da Aurora = new Fishing(62, "Apanhador da Aurora", "Sumeru");
        Fishing Medaka = new Fishing(63, "Medaka", "Sumeru");
        Fishing Akai Maou = new Fishing(64, "Akai Maou", "Sumeru");
        Fishing Pêssego das Ondas Profundas = new Fishing(65, "Pêssego das Ondas Profundas", "Sumeru");

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
