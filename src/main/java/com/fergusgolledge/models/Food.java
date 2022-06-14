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
@Table(name = "FOOD")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodgen")
	@SequenceGenerator(name = "foodgen", sequenceName = "food_seq", allocationSize = 1)
	private int id;
	private String name;
	private String cookTime;
	private int price;
	private boolean favourite;
	@ManyToMany
	private List<Origin> origins;
	private float stars;
	private String imgUrl;
	@ManyToMany
	private List<Tag> tags;

	public Food(String name, String cookTime, int price, boolean favourite, List<Origin> origins, float stars,
			String imgUrl, List<Tag> tags) {
		super();
		this.name = name;
		this.cookTime = cookTime;
		this.price = price;
		this.favourite = favourite;
		this.origins = origins;
		this.stars = stars;
		this.imgUrl = imgUrl;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCookTime() {
		return cookTime;
	}

	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFavourite() {
		return favourite;
	}

	public void setFavourite(boolean favourite) {
		this.favourite = favourite;
	}

	public List<Origin> getOrigins() {
		return origins;
	}

	public void addOrigins(Origin origins) {
		this.origins.add(origins);
	}

	public float getStars() {
		return stars;
	}

	public void setStars(float stars) {
		this.stars = stars;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(Tag tags) {
		this.tags.add(tags);
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	

}
