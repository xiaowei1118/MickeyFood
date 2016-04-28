package com.box.sjfood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.box.sjfood.model.FoodSpecial;
import com.box.sjfood.model.FoodSpecialKey;

public interface FoodSpecialMapper {
    int deleteByPrimaryKey(FoodSpecialKey key);

    int insert(FoodSpecial record);

    int insertSelective(FoodSpecial record);

    FoodSpecial selectByPrimaryKey(FoodSpecialKey key);

    int updateByPrimaryKeySelective(FoodSpecial record);

    int updateByPrimaryKey(FoodSpecial record);

	List<FoodSpecial> getFoodSpecialByFoodId(@Param(value="foodId")Long foodId);

	String getSpecialName(@Param(value="foodId")Long foodId, @Param(value="foodSpecial")Integer foodSpecial);

	Integer getFoodSpecialCount(@Param(value="foodId")Long foodId, @Param(value="foodSpecial")Integer foodSpecial);

	int addFoodSpecial(FoodSpecial foodSpecial);

	int getSpecialCount(Long foodId);

	Integer getSpecialMax(Long foodId);

	int changeFoodCount(@Param(value="foodId")Long foodId, @Param(value="specialId")Integer foodSpecial, @Param(value="orderCount")Integer orderCount);
}