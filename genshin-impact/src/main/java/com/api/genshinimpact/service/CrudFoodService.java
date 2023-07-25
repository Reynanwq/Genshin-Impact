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
        Food food0 = new Food(0, "", "", 0, "");
        this.foodRepository.save(food0);
    }

    //----------- SELECIONAR DADOS DA TABELA FOOD ----------
    public void selectData(){
        Iterable<Food> foods = this.foodRepository.findAll();
        for (Food food : foods){
            System.out.println(food);
        }
    };
}
