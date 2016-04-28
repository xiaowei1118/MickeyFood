package com.box.sjfood.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.sjfood.mapper.FoodCategoryMapper;
import com.box.sjfood.mapper.FoodCommentMapper;
import com.box.sjfood.mapper.FoodMapper;
import com.box.sjfood.mapper.FoodSpecialMapper;
import com.box.sjfood.model.Food;
import com.box.sjfood.model.FoodCategory;
import com.box.sjfood.model.FoodComment;
import com.box.sjfood.model.FoodSpecial;
import com.box.sjfood.model.FoodSpecialKey;
import com.box.sjfood.model.ShortFood;
import com.box.sjfood.service.FoodService;

/**
 * 食品管理服务类（包括食品分类）
 * @author 殿下
 *2014/12/13
 */
@Service("/foodService")
public class FoodServiceImpl implements FoodService{
    private FoodMapper foodMapper;
    private FoodCategoryMapper foodCategoryMapper;
    private FoodSpecialMapper foodSpecialMapper;
    private FoodCommentMapper foodCommentMapper;
    
    public FoodCommentMapper getFoodCommentMapper() {
		return foodCommentMapper;
	}

    @Autowired
	public void setFoodCommentMapper(FoodCommentMapper foodCommentMapper) {
		this.foodCommentMapper = foodCommentMapper;
	}

	public FoodSpecialMapper getFoodSpecialMapper() {
		return foodSpecialMapper;
	}

    @Autowired
	public void setFoodSpecialMapper(FoodSpecialMapper foodSpecialMapper) {
		this.foodSpecialMapper = foodSpecialMapper;
	}

	public FoodMapper getFoodMapper() {
		return foodMapper;
	}

    @Autowired
	public void setFoodMapper(FoodMapper foodMapper) {
		this.foodMapper = foodMapper;
	}

	public FoodCategoryMapper getFoodCategoryMapper() {
		return foodCategoryMapper;
	}

	@Autowired
	public void setFoodCategoryMapper(FoodCategoryMapper foodCategoryMapper) {
		this.foodCategoryMapper = foodCategoryMapper;
	}

	public int deleteCategoryByPrimaryKey(Integer id) {
		return foodCategoryMapper.deleteByPrimaryKey(id);
	}

	public int insertCategorySelective(FoodCategory record) {
		return foodCategoryMapper.insertSelective(record);
	}

	public FoodCategory selectCategoryByPrimaryKey(Integer id) {
		return foodCategoryMapper.selectByPrimaryKey(id);
	}

