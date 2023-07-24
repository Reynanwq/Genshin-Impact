package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Food;
import com.api.genshinimpact.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudFoodService {
    private FoodRepository foodRepository;

    public CrudFoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public void insertData(){
        Food food0 = new Food();
        this.foodRepository.save(food0);
    }
}
