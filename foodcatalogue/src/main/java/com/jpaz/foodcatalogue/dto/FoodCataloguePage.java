package com.jpaz.foodcatalogue.dto;


import com.jpaz.foodcatalogue.entity.FoodItem;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {
    public List<FoodItem> getFoodItemsList() {
        return foodItemsList;
    }

    public void setFoodItemsList(List<FoodItem> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
}