	public int updateCategoryByPrimaryKeySelective(FoodCategory record) {
		return foodCategoryMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteFoodByPrimaryKey(Long id) {
		return foodMapper.deleteByPrimaryKey(id);
	}

	public int insertFoodSelective(Food record) {
		return foodMapper.insertSelective(record);
	}

	public Food selectFoodByPrimaryKey(Long id) {
		return foodMapper.selectByPrimaryKey(id);
	}

	public int updateFoodByPrimaryKeySelective(Food record) {
		return foodMapper.updateByPrimaryKeySelective(record);
	}

	//获取食品一级分类
	public List<FoodCategory> getFirstCategory() {
		return foodCategoryMapper.getFirstCategory();
	}

	//获取食品二级分类
	public List<FoodCategory> getSecondCategories(Integer id) {		
		return foodCategoryMapper.getSecondCategoryes(id);
	}

	//根据食品分类，和食品标签查询食品
	public List<ShortFood> selectFoods(String categoryId, String foodTag,String page,String sortId) {
		Integer sortBy=0;
		if(sortId!=null&&!sortId.equals("0")){
			sortBy=Integer.valueOf(sortId);		
		}
		
		Integer newPageInteger=0;
		if(page!=null&!page.equals(0)){
			newPageInteger=Integer.valueOf(page)*10;
		}
		return foodMapper.selectFoods(categoryId,foodTag,newPageInteger,sortBy);
	}

	public List<FoodSpecial> getFoodSpecial(Long foodId) {
		return foodSpecialMapper.getFoodSpecialByFoodId(foodId);
	}

	//通过两个标签模糊查询（两个标签以空格隔开）
	public List<ShortFood> selectFoodsByTwoTags(String categoryId,
			String flag1, String flag2, String page, String sortId) {
		Integer sortBy=0;
		if(sortId!=null&&!sortId.equals("0")){
			sortBy=Integer.valueOf(sortId);		
		}
		
		Integer newPageInteger=0;
		if(page!=null&!page.equals(0)){
			newPageInteger=Integer.valueOf(page)*10;
		}
		
		return foodMapper.selectFoodsByTwoTags(categoryId,flag1,flag2,newPageInteger,sortBy);
		
	}

	public int insertSelective(FoodComment record) {
		return 0;
	}

	public Long getCommentCountsById(Long foodId) {
		return foodCommentMapper.getCommentCountsById(foodId);
	}

	public List<FoodComment> getCommentInfoById(Long foodId,String page) {
		Integer pageInteger=-1;
		if(page!=null){
			pageInteger=Integer.valueOf(page)*10;
		}else{
			pageInteger=-1;
		}
		return foodCommentMapper.getCommentsById(foodId,pageInteger);
	}

	public List<Food> getAllFoods() {
		return foodMapper.getAllFoods();
	}

	public Integer getFoodSpecialCount(Long foodId, Integer foodSpecial) {
		return foodSpecialMapper.getFoodSpecialCount(foodId, foodSpecial);
	}

	public String getSpecialName(Long foodId, Integer foodSpecial) {		
		return foodSpecialMapper.getSpecialName(foodId,foodSpecial);
	}

	public List<FoodCategory> getAllFoodSecondCategories() {
		return foodCategoryMapper.getAllFoodSecondCategories();
	}

	public List<FoodCategory> getAllFoodFirstCategories() {
		return foodCategoryMapper.getAllFoodFirstCategories();
	}

	public int addFoodSpecial(FoodSpecial foodSpecial) {		
		return foodSpecialMapper.addFoodSpecial(foodSpecial);
	}

	public int getSpecialCount(Long foodId) {
		return foodSpecialMapper.getSpecialCount(foodId);
	}

	//获取special_id的最大值
	public Integer getSpecialMax(Long foodId) {		
		return foodSpecialMapper.getSpecialMax(foodId);
	}

	public List<FoodComment> getAllComments(Integer limit, Integer offset, String sort,
			String order, String search) {
		return foodCommentMapper.getAllComments(limit,offset,sort,order,search);
	}

	public Integer getFoodcommentCount(String search) {
		return foodCommentMapper.getFoodCommentCount(search);
	}

	public Integer insertFoodComment(FoodComment foodComment) {
		return foodCommentMapper.insertSelective(foodComment);
	}

	public List<ShortFood> getFoodListFresh(Integer page) {
		return foodMapper.getFoodListFresh(page);
	}

	public List<ShortFood> getFoodListWelcome(Integer page) {
		return foodMapper.getFoodListWelcome(page);
	}

	public List<ShortFood> getFoodListDiscount(Integer page) {
		return foodMapper.getFoodListDiscount(page);
	}

	public Integer changeFoodCount(Long foodId, Integer foodSpecial,Integer orderCount) {
		int flag=0;
		flag= foodSpecialMapper.changeFoodCount(foodId,foodSpecial,orderCount);
		flag=foodMapper.changeFoodSaleNumber(foodId,orderCount);
		return flag;		
	}

	public Integer deleteFoodCommentById(Long foodId, String date, Integer grade) {
		return foodCommentMapper.deleteFoodComment(foodId,date,grade);
	}

	public Float getAvageGrade(Long foodId) {
		return foodCommentMapper.getAvageGrade(foodId);
	}

	public void deleteFoodSpecial(FoodSpecial foodSpecial) {
		FoodSpecialKey foodSpecialKey=foodSpecial;
		
		 foodSpecialMapper.deleteByPrimaryKey(foodSpecialKey); //删除食品的某一口味
	}

	public void updateFoodSpecial(FoodSpecial foodSpecial) {
		foodSpecialMapper.updateByPrimaryKey(foodSpecial);
	}

}
