package com.box.sjfood.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.sjfood.mapper.FeedbackMapper;
import com.box.sjfood.mapper.UsersMapper;
import com.box.sjfood.model.Feedback;
import com.box.sjfood.model.Users;
import com.box.sjfood.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	private UsersMapper usersMapper;         //鎿嶄綔鐢ㄦ埛淇℃伅
	private FeedbackMapper feedbackMapper;   //鎿嶄綔鐢ㄦ埛鍙嶉琛�

	public FeedbackMapper getFeedbackMapper() {
		return feedbackMapper;
	}

	@Autowired
	public void setFeedbackMapper(FeedbackMapper feedbackMapper) {
		this.feedbackMapper = feedbackMapper;
	}

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	@Autowired
	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	public Users selectByUsername(String phone) {
		return usersMapper.selectByPrimaryKey(phone);
	}


	public void addUsers(Users users) {
		usersMapper.insertSelective(users);
	}

	public int updatePassword(String phone, String newPassword) {
		return usersMapper.updatePassword(phone, newPassword);
	}

	public int updateUserInfo(Users users) {
		return usersMapper.updateByPrimaryKeySelective(users);
	}



	public void updateLastLoginTime(Date date,String phone) {
		usersMapper.updateLastLoginTime(date,phone);
	}


	public int addFeedbackSuggestion(Feedback record) {

		return feedbackMapper.insert(record);
	}

	public List<Users> getAllUser(Integer limit, Integer offset, String sort,
			String order,String search) {
		return usersMapper.getAllUser(limit,offset,sort,order,search);
	}

	public Integer getUserCount(String search) {
		return usersMapper.getUserCount(search);
	}

	public Integer setUserAdmin(String phone) {
		return usersMapper.setUserAdmin(phone);
	}

	public Integer setUserCommon(String phone) {
		return usersMapper.setUserCommon(phone);
	}

	public Integer setUserSuperAdmin(String phone) {
		return usersMapper.setUserSuperAdmin(phone);
	}

	public int updateImageUrl(String imageUrl, String phone) {
		return usersMapper.updateUserImage(imageUrl,phone);
	}

	public String getImageUrl(String phone) {
		return usersMapper.getImageUrl(phone);
	}

	public List<Users> getDeliverAdmin() {
		return usersMapper.getDeliverAdmin();
	}

	public int setUserToken(String phoneId, String token) {
		return usersMapper.setUserToken(phoneId,token);
	}

	public List<Feedback> getFeedbacks() {
		return feedbackMapper.getFeedbacks();
	}

	public String getUserToken(String togetherId) {
		return usersMapper.getUserToken(togetherId);
	}

	public int clearOldToken(String token) {
		return usersMapper.clearOldToken(token);
	}

	public String getUserPhone(String togetherId) {	
		return usersMapper.getUserPhone(togetherId);
	}

	public List<String> getAllSuperAdminPhone(Map<String, Object> paramterMap) {
		return usersMapper.getAllSuperAdminPhone(paramterMap);
	}

	public String getUserTokenByPhone(Map<String, Object> paramterMap) {
		return usersMapper.getUserTokenByPhone(paramterMap);
	}

	public Integer getCountsByDevice(Map<String, Object> paramMap) {
		return usersMapper.getCountsByDevice(paramMap);
	}

}
