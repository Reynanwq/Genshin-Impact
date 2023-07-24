package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.UpdatesRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudUpdatesService {
    private UpdatesRepository updatesRepository;
    public CrudUpdatesService(UpdatesRepository updatesRepository){
        this.updatesRepository = updatesRepository;
    }
    public void insertData(){
        Updates path1_0 = Updates(1, "Patch 1.0", "Poema em Taças", "FINALIZADO", "Falcão e Arco de Amos", "Barbara | Fischl | Xiangling", "27/Set - 18/Out de 2020", "Venti");
        Updates path1_1 = Updates(2, "Patch 1.1", "Despedida para o Norte", "FINALIZADO", "Harpa Celestial | Memórias de Poeira", "Diona | Beidou | Ningguang", "11/Nov - 01/Dez de 2020", "Tartaglia");
        Updates path1_2 = Updates(3, "Patch 1.2", "Noticias Enigmáticas", "FINALIZADO", "Cortadora de Montanhas | Atlas Celestial", "Bennett | Fischl | Sucrose", "23/Dez de 2020 - 12/Jan de 2021", "Albedo");
        Updates path1_3 = Updates(4, "Patch 1.3", "Convite de Chamas", "FINALIZADO", "Lança de jade Primitiva | Cortadora de Jade Primordial", "Diona | Xinyan | Beidou", "03/Fev - 17/Fev de 2021", "Xiao");
        Updates path1_4 = Updates(5, "Patch 1.4", "Poema em Taças", "FINALIZADO", "Elegia do Suspiro Final | Lâmina Celestial", "Sucrose | Razor | Noelle", "17/Mar - 06/Abril de 2021", "Venti (Rerun)");
        Updates path1_5 = Updates(6, "Patch 1.5", "Aristocracia Ermida", "FINALIZADO", "Cortadora de Montanhas | Memórias de Poeira", "Yanfei | Noelle | Diona", "28/Abr - 18/Mai de 2021", "Zhongli (Rerun)");
        Updates path1_6 = Updates(7, "Patch 1.6", "Passos Flamejantes", "FINALIZADO", "Oração Perdida aos Ventos Sagrados | Orgulho Celestial", "Sucrose | Fischl | Barbara", "09/Jun - 29/Jun de 2021", "Klee (Rerun)");
        Updates path2_0 = Updates(8, "Patch 2.0", "Jardim da Garça", "FINALIZADO", "Cortadora da Neblina Reforjada | Espinha Celestial", "Yanfei | Ningguang | Chongyun", "21/Jul - 01/Ago de 2021", "Kamisato Ayaka");
        Updates path2_1 = Updates(9, "Patch 2.1", "Reino da Serenidade", "FINALIZADO", "Luz do Cortador de Grama | Espada Áspera", "Sucrose | Xiangling | Kojou Sara", "21/Jul - 01/Set de 2021", "Shogun Raiden");
        Updates path2_2 = Updates(10, "Patch 2.2", "Despedida para o Norte", "FINALIZADO", "null", "Yanfei | Ningguang | Chongyun", "13/Out - 02/Nov de 2021", "Targlia");
        Updates path2_3 = Updates(11, "Patch 2.3", "Notícias Enigmáticas / FOrmação das Ondas", "FINALIZADO", "Juramento Pela Liberdade | Canção dos Pinhos", "Rosaria | Noelle | Bennett", "24/Nov - 14/Dez de 2021", "Albedo | Eula");
        Updates path2_4 = Updates(12, "Patch 2.4", "Aristocracia Ermida / Perguntas Temporárias", "FINALIZADO", "Perfuradora Prismática | Arco de Amos", "Xingqlu | Beidou | Yanfei", "25/Jan - 15/Fez de 2022", "Zhongli | Ganyu");
        Updates path2_5 = Updates(13, "Patch 2.5", "Sakura Roxa Eterna", "FINALIZADO", "Prova de Kagura | Cortadora de Jade Primordial", "Diona | Fischl | Thoma", "27/Set - 18/Out de 2020", "Yae Miko");
        Updates path2_6 = Updates(14, "Patch 2.6", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path2_7 = Updates(15, "Patch 2.7", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path2_8 = Updates(16, "Patch 2.8", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_0 = Updates(17, "Patch 3.0", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_1 = Updates(18, "Patch 3.1", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_2 = Updates(19, "Patch 3.1", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_3 = Updates(20, "Patch 3.2", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_4 = Updates(21, "Patch 3.3", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");
        Updates path3_5 = Updates(22, "Patch 3.4", "", "FINALIZADO", "", "", "27/Set - 18/Out de 2020", "");

        this.updatesRepository.save(path1_0);
        System.out.println("Patch save in database");
    }
}
