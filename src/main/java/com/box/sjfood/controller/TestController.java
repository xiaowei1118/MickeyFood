package com.box.sjfood.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.box.sjfood.model.User;
import com.box.sjfood.service.UserService;
import com.box.sjfood.tools.Constants;

@Controller
@RequestMapping("/test")
public class TestController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
   
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
  
	/*@RequestMapping(value="/testjson")
	public @ResponseBody void testApplicationJson(@RequestBody User user){
		Integer age=(Integer) map.get("age");
		String name=(String) map.get("name");
		
		System.out.println(age+name);
		return map;
		
		System.out.println(user.toString());
		
	}*/

	@RequestMapping(value="/testjson")
	public @ResponseBody Map<String,Object> testApplicationJson(){
		//Integer age=(Integer) map.get("age");
		//String name=(String) map.get("name");
		
		//map.put("name",name);
        Map<String,Object> map=new HashMap<String,Object>();
		map.put(Constants.STATUS,Constants.SUCCESS);
		map.put(Constants.MESSAGE,"success");
		return map;
		
	}
}
