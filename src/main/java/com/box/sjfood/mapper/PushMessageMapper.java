package com.box.sjfood.mapper;

import com.box.sjfood.model.PushMessage;

public interface PushMessageMapper {
    int deleteByPrimaryKey(Integer pushId);

    int insert(PushMessage record);

    int insertSelective(PushMessage record);

    PushMessage selectByPrimaryKey(Integer pushId);

    int updateByPrimaryKeySelective(PushMessage record);

    int updateByPrimaryKey(PushMessage record);
}