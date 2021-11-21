package com.example.demo.service.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.RestaurantRepository;
import com.example.demo.service.RestaurantService;

import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private RestaurantRepository restaurantRepo;
	
	public RestaurantServiceImpl(RestaurantRepository restaurantRepo) {
		super();
		this.restaurantRepo = restaurantRepo;
	}

	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantRepo.save(restaurant);
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		return restaurantRepo.findAll();	
	}

	@Override
	public Restaurant getRestaurantById(long id) {
		return restaurantRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Restaurant","ID",id));
	}

	@Override
	public Restaurant updateRestaurantDetails(Restaurant restaurant, long id) {
		Restaurant restaurantPresent = restaurantRepo.findById(id).orElseThrow(()->
										new ResourceNotFoundException("Restaurant","ID",id));
		if(restaurant != null)
		{
			restaurantPresent.setName(restaurant.getName());
			restaurantPresent.setCuisine(restaurant.getCuisine());
			restaurantPresent.setStar(restaurant.getStar());
			restaurantPresent.setAddress(restaurant.getAddress());
			restaurantPresent.setPhone(restaurant.getPhone());
			
		}
		
		restaurantRepo.save(restaurantPresent);
		log.info("Restaurant details updated successfully.");
		return restaurantPresent;
			
	}

	@Override
	public void deleteRestaurantById(long id) {
		Restaurant restaurantPresent = restaurantRepo.findById(id).orElseThrow(()->
										new ResourceNotFoundException("Restaurant","ID",id));
		
		restaurantRepo.delete(restaurantPresent);
		
	}
	

}
