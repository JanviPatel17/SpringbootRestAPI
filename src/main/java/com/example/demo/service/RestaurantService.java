package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Restaurant;

public interface RestaurantService {
	
	Restaurant saveRestaurant(Restaurant restaurant);
	
	List<Restaurant> getAllRestaurant();
	
	Restaurant getRestaurantById(long id);
	
	Restaurant updateRestaurantDetails(Restaurant restaurant, long id);
	
	void deleteRestaurantById(long id);


}
