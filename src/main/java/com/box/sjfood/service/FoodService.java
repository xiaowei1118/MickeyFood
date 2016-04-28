package com.box.sjfood.service;

import java.util.List;

import com.box.sjfood.model.Food;
import com.box.sjfood.model.FoodCategory;
import com.box.sjfood.model.FoodComment;
import com.box.sjfood.model.FoodSpecial;
import com.box.sjfood.model.ShortFood;

public interface FoodService {
	int deleteCategoryByPrimaryKey(Integer id);

	int insertCategorySelective(FoodCategory record);

	FoodCategory selectCategoryByPrimaryKey(Integer id);

	int updateCategoryByPrimaryKeySelective(FoodCategory record);

	int deleteFoodByPrimaryKey(Long id);

	int insertFoodSelective(Food record);

	Food selectFoodByPrimaryKey(Long id);

	int updateFoodByPrimaryKeySelective(Food record);

	List<FoodCategory>getFirstCategory();

	List<FoodCategory> getSecondCategories(Integer id);

	List<ShortFood> selectFoods(String categoryId, String foodTag, String page, String sortId);

	List<FoodSpecial> getFoodSpecial(Long valueOf);

	List<ShortFood> selectFoodsByTwoTags(String categoryId, String string,
			String string2, String page, String sortId);

	int insertSelective(FoodComment record);

	Long getCommentCountsById(Long foodId);

	List<FoodComment> getCommentInfoById(Long foodId, String page);

	List<Food> getAllFoods();

	Integer getFoodSpecialCount(Long foodId, Integer foodSpecial);

	String getSpecialName(Long foodId, Integer foodSpecial);

	List<FoodCategory> getAllFoodSecondCategories();

	List<FoodCategory> getAllFoodFirstCategories();

	int getSpecialCount(Long foodId);

	int addFoodSpecial(FoodSpecial foodSpecial);

	Integer getSpecialMax(Long foodId);

	List<FoodComment> getAllComments(Integer limit, Integer offset, String sort,
			String order, String search);

	Integer getFoodcommentCount(String search);

	Integer insertFoodComment(FoodComment foodComment);

	List<ShortFood> getFoodListDiscount(Integer page);

	List<ShortFood> getFoodListFresh(Integer page);

	List<ShortFood> getFoodListWelcome(Integer page);

	Integer changeFoodCount(Long foodId, Integer foodSpecial, Integer integer);

	Integer deleteFoodCommentById(Long foodId, String date, Integer grade);

	Float getAvageGrade(Long foodId);

	void deleteFoodSpecial(FoodSpecial foodSpecial);

	void updateFoodSpecial(FoodSpecial foodSpecial);
}
