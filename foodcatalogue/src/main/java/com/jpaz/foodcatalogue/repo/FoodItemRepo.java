package com.jpaz.foodcatalogue.repo;

import com.jpaz.foodcatalogue.entity.FoodItem;
import org.bouncycastle.util.Integers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodItemRepo extends JpaRepository<FoodItem, Integers> {
    List<FoodItem> findByRestaurantId(Integer restaurantId);

}
