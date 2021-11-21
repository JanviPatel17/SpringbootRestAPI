package com.example.demo.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Restaurant;
import com.example.demo.service.RestaurantService;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
	
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private RestaurantService restaurantService;

	public RestaurantController(RestaurantService restaurantService) {
		super();
		this.restaurantService = restaurantService;
	}
	
	//insert restaurant details
	@PostMapping()
	public ResponseEntity<Restaurant> saveRestaurant(Restaurant restaurant)
	{
		return new ResponseEntity<Restaurant>(restaurantService.saveRestaurant(restaurant), HttpStatus.CREATED);
	}
	
	//get all restaurants
	@GetMapping
	public List<Restaurant> getAllRestaurant()
	{
		return restaurantService.getAllRestaurant();
	}
	
	//get restaurant by id
	@GetMapping("{id}")
	public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") long id)
	{
		return new ResponseEntity<Restaurant>(restaurantService.getRestaurantById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Restaurant> updateRestaurant(@PathVariable("id") long id,@RequestBody Restaurant restaurant)
	{
		return new ResponseEntity<Restaurant>(restaurantService.updateRestaurantDetails(restaurant, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteRestaurantById(@PathVariable("id") long id)
	{
		restaurantService.deleteRestaurantById(id);
		return new ResponseEntity<String>("Restaurant Details deleted.", HttpStatus.OK);
	}
	

}
