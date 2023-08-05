package com.api.genshinimpact.resource;

import com.api.genshinimpact.dto.FoodDTO;
import com.api.genshinimpact.service.CrudFoodService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {
    @Autowired
    private CrudFoodService foodService;

    public FoodController(CrudFoodService foodService){
        this.foodService = foodService;
    }
    @GetMapping(value = "/{id}")
    public FoodDTO findById(@PathVariable Integer id){
        return foodService.findById(id);
    }
}
