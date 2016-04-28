package com.box.sjfood.service;

import java.util.List;
import java.util.Map;

import com.box.sjfood.model.CartGood;
import com.box.sjfood.model.DeliverChildOrder;
import com.box.sjfood.model.DeliverOrder;
import com.box.sjfood.model.Order;
import com.box.sjfood.model.PCOrder;
import com.box.sjfood.model.SmallOrder;
import com.box.sjfood.model.SuperAdminOrder;

public interface OrderService {

	List<CartGood> getOrderList(String phoneId);

	List<Order> getOrderSuccessList(String phoneId);

	int deleteUserOrder(Long orderId,String phoneId);

	int editUserOrder(Long orderId, String phoneId, Integer orderCount);

	int insertSelectiveOrder(Order order);

	int changeOrderStatus2Buy(String phoneId, String orderId,String togetherId,String rank, String reserveTime, String message);

	int changeOrderStatus2Deliver(String phoneId, String togetherId);

	int changeOrderStatus2Finish(String phoneId, String orderId);

	int deleteAllUserOrder(String phoneId);

	//	List<SmallOrder> getOrderListInMine(String phoneId);

	List<SmallOrder> getOrderListInMineWait2Deliver(String phoneId);

	List<SmallOrder> getOrderListInMineDeliver(String phoneId);

	List<SmallOrder> getOrderListInMineFinish(String phoneId);

	List<String> getTogetherId(String phoneId, Short status);

	List<SmallOrder> getOrderListInMine(String phoneId, String togetherId, Short status);

	Map<String, Object> getOrderSummaryCount(String phone);

	List<Order> selectOrder(Order order);

	void deleteCartGood(Order order);

	Order selectPersonOrder(String phoneId, Long orderId);

	void updateOrderRemarked(String phoneId, Long orderId);

	List<SuperAdminOrder> superAdminGetOrder(Integer isSelected);

	int getExitOrderUserRank(String phoneId, String rank);

	int setDeliverAdmin(String togetherId, String adminPhone);

	Order selectOneOrder(String phoneId, String orderId);

	List<DeliverOrder> deliverGetOrder(String phoneId);

	List<DeliverChildOrder> getDeliverChildOrders(String togetherId);

	List<PCOrder> getPCOrders(Short status,Integer limit, Integer offset, String search);

	Long getPCOrdersCount(Short status,String search);

	int setOrderInvalid(Map<String, Object> parameterMap);

	List<DeliverOrder> selectOrdersByDate(Map<String, Object> paramMap);

	List<DeliverChildOrder> getAllChildOrders(Map<String, Object> paramMap);
}
