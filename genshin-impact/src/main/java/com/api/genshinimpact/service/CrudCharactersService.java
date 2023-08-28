package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.CharactersDTO;
import com.api.genshinimpact.entities.Characters;
import com.api.genshinimpact.repository.CharactersRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CrudCharactersService {

    private CharactersRepository charactersRepository;
    public CrudCharactersService(CharactersRepository charactersRepository){
        this.charactersRepository = charactersRepository;
    }
    public List<Characters>findALL(){
        return (List<Characters>) charactersRepository.findAll();
    }

    public CharactersDTO findById(Integer id){
        Characters obj = charactersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Character not found in database with id: " + id));
        return new CharactersDTO(obj);
    }

    public List<Characters> findCharacterByName(String name){
        List<Characters> characters = charactersRepository.findByName(name);
        if (characters.isEmpty()){
            throw new EntityNotFoundException("Character with name '" + name + "' not found");
        }
        return characters;
    }
    public void insertData(){

        //about the PATH, is "../../assets/characters/" for everybody that stay here

        //--------------------- INSERINDO PERSONAGENS ---------------------
        Characters albedo = new Characters(1, "Albedo", "Cavaleiros de Favonius", 90, "Um gênio conhecido como Príncipe do Giz, ele é o Chefe Alquimista e Capitão da Equipe de Investigação dos Cavaleiros de Favonius.", "12/2020", "Masculino", "Ataque Normal: Técnica da Espada de Favonius - Branco | Abiogênese - Radiação Solar | Ritual da Progenitura - Maré Tectônica", "Pressão Calcária: Fase de Ascensão 1 | Sabedoria em Uma Garrafa: Fase de Ascensão 4 | Gênio Despertado: Passive", "Flor de Éden | Éon da Vida | Esplendor Solar | Queda Divina | Maré de Hadeano | Peoira da Purificação", "../../assets/characters/albedo.webp");
        Characters Alhaitham = new Characters(2, "Alhaitham", "Academia de Sumeru", 90, "O Atual escriba da academia Sumero,  um homem de grande inteligencia e talento. Vive sua vida livre e despreocupado, sendo uma pessoa muito difícil de se encontrar", "01/2023", "Masculino", "Ataque Normal: Metodo investigativo reverso | Entendimento Mútuo: Representação do Conhecimento | Alienação: REstrição de Ilustraçaõ", "Quatro Principios de Retificaão | Revelação da FLoresta dos Enigmaas | Lei da redução de Superdeterminada", "Observaão Direta | Debate | Anotações Escondidas | Aplicação da Justiça | O Grau de Sabedoria | Raciocinio Correto", "../../assets/characters/alhaitham.webp");
        Characters Aloy = new Characters(3, "Aloy", "Cavaleiro Errante", 90, "Era uma pária, agora uma caçadora de uma avidez inigualável. Pronta para fazer a coisa certa com seu arco, a qualquer momento.", "10/2021", "Feminino", "Ataque Normal: Disparos Rápidos | Natureza Gélida | Profecias do Alvorecer", "Percepção de Combate | Ataque Poderoso | Devagarinho", "Estrela de Outro Mundo: Nv.1 -> | Estrela de Outro Mundo: Nv.2 -> | Estrela de Outro Mundo: Nv.3 -> | Estrela de Outro Mundo: Nv.4 -> | Estrela de Outro Mundo: Nv.5 -> | Estrela de Outro Mundo: Nv.6 ->  ", "../../assets/characters/aloy.webp");
        Characters Amber = new Characters(4, "Amber", "Cavaleiros de Favonius", 90, "Sempre energética e cheia de vida, a Amber é a melhor, mas também a última Aventureira dos Cavaleiros de Favonius.", "09/2020", "Feminino", "Ataque Normal: Pontaria | Marionete Explosiva | Chuva Ardente", "Ninguém consegue fugir do meu campo de visão! | Disparo Preciso | Campeã Voadora", "Uma Flecha para Todos Governar | Coelho Ativado | Isso, Queima! | Não É Uma Boneca Qualquer... | É o Barão Coelho | Fogo Vivo", "../../assets/characters/amber.webp");
        Characters Arataki_Itto = new Characters(5, "Arataki Itto", "Gangue Arataki", 90, "O primeiro e maior chefe da Gangue Arataki, famosa em Hanamizaka, na cidade de Inazuma... Espere, o quê? Nunca ouviu falar deles? Sério?", "12/2022", "Masculino", "Ataque Normal: Lenda do Combate | Masatsu Zetsugi: Explosão Akaushi! | Descendência Real: Contemplem, Itto o Maligno!", "Arataki Ichiban | Linhagem do Oni Carmesim | Itto o Lenhador", "Fique um Tempo e Escute | Juntem-se, Hora da Briga! | Lá Vem o Touro! | Cárcere Privado | 10 Anos de Fama de Hanamizaka | Arataki Itto, Presente!", "../../assets/characters/arataki_itto.webp");
        Characters Baizhu = new Characters(6, "Beizhu", "Chalé de Bubu", 90, "O dono do Chalé de Bubu, sempre com uma cobra branca chamada Changsheng pendurada no pescoço. Um grande conhecedor de medicina, suas verdadeiras intenções são um grande mistério.", "04/2023", "Ataque Normal: Acupuntura Dourada | Diagnóstico Universal | Cura Holística", "Ataque Normal: Acupuntura Dourada | Diagnóstico Universal | Cura Holística", "Cinco Fortunas Eternas | Mãe Terra | Nutrição Herbal", "Observação Atenta | Discernimento Incisivo | Estabilidade Total | Percepção Ancestral | Sinais Ocultos da Mudança | Eliminação de Qi Malicioso", "../../assets/characters/baizhu.webp");
        Characters Barbara = new Characters(7, "Barbara", "Igreja Favonius", 90, "Todos os habitantes de Mondstadt adoram a Barbara. Contudo, ela viu a palavra ídolo pela primeira vez em uma revista.", "09/2020", "Feminino", "Ataque Normal: Suspiro da Água | Que Comece o Espetáculo | Milagre Brilhante", "Temporada Gloriosa | Encora | Com todo o meu coração", "Balada Alegre | Explosão de Vitalidade | Estrela de Amanhã | A Atenção é o meu podeer | Vinculo de Inocencia | Dedicando tudo para você", "../../assets/characters/barbara.webp");
        Characters Beidou = new Characters(8, "Beidou", "Frota Crux", 90, "Líder da Frota Crux. Ela é uma chefe sem limites e franca.", "01/2022", "Feminino", "Ataque Normal: Conquista do Oceano | Invocadora da Maré | Quebrador de Tempestades", "Retribuição | Tormenta Elétrica | Conquistadora das Marés", "Flagelo da Fera do Mar | Sobre o Mar Turbulento, o Trovão Surge | Invocadora da Tempestade | Vingança Impressionante | Caminhante da Maré Carmesim | Destruição do Mal", "../../assets/characters/beidou.webp");
        Characters Bennett = new Characters(9, "Bennett", "Guilda de Aventureiros", 90, "Um aventureiro de Mondstadt justo e bondoso, mas muito azarado.", "03/2022", "Masculino", "Ataque Normal: Espada da Sorte | Sobrecarga de Paixão | Viagem Fantástica", "Ressurgimento da Paixão | Fervor Intrépido | Deve Ser Seguro...", "Grande Expectativa | Escape da Desolação | Paixão Ardente | Odisseia Inesperada | O Verdadeiro Explorador | Fogo e Coragem", "../../assets/characters/bennett.webp");
        Characters Candance = new Characters(10, "Candance", "Vila Aaru", 90, "Guardiã da Vila Aaru, descendente do Rei Deshret, seu olho esquerdo é da cor do âmbar.", "09/2022", "Feminina", "Ataque Normal: Lança Reluzente - Postura Guardiã | Ritual Sagrado: Garça Guardiã | Ritual Sagrado: Maré dos Alvéolas", "Proteção Plúmea | Arco das Areias | Aurora Primordial", "Herdeira das Areias Escarlates Ressurgida | Brilho Perfura-Luas | Devoção a Caça | Juramento da Sentinela | Olhos Douradouros | Inundação", "../../assets/characters/candace.webp");
        Characters Collei = new Characters(11, "Collei", "Vila Gandharva", 90, "Uma Guarda-Florestal em Treinamento que patrulha a Floresta Avidya. Por trás de seu entusiasmo, encontra-se uma personalidade bastante introvertida.", "08/2022", "Feminino", "Ataque Normal: Homenagem ao Tiro com Arco | Carícia das Flores | Segredo Miauvilhoso", "Retorno Floral | Quietude da Floresta | Campeã Voadora de Sumeru", "Patrulha Florestal | Pelas Colinas e Bosques | Fragrância de Verão", "../../assets/characters/collei.webp");
/*
        Characters Cyno = new Characters(12, "Cyno", "", 1-90, "", "03/2023", "Masculino", "", "", "../../assets/characters/");
        Characters Dehya = new Characters(13, "Dehya", "", 1-90, "", "03/2023", "Feminino", "", "", "../../assets/characters/");
        Characters Diluc = new Characters(14, "Diluc", "", 1-90, "", "09/2020", "Masculino", "", "", "../../assets/characters/");
        Characters Diona = new Characters(15, "Diona", "", 1-90, "", "11//2020", "Feminino", "", "", "../../assets/characters/");
        Characters Dori = new Characters(16, "Dori", "", 1-90, "", "09/2022", "Feminino", "", "", "../../assets/characters/");
        Characters Eula = new Characters(17, "Eula", "", 1-90, "", "05/2021", "Feminino", "", "", "../../assets/characters/");
        Characters Faruzan = new Characters(18, "Faruzan", "", 1-90, "", "07/2022", "Feminino", "", "", "../../assets/characters/");
        Characters Fischi = new Characters(19, "Fischi", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Ganyu = new Characters(20, "Ganyu", "", 1-90, "", "01/2021", "Feminino", "", "", "");
        Characters Gorou = new Characters(21, "Gorou", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Hutao = new Characters(22, "Hutao", "", 1-90, "", "03/2021", "Feminino", "", "", "");
        Characters Jean = new Characters(23, "Jean", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Kaedehara_Kazuha = new Characters(24, "Kaedehara_Kazuha", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Kaeya = new Characters(25, "Kaeya", "", 0, "", "09/2020", "Masculino", "", "", "");
        Characters Kamisato_Ayaka = new Characters(26, "Kamisato_Ayaka", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Kamisato_Ayato = new Characters(27, "Kamisato_Ayato", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Kaveh = new Characters(28, "Kaveh", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Keqing = new Characters(29, "Keqing", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Kirara = new Characters(30, "Kirara", "", 1-90, "", "05/2023", "Feminino", "", "", "");
        Characters Klee = new Characters(31, "Klee", "", 1-90, "", "10/2020", "Feminino", "", "", "");
        Characters Kujou_Sara = new Characters(32, "Kujou_Sara", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Kuki_Shinobu = new Characters(33, "Kuki_Shinobu", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Laya = new Characters(34, "Laya", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Lisa = new Characters(35, "Lisa", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Mika = new Characters(36, "Mika", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Mona = new Characters(37, "Mona", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Nahida = new Characters(38, "Nahida", "", 1-90, "", "11/2022", "Feminino", "", "", "");
        Characters Nilou = new Characters(39, "Nilou", "", 1-90, "", "14/2022", "Feminino", "", "", "");
        Characters Ningguang = new Characters(40, "Ningguang", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Noelle = new Characters(41, "Noelle", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Qiqi = new Characters(42, "Qiqi", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Shogun_Raiden = new Characters(43, "Shogun_Raiden", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Razor = new Characters(44, "Razor", "", 1-90, "", "09/2020", "Masculino", "", "", "");
        Characters Rosaria = new Characters(45, "Rosaria", "", 1-90, "", "04/2021", "Feminino", "", "", "");
        Characters Sangonomiya_Kokomi = new Characters(46, "Sangonomiya_Kokomi", "", 1-90, "", "", "Feminino", "", "", "");
        Characters Sayu = new Characters(47, "Sayu", "", 1-90, "", "08/2021", "Feminino", "", "", "");
        Characters Shenhe = new Characters(48, "Shenhe", "", 1-90, "", "01/2022", "Feminino", "", "", "");
        Characters Shikanoin_Heizou = new Characters(49, "Shikanoin_Heizou", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Sucrose = new Characters(50, "Sucrose", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Tartaglia = new Characters(51, "Tartaglia", "", 1-90, "", "11/2020", "Masculino", "", "", "");
        Characters Thoma = new Characters(52, "Thoma", "", 1-90, "", "11/2021", "Masculino", "", "", "");
        Characters Tighnari = new Characters(53, "Tighnari", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Viajante_Anemo = new Characters(54, "Viajante (Anemo)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Dentro = new Characters(55, "Viajante (Dentro)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Electro = new Characters(56, "Viajante (Electro)", "", 1-90, "", "", "", "", "", "");
        Characters Viajante_Geo = new Characters(57, "Viajante (Geo)", "", 1-90, "", "", "Masculino", "", "", "");
        Characters Venti = new Characters(58, "Venti", "", 1-90, "", "09/2020", "Masculino", "", "", "");
        Characters Andarilho = new Characters(59, "Andarilho", "", 1-90, "", "", "", "", "", "");
        Characters Xiangling = new Characters(60, "Xiangling", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Xiao = new Characters(61, "Xiao", "", 1-90, "", "02/2021", "Masculino", "", "", "");
        Characters Xingqiu = new Characters(62, "Xingqiu", "", 1-90, "", "09/2020", "Feminino", "", "", "");
        Characters Xinyan = new Characters(63, "Xinyan", "", 1-90, "", "12/2020", "Feminino", "", "", "");
        Characters Yae_Miko = new Characters(64, "Yae_Miko", "", 1-90, "", "", "", "", "", "");
        Characters Yanfei = new Characters(65, "Yanfei", "", 1-90, "", "04/2021", "Feminino", "", "", "");
        Characters Yaoyao = new Characters(66, "Yaoyao", "", 1-90, "", "01/2023", "Feminino", "", "", "");
        Characters Yelan = new Characters(67, "Yelan", "", 1-90, "", "05/2022", "Feminino", "", "", "");
        Characters Yoimiya = new Characters(68, "Yoimiya", "", 1-90, "", "08/2021", "Feminino", "", "", "");
        Characters Yunjin = new Characters(69, "Yunjin", "", 1-90, "", "01/2022", "Feminino", "", "", "");
        Characters Zhongli = new Characters(70, "Zhongli", "", 1-90, "", "12/2020", "Masculino", "", "", "");*/

        //---------- SALVANDO NO BANCO DE DADOS
        this.charactersRepository.save(albedo);
        this.charactersRepository.save(Alhaitham);
        this.charactersRepository.save(Aloy);
        this.charactersRepository.save(Amber);
        this.charactersRepository.save(Arataki_Itto);
        this.charactersRepository.save(Baizhu);
        this.charactersRepository.save(Bennett);
        this.charactersRepository.save(Beidou);
        this.charactersRepository.save(Barbara);
        this.charactersRepository.save(Candance);
        this.charactersRepository.save(Collei);
/*
        this.charactersRepository.save(Cyno);
        this.charactersRepository.save(Dehya);
        this.charactersRepository.save(Diluc);
        this.charactersRepository.save(Diona);
        this.charactersRepository.save(Dori);
        this.charactersRepository.save(Eula);
        this.charactersRepository.save(Faruzan);
        this.charactersRepository.save(Dischi);
        this.charactersRepository.save(Ganyu);
        this.charactersRepository.save(Gorou);
        this.charactersRepository.save(Hutao);
        this.charactersRepository.save(Jean);
        this.charactersRepository.save(Kaedehara_Kazuha);
        this.charactersRepository.save(Kaeya);
        this.charactersRepository.save(Kamisato_Ayaka);
        this.charactersRepository.save(Kaveh);
        this.charactersRepository.save(Kamisato_Ayato);
        this.charactersRepository.save(Keqing);
        this.charactersRepository.save(Kirara);
        this.charactersRepository.save(Klee);
        this.charactersRepository.save(Kujou_Sara);
        this.charactersRepository.save(Laya);
        this.charactersRepository.save(Kuki_Shinobu);
        this.charactersRepository.save(Lisa);
        this.charactersRepository.save(Mika);
        this.charactersRepository.save(Mona);
        this.charactersRepository.save(Nahida);
        this.charactersRepository.save(Nilou);
        this.charactersRepository.save(Ningguang);
        this.charactersRepository.save(Noelle);
        this.charactersRepository.save(Qiqi);
        this.charactersRepository.save(Shogun_Raiden);
        this.charactersRepository.save(Razor);
        this.charactersRepository.save(Rosaria);
        this.charactersRepository.save(Sangonomiya_Kokomi);
        this.charactersRepository.save(Sayu);
        this.charactersRepository.save(Shenhe);
        this.charactersRepository.save(Sucrose);
        this.charactersRepository.save(Shikanoin_Heizou);
        this.charactersRepository.save(Tartaglia);
        this.charactersRepository.save(Thoma);
        this.charactersRepository.save(Tighnari);
        this.charactersRepository.save(Viajante_Anemo);
        this.charactersRepository.save(Viajante_Dentro);
        this.charactersRepository.save(Viajante_Electro);
        this.charactersRepository.save(Viajante_Geo);
        this.charactersRepository.save(Venti);
        this.charactersRepository.save(Andarilho);
        this.charactersRepository.save(Xiangling);
        this.charactersRepository.save(Xiao);
        this.charactersRepository.save(Xingqiu);
        this.charactersRepository.save(Xinyan);
        this.charactersRepository.save(Yae_Miko);
        this.charactersRepository.save(Yanfei);
        this.charactersRepository.save(Yaoyao);
        this.charactersRepository.save(Yelan);
        this.charactersRepository.save(Yoimiya);
        this.charactersRepository.save(Yunjin);
        this.charactersRepository.save(Zhongli);*/

        System.out.println("Characters save in database");
    }

    //----------- SELECIONAR DADOS DA TABELA CHARACTERS ------
    /*public void selectData(){
        Iterable<Character> characters = this.charactersRepository.findAll();
        for (Characters characters1 : characters){
            System.out.println(characters1);
        }
    };*/
}
