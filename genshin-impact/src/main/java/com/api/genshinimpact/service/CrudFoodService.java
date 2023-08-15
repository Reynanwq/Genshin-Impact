package com.api.genshinimpact.service;

import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.entities.Food;
import com.api.genshinimpact.repository.FoodRepository;
import com.api.genshinimpact.service.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CrudFoodService {
    private FoodRepository foodRepository;

    public CrudFoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public void insertData(){
        //COMIDAS DO TIPO NORMAL
        Food arroz_mistura_de_aaru = new Food(1, "Arroz Mistura de Aaru", "Restaura 50 de Stamina", 2, "Normal", "");
        Food tentacao_dos_adeptos = new Food(2, "Tentação dos Adeptus", "Aumenta o ATQ em 316 e a Taxa CRIT em 10% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 5, "Normal", "");
        Food sanduiche_aventureiro = new Food(3, "Sanduíche do Aventureiro", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food tofu_amendoas = new Food(4, "Tofu de Amêndoas", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 2, "Normal", "");
        Food baklava = new Food(5, "Baklava", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food sopa_bambu = new Food(6, "Sopa de Bambu", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 3, "Normal", "");
        Food mizu_manjuu_de_baga = new Food(7, "Mizu Manjuu de Baga", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 2, "Normal", "");
        Food ensopado_do_arconde_anemo = new Food(8, "Ensopado do Arconte Anemo", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 3, "Normal", "");
        Food sushi_de_ovo_de_passaro = new Food(9, "Sushi de Ovo de Pássaro", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food biryani = new Food(10, "Biryani", "Aumenta a DEF em 261 e o Efeito de Cura em 8% de todos os personagens da equipe por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 4, "Normal", "");
        Food ensopado_de_poleiro_com_dorso_negro = new Food(11, "Ensopado de Poleiro com Dorso Negro", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 3, "Normal", "");
        Food abundancia_anual = new Food(12, "Abundância Anual", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 4, "Normal", "");
        Food carneBestialRefogada = new Food(13, "Carne Bestial Refogada", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food frangoNaManteiga = new Food(14, "Frango na Manteiga", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 3, "Normal", "");
        Food caranguejoNaManteiga = new Food(15, "Caranguejo na Manteiga", "Aumenta a DEF em 261 e o Efeito de Cura em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 4, "Normal", "");
        Food sopaDeLotusDeLeiteEFrutosDoMar = new Food(16, "Sopa de Lótus de Leite e Frutos do Mar", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food doceDeMelComTamaras = new Food(17, "Doce de Mel com Tâmaras", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food boloDeCocoCarvao = new Food(18, "Bolo de Coco-Carvão", "Revive um personagem e restaura 1200 de Vida.", 3, "Normal", "");
        Food caldoDeTofuComGalinha = new Food(19, "Caldo de Tofu com Galinha", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food espetoDeFrangoComCogumelos = new Food(20, "Espeto de Frango com Cogumelos", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food bolinhoDeCarnePicante = new Food(21, "Bolinho de Carne Picante", "Aumenta a Força do Escudo em 30% e a DEF em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 3, "Normal", "");
        Food pratoDeCarnesFrias = new Food(22, "Prato de Carnes Frias", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food venhaPorEla = new Food(23, "Venha por Ela", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food caranguejoPresuntoEVegetaisAssados = new Food(24, "Caranguejo, Presunto e Vegetais Assados", "Revive um personagem e restaura 1200 de Vida.", 3, "Normal", "");
        Food ovasDeCaranguejoAssadas = new Food(25, "Ovas de Caranguejo Assadas", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 3, "Normal", "");
        Food tofuComOvasDeCaranguejo = new Food(26, "Tofu com Ovas de Caranguejo", "Revive um personagem e restaura 400 de Vida.", 2, "Normal", "");
        Food ensopadoDeCreme = new Food(27, "Ensopado de Creme", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 3, "Normal", "");
        Food pratoDeCamaraoEBatataCrocante = new Food(28, "Prato de Camarão e Batata Crocante", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 3, "Normal", "");
        Food camaraoDeCristal = new Food(29, "Camarão de Cristal", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food porcoCuradoComMatsutake = new Food(30, "Porco Curado com Matsutake", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food camaraoComCurry = new Food(31, "Camarão com Curry", "Restaura 22% da Vida Máxima e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food macarraoBarbaDeDragao = new Food(32, "Macarrão Barba de Dragão", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food peixeSecoSalgado = new Food(33, "Peixe Seco Salgado", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food rolinhoDeOvoDePassaro = new Food(34, "Rolinho de Ovo de Pássaro", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food biscoitosAmanteigadosComGlace = new Food(35, "Biscoitos Amanteigados com Glacê", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "");
        Food peixeAoCreme = new Food(36, "Peixe ao Creme", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food torradaDoPescador = new Food(37, "Torrada do Pescador", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food cincoTesourosEmConserva = new Food(38, "Cinco Tesouros em Conserva", "Restaura 85 de Stamina.", 1, "Normal", "");
        Food macarraoABolonhesaPicante = new Food(39, "Macarrão à Bolonhesa Picante", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food pureDeBatatasAromatizado = new Food(40, "Purê de Batatas Aromatizado", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food bolinhasDeRabaneteFritas = new Food(41, "Bolinhas de Rabanete Fritas", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food frutasDoFestival = new Food(42, "Frutas do Festival", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food ovoDeLuaCheia = new Food(43, "Ovo de Lua Cheia", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "");
        Food caldeiradaDourada = new Food(44, "Caldeirada Dourada", "Aumenta a Vida Máxima de todos os membros da Equipe em 22% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food hamburguerDeFrangoDourado = new Food(45, "Hambúrguer de Frango Dourado", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food caranguejoDourado = new Food(46, "Caranguejo Dourado", "Aumenta a DEF em 261 e o Efeito de Cura em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food galinhaDouradaFrita = new Food(47, "Galinha Dourada Frita", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food almôndegasDouradasDeCamarão = new Food(48, "Almôndegas Douradas de Camarão", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "");
        Food guisadoDeLegumesAoMolho = new Food(49, "Guisado de Legumes ao Molho", "Diminui levemente o crescimento do Frio Extremo para todos os personagens por 900s. No modo multijogador, esse efeito é aplicado apenas ao seu próprio personagem.", 1, "Normal", "");
        Food food1 = new Food(50, "Peixe Tigre Frito", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food food2 = new Food(51, "Filé Unagi Grelhado", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food3 = new Food(52, "Carne de Ave Cruzada", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food4 = new Food(53, "Refeição Revigorante Miau", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food5 = new Food(54, "Sopa de Fruta Jade", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food6 = new Food(55, "Porção de Jade", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food7 = new Food(56, "Ensopado de Gemas", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food8 = new Food(57, "Frango de Pimenta de Jueyun", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food9 = new Food(58, "Guoba de Jueyun", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food10 = new Food(59, "Sanduíche de Katsu", "Aumenta o ATQ de todos os membros da equipe em 81 pontos por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food11 = new Food(60, "Cozido de Konda", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "");
        Food food12 = new Food(61, "Rolinho de Peixe Lambad", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food food13 = new Food(62, "Bolinho de Flor Lótus", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food14 = new Food(63, "Sopa de Lótus e Ovo", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food15 = new Food(64, "Bolinhas de Queijo ao Masala", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food16 = new Food(65, "Enroladinho de Carne com Matsutake", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food17 = new Food(66, "Pizza de Carne e Cogumelos", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food18 = new Food(67, "Torre Crocante de Cogumelo ao Leite", "Restaura 32% da Vida Máxima e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food19 = new Food(68, "Gelatina de Menta", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food food20 = new Food(69, "Salada de Menta", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food21 = new Food(70, "Sopa de Feijão com Menta", "Aumenta o ATQ de todos os membros da Equipe em 81 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food22 = new Food(71, "Chá de Menta com Frutas", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food food23 = new Food(72, "Enroladinho de Carne com Menta", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food24 = new Food(73, "Sopa de Miso", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "");
        Food food25 = new Food(74, "Yakisoba Misto", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food26 = new Food(75, "Peixe Grelhado de Mondstadt", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food food27 = new Food(76, "Bolinho de Batata de Mondstadt", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food28 = new Food(77, "Torta da Lua", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food29 = new Food(78, "Carne de Mora", "Aumenta a Força do Escudo em 30% e a DEF em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food30 = new Food(79, "Mais e Mais", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food food31 = new Food(80, "Panelão de Cogumelos", "Aumenta o Dano Físico de todos os membros do Grupo em 30% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food32 = new Food(81, "Pizza de Cogumelos", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food33 = new Food(82, "Macarrão com Delícias das Montanhas", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food34 = new Food(83, "Ensopado de Maçã do Norte", "Restaura 50 de Stamina", 1, "Normal", "");
        Food food35 = new Food(84, "Frango Defumado do Norte", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food36 = new Food(85, "Omelete de Arroz", "Restaura 50 de Stamina", 1, "Normal", "");
        Food food37 = new Food(86, "Tofu de Oncidium", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "");
        Food food38 = new Food(87, "Onigiri", "Restaura 85 de Stamina.", 1, "Normal", "");
        Food food39 = new Food(88, "Pudim de Padisarah", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food40 = new Food(89, "Panipuri", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "";
        Food food41 = new Food(90, "\"Empilhar\"", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "");
        Food food42 = new Food(91, "Pão Pita", "Aumenta a Taxa CRIT de todos os membros da Equipe em 15% por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food43 = new Food(92, "Navio de Batata", "Restaura 32% da Vida Máxima e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food44 = new Food(93, "Prato Rústico de Qingce", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "");
        Food food45 = new Food(94, "Guisado Fresco de Peixe e Rabanete", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food46 = new Food(95, "Sopa de Rabanete e Vegetais", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food47 = new Food(96, "Áster Arco-íris", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food48 = new Food(97, "Bolinha de Arroz", "Diminui o consumo de Stamina ao correr e planar de todos os membros da equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "");
        Food food49 = new Food(98, "Cozido Misto do Mercado", "Restaura 9% de Vida Máxima e 1000 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food food50 = new Food(99, "Pudim de Arroz", "Aumenta a DEF de todos os membros da Equipe em 200 por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food51 = new Food(100, "Creme de Rosa", "Restaura 85 de Stamina.", 1, "Normal", "");
        Food food52 = new Food(101, "Guisado de Carne de Sabz", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food53 = new Food(102, "Sakura Mochi", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food54 = new Food(103, "Biscoitos de Sakura e Camarão", "Revive um personagem e restaura 1200 de Vida.", 1, "Normal", "");
        Food food55 = new Food(104, "Tempura de Sakura", "Aumenta a Vida Máxima de todos os membros da Equipe em 22% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food56 = new Food(105, "Samosa", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food57 = new Food(106, "Sangayaki", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food58 = new Food(107, "Prato de Sashimi", "Diminui o consumo de Stamina ao correr de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food59 = new Food(108, "Salada Saudável", "Aumenta o ATQ de todos os membros da equipe em 81 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food60 = new Food(109, "Matsutake Salteado", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food food61 = new Food(110, "Enroladinho de Carne Perfumado", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food food62 = new Food(111, "Salada Tropical", "Possui uma chance de restaurar 26%/32%/38% da Vida Máxima e 950/1250/1550 de Vida adicional para o personagem selecionado.", 1, "Normal", "");
        Food food63 = new Food(112, "Rolinho Shawarma", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food64 = new Food(113, "Macarrão Soba", "Aumenta o ATQ de todos os membros da equipe em 81 por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food food65 = new Food(114, "Peixe Esquilo", "Restaura 9% da Vida Máxima do personagem selecionado e regenera 260 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food food66 = new Food(115, "Bife", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food food67 = new Food(116, "Carne Frita com Cenoura e Mel", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food food68 = new Food(117, "Carne Frita", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 2, "Normal", "");
        Food food69 = new Food(118, "Macarrão com Peixe Frito", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food food70 = new Food(119, "Camarão Salteado", "Restaura 20% da Vida Máxima do personagem selecionado e regenera 390 de Vida a cada 5s por 30s.", 3, "Normal", "");
        Food food71 = new Food(120, "Iguarias do Porto de Pedra", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 2, "Normal", "");
        Food food72 = new Food(121, "Chá de Baga do Crepúsculo", "Aumenta a Taxa CRIT de todos os membros da Equipe em 9% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 3, "Normal", "");
        Food peixeFritoNaManteiga = new Food(122, "Peixe Frito na Manteiga", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food superEstimadaPizza = new Food(123, "Super Estimada Pizza", "Aumenta o Dano Físico em 35% e a Taxa CRIT em 8% de todos os membros da Equipe por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food frangoAssadoComMel = new Food(124, "Frango Assado com Mel", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food sushiDeCamaraoDoce = new Food(125, "Sushi de Camarão Doce", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food tahchin = new Food(126, "Tahchin", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food taiyaki = new Food(127, "Taiyaki", "Restaura 28% da Vida Máxima do personagem selecionado e regenera 620 de Vida a cada 5s por 30s.", 1, "Normal", "");
        Food frangoAssadoTandoori = new Food(128, "Frango Assado Tandoori", "Aumenta o ATQ em 272 e a Taxa CRIT em 8% de todos os personagens da equipe por 300s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");
        Food panquecaDoChaDaTarde = new Food(129, "Panqueca do Chá da Tarde", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "");
        Food ovoFritoDeTeyvat = new Food(130, "Ovo Frito de Teyvat", "Revive um personagem e restaura 100 de Vida.", 1, "Normal", "");
        Food carneDeTianshu = new Food(131, "Carne de Tianshu", "Aumenta o Dano Físico em 35% e a Taxa CRIT em 8% de todos os membros da Equipe por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food ramenTonkotsu = new Food(132, "Ramen Tonkotsu", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food dangoDeTresCores = new Food(133, "Dango de Três Cores", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food espetoDeTresSabores = new Food(134, "Espeto de Três Sabores", "Aumenta o ATQ de todos os membros da Equipe em 194 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food tirasDeTresSabores = new Food(135, "Tiras de Três Sabores", "Aumenta a Força do Escudo de todos os membros da Equipe em 25% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food frutasAoMel = new Food(136, "Frutas ao Mel", "Diminui o consumo de Stamina ao correr e planar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito tem efeito apenas em si mesmo.", 1, "Normal", "");
        Food sushiDeAtum = new Food(137, "Sushi de Atum", "Restaura 22% de Vida e 1200 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food macarraoUdon = new Food(138, "Macarrão Udon", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "");
        Food carneFrescaChazuke = new Food(139, "Carne Fresca Chazuke", "Aumenta o bônus de cura de todos os membros da Equipe em 17% por 300s. No modo multijogador, terá efeito apenas em si mesmo.", 1, "Normal", "");
        Food pazUniversal = new Food(140, "Paz Universal", "Restaura 32% de Vida e 1250 de Vida para o personagem selecionado.", 1, "Normal", "");
        Food abaloneVegetariano = new Food(141, "Abalone Vegetariano", "Revive um personagem e restaura 400 de Vida.", 1, "Normal", "");
        Food wakatakeni = new Food(142, "Wakatakeni", "Aumenta a DEF de todos os membros da Equipe em 107 por 300s. No modo multijogador, terá efeito em si mesmo.", 1, "Normal", "");
        Food chopSueyDeZhongyuan = new Food(143, "Chop Suey de Zhongyuan", "Diminui o consumo de Stamina ao correr e escalar de todos os membros da Equipe em 20% por 900s. Durante o modo multijogador, este efeito é aplicado apenas em si mesmo.", 1, "Normal", "");


    
        //COMIDAS DO TIPO DELICIOSO
        Food arroz_mistura_de_aaru_delicioso = new Food(144, "Arroz Mistura de Aaru Delicioso", "Restaura 60 de Stamina", 2, "Delicioso", "");

        //COMIDAS DO TIPO SUSPEITO
         Food foodVAR = new Food(145, "Arroz Mistura de Aaru Estranho", "Restaura 40 de Stamina", 2, "Suspeito", "");
    

        //COMIDAS DO TIPO ESPECIAL
        Food cuidado_extremo = new Food(146, "Cuidado Extremo", "Restaura 80 de Stamina", 2, "Especial", "");

        this.foodRepository.save(arroz_mistura_de_aaru);
    }

    //----------- SELECIONAR DADOS DA TABELA FOOD ----------
    public void selectData(){
        Iterable<Food> foods = this.foodRepository.findAll();
        for (Food food : foods){
            System.out.println(food);
        }
    };

    public FoodDTO findById(Integer id){
        Food obj = foodRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Food not found in database with id: " + id)
        );
        return new FoodDTO(obj);
    }
}
