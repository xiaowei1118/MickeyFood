package com.box.sjfood.model;

import java.util.List;



public class FoodCategory {
    private Integer categoryId;

    private String category;

    private String imgUrl;

    private Integer parentId;

    private Short tag;

    private List<FoodCategory> child;
    
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Short getTag() {
        return tag;
    }

    public void setTag(Short tag) {
        this.tag = tag;
    }

	public List<FoodCategory> getChild() {
		return child;
	}

	public void setChild(List<FoodCategory> child) {
		this.child = child;
	}
}