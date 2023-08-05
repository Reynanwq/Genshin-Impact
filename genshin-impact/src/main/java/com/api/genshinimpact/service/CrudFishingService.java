package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.repository.FishingRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CrudFishingService {
    private FishingRepository fishingRepository;
    public CrudFishingService(FishingRepository fishingRepository){
        this.fishingRepository = fishingRepository;
    }

    public void insertData(){
        //LOCALIZADOS NA REGIAO DE MONDSTADT
        Fishing Medaka_mondstadt = new Fishing(1, "Medaka", "Mondstadt");
        Fishing Medaka_Azulado_mondstadt = new Fishing(2, "Medaka Azulado", "Mondstadt");
        Fishing Peixe_leão_Esgana_Gato_mondstadt = new Fishing(3, "Peixe-leão Esgana-Gato", "Mondstadt");
        Fishing Shirakodai_Cor_de_Chá_mondstadt = new Fishing(4, "Shirakodai Cor de Chá", "Mondstadt");
        Fishing Apanhador_da_Aurora_mondstadt = new Fishing(5, "Apanhador da Aurora", "Mondstadt");
        Fishing Peixe_Cristal_mondstadt = new Fishing(6, "Peixe Cristal", "Mondstadt");
        Fishing Koi_Dourado_mondstadt = new Fishing(7, "Koi Dourado", "Mondstadt");
        Fishing Akai_Maou_mondstadt = new Fishing(8, "Akai Maou", "Mondstadt");
        Fishing Fugu_mondstadt= new Fishing(9, "Fugu", "Mondstadt");
        Fishing Fugu_Amargo_mondstadt = new Fishing(10, "Fugu Amargo", "Mondstadt");
        Fishing Koi_Enferrujado_mondstadt = new Fishing(11, "Koi Enferrujado", "Mondstadt");
        Fishing Rei_da_Neve_mondstadt = new Fishing(12, "Rei da Neve", "Mondstadt");

        //LOCALIZADOS NA REGIAO DE LIYUE
        Fishing Dawncatcher_liyue = new Fishing(13, "Dawncatcher", "Liyue");
        Fishing Flor_Doce_Medaka_liyue = new Fishing(14, "Flor Doce Medaka", "Liyue");
        Fishing Apanhador_da_Aurora_liyue = new Fishing(15, "Apanhador da Aurora", "Liyue");
        Fishing Peixe_Cristal_liyue = new Fishing(16, "Peixe Cristal", "Liyue");
        Fishing Betta_Esgana_Gato_liyue = new Fishing(17, "Betta Esgana-Gato", "Liyue");
        Fishing Shirakodai_Marrom_liyue = new Fishing(18, "Shirakodai Marrom", "Liyue");
        Fishing Fugu_Amargo_liyue = new Fishing(19, "Fugu Amargo", "Liyue");
        Fishing Medaka_liyue = new Fishing(20, "Medaka", "Liyue");
        Fishing Acara_Devoto_liyue = new Fishing(22, "Acará Devoto", "Liyue");
        Fishing Akai_Maou_liyue = new Fishing(23, "Akai Maou", "Liyue");
        Fishing Koi_Dourado_liyue = new Fishing(24, "Koi Dourado", "Liyue");
        Fishing Koi_Enferrujado_liyue = new Fishing(25, "Koi Enferrujado", "Liyue");
        Fishing Fugu_liyue = new Fishing(26, "Fugu", "Liyue");

        //LOCALIZADOS NA REGIAO DE INAZUMA
        Fishing Glaze_Medaka_inazuma = new Fishing(27, "Glaze Medaka", "Inazuma");
        Fishing Medaka_inazuma_inazuma = new Fishing(28, "Medaka", "Inazuma");
        Fishing Medaka_Envernizado_inazuma = new Fishing(29, "Medaka Envernizado", "Inazuma");
        Fishing Apanhador_da_Aurora_inazuma = new Fishing(30, "Apanhador da Aurora", "Inazuma");
        Fishing Peixe_Cristal_inazuma = new Fishing(31, "Peixe Cristal", "Inazuma");
        Fishing Piramboia_Esgana_Gato_inazuma = new Fishing(32, "Piramboia Esgana-Gato", "Inazuma");
        Fishing Shirakodai_Roxo_inazuma = new Fishing(33, "Shirakodai Roxo", "Inazuma");
        Fishing Fugu_Amargo_inazuma = new Fishing(34, "Fugu Amargo", "Inazuma");
        Fishing AcarA_Raimei_inazuma = new Fishing(35, "Acará Raimei", "Inazuma");
        Fishing Fugu_inazuma = new Fishing(36, "Fugu", "Inazuma");
        Fishing Akai_Maou_inazuma = new Fishing(37, "Akai Maou", "Inazuma");
        Fishing Koi_Dourado_inazuma = new Fishing(38, "Koi Dourado", "Inazuma");
        Fishing Koi_Enferrujado_inazuma = new Fishing(39, "Koi Enferrujado", "Inazuma");

        //LOCALIZADOS NA REGIAO DE ENKANOMIYA
        Fishing Peixe_Cristal_enkanomiya = new Fishing(40, "Peixe Cristal", "Enkanomiya");
        Fishing Piramboia_Esgana_Gato_enkanomiya = new Fishing(41, "Piramboia Esgana-Gato", "Enkanomiya");
        Fishing Arraia_Divda_enkanomiya = new Fishing(42, "Arraia Divda", "Enkanomiya");
        Fishing Arraia_Formalo_enkanomiya = new Fishing(43, "Arraia Formalo", "Enkanomiya");
        Fishing Apanhador_da_Aurora_enkanomiya = new Fishing(44, "Apanhador da Aurora", "Enkanomiya");
        Fishing Shirakodai_Roxo_enkanomiya = new Fishing(45, "Shirakodai Roxo", "Enkanomiya");
        Fishing Akai_Maou_enkanomiya = new Fishing(46, "Akai Maou", "Enkanomiya");

        //LOCALIZADOS NA REGIAO DE THE CHASM
        Fishing Medaka_chasm = new Fishing(47, "Medaka", "The Chasm");
        Fishing Betta_Esgana_Gato_chasm = new Fishing(48, "Betta Esgana-Gato", "The Chasm");
        Fishing Akai_Maou_chasm = new Fishing(49, "Akai Maou", "The Chasm");
        Fishing Shirakodai_Marrom_chasm = new Fishing(50, "Shirakodai Marrom", "The Chasm");
        Fishing ugu_Amargo_chasm = new Fishing(51, "Fugu Amargo", "The Chasm");
        Fishing Doce_Medaka_chasm = new Fishing(52, "Flor Doce Medaka", "The Chasm");
        Fishing Apanhador_da_Aurora_chasm = new Fishing(53, "Apanhador da Aurora", "The Chasm");
        Fishing Peixe_Cristal_chasm = new Fishing(54, "Peixe Cristal", "The Chasm");
        Fishing Fugu_chasm = new Fishing(55, "Fugu", "The Chasm");

        //LOCALIZADOS NA REGIAO DE SUMERU
        Fishing Peixe_Cristal_Sumeru = new Fishing(56, "Peixe Cristal", "Sumeru");
        Fishing Peixe_Fruta_Verdadeira_sumeru = new Fishing(57, "Peixe Fruta Verdadeira", "Sumeru");
        Fishing Peixe_Bola_da_Areia_sumeru = new Fishing(58, "Peixe Bola da Areia", "Sumeru");
        Fishing Peixe_Bola_das_Nuvens_Crepusculares_sumeru = new Fishing(59, "Peixe Bola das Nuvens Crepusculares", "Sumeru");
        Fishing Marlim_Machado_de_Lazurita_sumeru = new Fishing(60, "Marlim Machado de Lazurita", "Sumeru");
        Fishing Marlim_Machado_de_Jade_sumeru = new Fishing(61, "Marlim Machado de Jade", "Sumeru");
        Fishing Apanhador_da_Aurorasumeru = new Fishing(62, "Apanhador da Aurora", "Sumeru");
        Fishing Medaka_sumeru = new Fishing(63, "Medaka", "Sumeru");
        Fishing Akai_Maou_sumeru = new Fishing(64, "Akai Maou", "Sumeru");
        Fishing PêssegodasOndasProfundas_sumeru = new Fishing(65, "Pêssego das Ondas Profundas", "Sumeru");

        this.fishingRepository.save(Medaka_mondstadt);
        System.out.println("Fishing Send to database!");
    }

    //----------- SELECIONAR DADOS DA TABELA FISHING------
    public void selectData(){
        Iterable<Fishing> fishings = this.fishingRepository.findAll();
        for (Fishing fishing : fishings){
            System.out.println(fishing);
        }
    };

    public FishingDTO findById(Integer id){
        Fishing obj = fishingRepository.findById(id).orElseThrow(
                () -> new NoSuchElementException("Fish not found in database with id: " + id)
        );
        return new FishingDTO(obj);
    }
}
