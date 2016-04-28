package com.box.sjfood.service;


import java.util.List;

import com.box.sjfood.model.Receiver;


public interface ReceiverService {
	int deleteByPrimaryKey(String phoneId,String rank);

	int insertSelective(Receiver record);

	Receiver selectByPrimaryKey(String phoneId,String rank);

	int updateByPrimaryKeySelective(Receiver record);

	int setDefaultAddress(String phone,String rank);

	int getReceiverCounts(String phoneId);

	List<Receiver> selectByPhoneId(String phoneId);

	int insert(Receiver receiver);

	int setRecevierTag(String phoneId);
}
