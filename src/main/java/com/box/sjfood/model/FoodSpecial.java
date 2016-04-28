package com.box.sjfood.model;


public class FoodSpecial extends FoodSpecialKey {
    private String name;

    private Integer foodCount;

    public FoodSpecial() {
	}
    public FoodSpecial(Long foodId, String specialName, Integer specialCount) {
    	this.foodId=foodId;
    	this.name=specialName;
    	foodCount=specialCount;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }


}