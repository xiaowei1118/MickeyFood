package com.box.sjfood.service;

public interface  PushService {
	public  void sendPush(String phone, String message, Integer count);

	public void sendPushByTag(String tag, String string, int j);
}
