package com.fergusgolledge.models;

import java.util.List;

import javax.persistence.Column;
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
//	@SequenceGenerator(name = "foodGen", sequenceName = "foodSeq", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "foodGen")
//	@Column(name = "id", nullable = false)
	private int id;
	private String name;
	@Column(name = "COOKTIME")
	private String cookTime;
	private int price;
	private boolean favorite;
	@ManyToMany
	private List<Origin> origins;
	private float stars;
	private String imgUrl;
	@ManyToMany
	private List<Tag> tags;

	public Food(String name, String cookTime, int price, boolean favorite, List<Origin> origins, float stars,
			String imgUrl, List<Tag> tags) {
		super();
		this.name = name;
		this.cookTime = cookTime;
		this.price = price;
		this.favorite = favorite;
		this.origins = origins;
		this.stars = stars;
		this.imgUrl = imgUrl;
		this.tags = tags;
	}

	public int getId() {
		return id;
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

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favourite) {
		this.favorite = favourite;
	}

	public List<Origin> getOrigins() {
		return origins;
	}

	public void setOrigins(Origin origins) {
		this.origins.add(origins);
	}

	public float getStars() {
		return stars;
	}

	public void setStars(float stars) {
		this.stars = stars;
	}

	public String getimgUrl() {
		return imgUrl;
	}

	public void setimgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(Tag tags) {
		this.tags.add(tags);
	}
	
	
	
	
	
	

}
