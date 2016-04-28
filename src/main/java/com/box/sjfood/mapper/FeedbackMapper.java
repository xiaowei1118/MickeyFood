package com.box.sjfood.mapper;

import java.util.List;

import com.box.sjfood.model.Feedback;

public interface FeedbackMapper {
    int insert(Feedback record);

    int insertSelective(Feedback record);

	List<Feedback> getFeedbacks();
}