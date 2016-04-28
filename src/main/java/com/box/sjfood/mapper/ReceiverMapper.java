package com.box.sjfood.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.box.sjfood.model.Receiver;
import com.box.sjfood.model.ReceiverKey;

public interface ReceiverMapper {
    int deleteByPrimaryKey(ReceiverKey key);

    int insert(Receiver record);

    int insertSelective(Receiver record);

    Receiver selectByPrimaryKey(ReceiverKey key);

    int updateByPrimaryKeySelective(Receiver record);

    int updateByPrimaryKey(Receiver record);

    
    //**以下为新增方法
	int setDefaultAddress(@Param(value="phoneId")String phone, @Param(value="rank")String rank);

	int getReceiverCounts(@Param(value="phoneId")String phoneId);

	List<Receiver> selectByPhoneId(@Param(value="phoneId")String phoneId);

	//将原来默认地址设为非默认
	int setReceiverTag(@Param(value="phoneId")String phoneId);
}