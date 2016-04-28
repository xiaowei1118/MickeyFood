package com.box.sjfood.model;

import java.util.Date;

public class SmallOrder {
	private Long foodId;
	
    private Long orderId;
    
    private String togetherId;
    
    private String name;
    
    private Short status;

    private Float price;

    private Float discountPrice;
    
    private Short isDiscount;
    
    private Integer orderCount;
    
    private String address;   //配送地址
    
    private String adminPhone;  //配送员号码

	private String  imageUrl;
    
    private String specialName;
    
    private Integer foodCount;
    
    private Short isRemarked;
    
	private String rank;
	
	private Date togetherDate;
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}


	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Float getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Short getIsDiscount() {
		return isDiscount;
	}

	public void setIsDiscount(Short isDiscount) {
		this.isDiscount = isDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialName() {
		return specialName;
	}

	public void setSpecialName(String specialName) {
		this.specialName = specialName;
	}

	public Integer getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(Integer foodCount) {
		this.foodCount = foodCount;
	}

	public Short getIsRemarked() {
		return isRemarked;
	}

	public void setIsRemarked(Short isRemarked) {
		this.isRemarked = isRemarked;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Date getTogetherDate() {
		return togetherDate;
	}

	public void setTogetherDate(Date togetherDate) {
		this.togetherDate = togetherDate;
	}

	public String getTogetherId() {
		return togetherId;
	}

	public void setTogetherId(String togetherId) {
		this.togetherId = togetherId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public Long getFoodId() {
		return foodId;
	}

	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
  
}