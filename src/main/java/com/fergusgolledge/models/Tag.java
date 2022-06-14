package com.fergusgolledge.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAG")
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taggen")
	@SequenceGenerator(name = "taggen", sequenceName = "tag_seq", allocationSize = 1)
	private int id;
	private String name;
	@ManyToMany
	private List<Food> foods;
	
	public Tag(String name, List<Food> foods) {
		super();
		this.name = name;
		this.foods = foods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public int getId() {
		return id;
	}
	
	
	
}
