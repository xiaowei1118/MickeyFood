package com.box.sjfood.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.sjfood.mapper.ReceiverMapper;
import com.box.sjfood.model.Receiver;
import com.box.sjfood.model.ReceiverKey;
import com.box.sjfood.service.ReceiverService;


@Service("receiverService")
public class ReceiverServiceImpl implements ReceiverService {
    private ReceiverMapper receiverMapper;
    
	public ReceiverMapper getReceiverMapper() {
		return receiverMapper;
	}
	
	@Autowired
	public void setReceiverMapper(ReceiverMapper receiverMapper) {
		this.receiverMapper = receiverMapper;
	}

	public int deleteByPrimaryKey(String phoneId, String rank) {
		return receiverMapper.deleteByPrimaryKey(new ReceiverKey(phoneId,rank));
		
	}

	public int insertSelective(Receiver record) {
		return receiverMapper.insertSelective(record);
	}

	public Receiver selectByPrimaryKey(String phoneId, String order) {
		return receiverMapper.selectByPrimaryKey(new ReceiverKey(phoneId,order));
	}

	public int updateByPrimaryKeySelective(Receiver record) {
		return receiverMapper.updateByPrimaryKeySelective(record);
	}

	public int setDefaultAddress(String phone,String rank) {
		return receiverMapper.setDefaultAddress(phone,rank);
	}

	public int getReceiverCounts(String phoneId) {
		
		return receiverMapper.getReceiverCounts(phoneId);
	}

	public List<Receiver> selectByPhoneId(String phoneId) {
		return receiverMapper.selectByPhoneId(phoneId);
	}

	public int insert(Receiver receiver) {
		return receiverMapper.insert(receiver);
	}

	public int setRecevierTag(String phoneId) {
		return receiverMapper.setReceiverTag(phoneId);
	}


}
