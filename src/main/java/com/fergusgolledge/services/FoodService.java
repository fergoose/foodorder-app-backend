package com.fergusgolledge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fergusgolledge.models.Food;
import com.fergusgolledge.models.Tag;
import com.fergusgolledge.repos.FoodDao;

@Service
public class FoodService {

	private FoodDao foodDao;

//constructor
	@Autowired
	public FoodService(FoodDao foodDao) {
		super();
		this.foodDao = foodDao;
	}
	
//methods in order as they appear in angular service
	//get all food items
	public List<Food> findAll() {
		return foodDao.findAll();
	}
	
	//get all foods by search term
	public List<Food> getAllFoodsBySearchTerm(String searchTerm) {
		return foodDao.findAllFoodsBySearchTerm(searchTerm);
	}
	
//TODO move this into TagService
	//get all food tags(fastfood, pasta, etc etc)
	public List<Tag> getAllTags() {
		return foodDao.getAllTags();
	}
	
	//get all foods by tag
	public List<Food> getAllFoodsByTag(String tag) {
		return foodDao.findAllByTag(tag);
	}
	
	//get food by id
	//returns Optional, as food may not exist
	public Optional<Food> findById(int id) {
		return foodDao.findById(id);
	}
	
	
}
