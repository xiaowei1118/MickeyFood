package com.box.sjfood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.box.sjfood.model.FoodCategory;

public interface FoodCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodCategory record);

    int insertSelective(FoodCategory record);

    FoodCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodCategory record);

    int updateByPrimaryKey(FoodCategory record);

	List<FoodCategory> getFirstCategory();

	List<FoodCategory> getSecondCategoryes(@Param(value="categoryId")Integer id);

	List<FoodCategory> getAllFoodSecondCategories();

	List<FoodCategory> getAllFoodFirstCategories();
}