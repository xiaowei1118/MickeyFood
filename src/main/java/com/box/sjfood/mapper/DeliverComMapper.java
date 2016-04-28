package com.box.sjfood.mapper;

import java.util.List;
import java.util.Map;

import com.box.sjfood.model.DeliverCom;

public interface DeliverComMapper {
    int deleteByPrimaryKey(Integer deliverId);

    int insert(DeliverCom record);

    int insertSelective(DeliverCom record);

    DeliverCom selectByPrimaryKey(Integer deliverId);

    int updateByPrimaryKeySelective(DeliverCom record);

    int updateByPrimaryKey(DeliverCom record);

	List<DeliverCom> getDeliverCom(Map<String, Object> paramMap);
}