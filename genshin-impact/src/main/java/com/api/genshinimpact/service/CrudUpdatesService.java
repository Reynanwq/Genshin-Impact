package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FishingDTO;
import com.api.genshinimpact.dto.UpdatesDTO;
import com.api.genshinimpact.entities.Fishing;
import com.api.genshinimpact.entities.Updates;
import com.api.genshinimpact.repository.UpdatesRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CrudUpdatesService {
    private UpdatesRepository updatesRepository;
    public CrudUpdatesService(UpdatesRepository updatesRepository){
        this.updatesRepository = updatesRepository;
    }

    public void insertData(){
        Updates path1_0 = new Updates(1, "Patch 1.0", "Poema em Taças", "FINALIZADO", "Falcão e Arco de Amos", "Barbara | Fischl | Xiangling", "27/Set - 18/Out de 2020", "Venti", "");
        Updates path1_1 = new Updates(2, "Patch 1.1", "Despedida para o Norte", "FINALIZADO", "Harpa Celestial | Memórias de Poeira", "Diona | Beidou | Ningguang", "11/Nov - 01/Dez de 2020", "Tartaglia", "");
        Updates path1_2 = new Updates(3, "Patch 1.2", "Noticias Enigmáticas", "FINALIZADO", "Cortadora de Montanhas | Atlas Celestial", "Bennett | Fischl | Sucrose", "23/Dez de 2020 - 12/Jan de 2021", "Albedo", "");
        Updates path1_3 = new Updates(4, "Patch 1.3", "Convite de Chamas", "FINALIZADO", "Lança de jade Primitiva | Cortadora de Jade Primordial", "Diona | Xinyan | Beidou", "03/Fev - 17/Fev de 2021", "Xiao", "");
        Updates path1_4 = new Updates(5, "Patch 1.4", "Poema em Taças", "FINALIZADO", "Elegia do Suspiro Final | Lâmina Celestial", "Sucrose | Razor | Noelle", "17/Mar - 06/Abril de 2021", "Venti (Rerun)", "");
        Updates path1_5 = new Updates(6, "Patch 1.5", "Aristocracia Ermida", "FINALIZADO", "Cortadora de Montanhas | Memórias de Poeira", "Yanfei | Noelle | Diona", "28/Abr - 18/Mai de 2021", "Zhongli (Rerun)", "");
        Updates path1_6 = new Updates(7, "Patch 1.6", "Passos Flamejantes", "FINALIZADO", "Oração Perdida aos Ventos Sagrados | Orgulho Celestial", "Sucrose | Fischl | Barbara", "09/Jun - 29/Jun de 2021", "Klee (Rerun)", "");
        Updates path2_0 = new Updates(8, "Patch 2.0", "Jardim da Garça", "FINALIZADO", "Cortadora da Neblina Reforjada | Espinha Celestial", "Yanfei | Ningguang | Chongyun", "21/Jul - 01/Ago de 2021", "Kamisato Ayaka", "");
        Updates path2_1 = new Updates(9, "Patch 2.1", "Reino da Serenidade", "FINALIZADO", "Luz do Cortador de Grama | Espada Áspera", "Sucrose | Xiangling | Kojou Sara", "21/Jul - 01/Set de 2021", "Shogun Raiden", "");
        Updates path2_2 = new Updates(10, "Patch 2.2", "Despedida para o Norte", "FINALIZADO", "null", "Yanfei | Ningguang | Chongyun", "13/Out - 02/Nov de 2021", "Targlia", "");
        Updates path2_3 = new Updates(11, "Patch 2.3", "Notícias Enigmáticas / FOrmação das Ondas", "FINALIZADO", "Juramento Pela Liberdade | Canção dos Pinhos", "Rosaria | Noelle | Bennett", "24/Nov - 14/Dez de 2021", "Albedo | Eula", "");
        Updates path2_4 = new Updates(12, "Patch 2.4", "Aristocracia Ermida / Perguntas Temporárias", "FINALIZADO", "Perfuradora Prismática | Arco de Amos", "Xingqlu | Beidou | Yanfei", "25/Jan - 15/Fez de 2022", "Zhongli | Ganyu", "");
        Updates path2_5 = new Updates(13, "Patch 2.5", "Sakura Roxa Eterna", "FINALIZADO", "Prova de Kagura | Cortadora de Jade Primordial", "Diona | Fischl | Thoma", "27/Set - 18/Out de 2020", "Yae Miko", "");
        Updates path2_6 = new Updates(14, "Patch 2.6", "Zéfiros do Jardim Violeta", "FINALIZADO", "Maremoto da Lua de Futsu | Elegia do Suspiro Final", "Yunjin | Sucrose | Xiangling", "30/Mar - 20/Abr de 2022", "Kamisato Ayato | Venti", "");
        Updates path2_7 = new Updates(15, "Patch 2.7", "Sonhos Escondidos nas Profundezas", "FINALIZADO", "Crepúsculo Desvanecido | Aqua Simulacra", "Barbara | Noelle | Yanfei","27/Set - 18/Out de 2020", "Yelan | Xiao", "");
        Updates path2_8 = new Updates(16, "Patch 2.8", "Devaneios de Verão", "FINALIZADO", "Juramento Pela Liberdade | Oração Perdida aos Ventos Sagrados", "Heizou | Thoma | Ningguang", "13/07/2022 - 02/08/2022", "Kaedahara Kazuha | Klee", "");
        Updates path3_0 = new Updates(17, "Patch 3.0", "O Alvorecer das Rosas", "FINALIZADO", "Caminho do Caçador | Perfuradora Prismática", "Collei | Fischl | Diona", "24/08/2022 - 09/09/2022", "Tighnari | Zhongli", "");
        Updates path3_1 = new Updates(18, "Patch 3.1", "O Rei Deshret e os Três Magos", "FINALIZADO", "Caminho do Caçador | Perfuradora PrismáticaCaminho do Caçador | furadora Prismática", "Kuki Shinobu | Candace | Sayu", "28/09/2022 - 14/10/2022", "Cyno | Venti", "");
        Updates path3_2 = new Updates(19, "Patch 3.2", "O Akasha Pulsa, a Chama Kalpa se Ergue", "FINALIZADO", "Sonhos Flutuantes das Mil Noites | Agitação Trovejante", "Noelle | Razor | Bennett", "02/11/2022 - 18/11/2022", "Nahida | Yoiimiya", "");
        Updates path3_3 = new Updates(20, "Patch 3.3", "No Purificar dos Sentidos, o Vazio da Existência", "FINALIZADO", "Reminiscências de Tulaytullah | Chifres Vermelhos Destruidores de Pedras", "Faruzan | Gorou | Yanfei", "07/12/2022 - 27/12/2022", "Andarilho | Arataki Itto", "");
        Updates path3_4 = new Updates(21, "Patch 3.4", "Tilintar Requintado da Noite", "DISPONIVEL", "Luz das Folhas Cortadas | Lança de Jade Primitiva", "Yaoyao | Yunjin | Xinyan", "18/01/2023 - 07/022023", "Alhaitham | Xiao", "");
        Updates path3_5 = new Updates(22, "Patch 3.5", "TBA", "EM BREVE", "TBA", "Mika;", "TBA", "Dehya | Eula", "");

        this.updatesRepository.save(path1_0);
        this.updatesRepository.save(path1_1);
        this.updatesRepository.save(path1_2);
        this.updatesRepository.save(path1_3);
        this.updatesRepository.save(path1_4);
        this.updatesRepository.save(path1_5);
        this.updatesRepository.save(path1_6);
        this.updatesRepository.save(path2_0);
        this.updatesRepository.save(path2_1);
        this.updatesRepository.save(path2_2);
        this.updatesRepository.save(path2_3);
        this.updatesRepository.save(path2_4);
        this.updatesRepository.save(path2_5);
        this.updatesRepository.save(path2_6);
        this.updatesRepository.save(path2_7);
        this.updatesRepository.save(path2_8);
        this.updatesRepository.save(path3_0);
        this.updatesRepository.save(path3_1);
        this.updatesRepository.save(path3_2);
        this.updatesRepository.save(path3_3);
        this.updatesRepository.save(path3_4);
        this.updatesRepository.save(path3_5);

        System.out.println("Patch save in database");
    }

    //----------- SELECIONAR DADOS DA TABELA UPDATES------
    public void selectData(){
        Iterable<Updates> updates = this.updatesRepository.findAll();
        for (Updates update : updates){
            System.out.println(update);
        }
    };

    public UpdatesDTO findById(Integer id){
        Updates obj = updatesRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Updates not found in database with id: " + id)
        );
        return new UpdatesDTO(obj);
    }
}
