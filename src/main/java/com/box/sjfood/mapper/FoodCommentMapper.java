package com.box.sjfood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.box.sjfood.model.FoodComment;

public interface FoodCommentMapper {
    int insert(FoodComment record);

    int insertSelective(FoodComment record);

	Long getCommentCountsById(@Param(value="foodId")Long foodId);

	List<FoodComment> getCommentsById(@Param(value="foodId")Long foodId,@Param(value="page")Integer pageInteger);

	List<FoodComment> getAllComments(@Param(value="limit")Integer limit, @Param(value="offset")Integer offset, @Param(value="sort")String sort,
			@Param(value="order")String order, @Param(value="search")String search);

	Integer getFoodCommentCount(@Param(value="search")String search);

	Integer deleteFoodComment(@Param(value="foodId")Long foodId,@Param(value="date") String date, @Param(value="grade")Integer grade);

	Float getAvageGrade(@Param(value="foodId")Long foodId);
}