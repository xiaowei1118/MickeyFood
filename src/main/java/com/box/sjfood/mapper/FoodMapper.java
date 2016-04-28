package com.box.sjfood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.box.sjfood.model.Food;
import com.box.sjfood.model.ShortFood;

public interface FoodMapper {
    int deleteByPrimaryKey(Long FoodId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Long FoodId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

	List<ShortFood> selectFoods(@Param(value="categoryId")String categoryId, @Param(value="foodTag")String foodTag, @Param(value="page")Integer page, @Param(value="sortId")Integer sortBy);


	List<ShortFood> selectFoodsByTwoTags(@Param(value="categoryId")String categoryId, @Param(value="oneFlag")String flag1,
			@Param(value="twoFlag")String flag2, @Param(value="page")Integer page, @Param(value="sortId")Integer sortId);

	List<Food> getAllFoods();        //web管理端获取所有的食品

	List<ShortFood> getFoodListDiscount(@Param(value="page")Integer page);   //获取打折商品
 
	List<ShortFood> getFoodListFresh(@Param(value="page")Integer page);      //获取新品食品

	List<ShortFood> getFoodListWelcome(@Param(value="page")Integer page);   //获取受欢迎商品

	int changeFoodSaleNumber(@Param(value="foodId")Long foodId, @Param(value="orderCount")Integer orderCount);  //更新销量

}