package com.box.sjfood.service;

import java.util.List;
import java.util.Map;

import com.box.sjfood.model.DeliverCom;
import com.box.sjfood.model.PackageOrder;

public interface PackageService {

	List<DeliverCom> getDeliverCom(Map<String, Object> paramMap);

	int insert(PackageOrder packageOrder);

	int setPackageAdmin(Map<String, Object> paramMap);
    
}
