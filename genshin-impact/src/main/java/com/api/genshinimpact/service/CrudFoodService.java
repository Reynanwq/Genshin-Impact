package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Food;
import com.api.genshinimpact.arm.Updates;
import com.api.genshinimpact.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudFoodService {
    private FoodRepository foodRepository;

    public CrudFoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public void insertData(){
        //COMIDAS DO TIPO NORMAL
        Food arroz_mistura_de_aaru = new Food(1, "Arroz Mistura de Aaru", "Restaura 50 de Stamina", 2, "Normal");
        Food foodVAR = new Food(2, "", "", 0, "Normal");
        Food foodVAR = new Food(2, "", "", 0, "Normal");
        Food foodVAR = new Food(3, "", "", 0, "Normal");
        Food foodVAR = new Food(4, "", "", 0, "Normal");
        Food foodVAR = new Food(5, "", "", 0, "Normal");
        Food foodVAR = new Food(6, "", "", 0, "Normal");
        Food foodVAR = new Food(7, "", "", 0, "Normal");
        Food foodVAR = new Food(8, "", "", 0, "Normal");
        Food foodVAR = new Food(9, "", "", 0, "Normal");
        Food foodVAR = new Food(10, "", "", 0, "Normal");
        Food foodVAR = new Food(11, "", "", 0, "Normal");
        Food foodVAR = new Food(12, "", "", 0, "Normal");
        Food foodVAR = new Food(13, "", "", 0, "Normal");
        Food foodVAR = new Food(14, "", "", 0, "Normal");
        Food foodVAR = new Food(15, "", "", 0, "Normal");
        Food foodVAR = new Food(16, "", "", 0, "Normal");
        Food foodVAR = new Food(17, "", "", 0, "Normal");
        Food foodVAR = new Food(18, "", "", 0, "Normal");

        //COMIDAS DO TIPO DELICIOSO
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");
        Food foodVAR = new Food(2, "", "", 0, "Delicioso");

        //COMIDAS DO TIPO SUSPEITO
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");
        Food foodVAR = new Food(2, "", "", 0, "Suspeito");

        //COMIDAS DO TIPO ESPECIAL
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");
        Food foodVAR = new Food(2, "", "", 0, "Especial");


        this.foodRepository.save(arroz_mistura_de_aaru);
    }

    //----------- SELECIONAR DADOS DA TABELA FOOD ----------
    public void selectData(){
        Iterable<Food> foods = this.foodRepository.findAll();
        for (Food food : foods){
            System.out.println(food);
        }
    };
}
