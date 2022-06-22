package com.fergusgolledge.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fergusgolledge.models.Food;

@Repository
public interface FoodDao extends JpaRepository<Food, Integer> {

	List<Food> findAll();
	
	Optional<Food> findById(@Param("id") int id);
	
	List<Food> findAllFoodsBySearchTerm(@Param("search_term") String searchTerm);
	
//TODO put into Tag repo, this repo should only be responsible for Food(single responsibility)
	//List<Tag> findAll();
	
	List<Food> findAllByTag(@Param("tag") String tag);
	
	
	
	
	
}
