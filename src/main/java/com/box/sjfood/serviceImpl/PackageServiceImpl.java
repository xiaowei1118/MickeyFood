package com.box.sjfood.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.sjfood.mapper.DeliverComMapper;
import com.box.sjfood.mapper.PackageOrderMapper;
import com.box.sjfood.model.DeliverCom;
import com.box.sjfood.model.PackageOrder;
import com.box.sjfood.service.PackageService;

@Service("packageService")
public class PackageServiceImpl implements PackageService{
    private PackageOrderMapper packageMapper;
    private DeliverComMapper deliverComMapper;
    
	public PackageOrderMapper getPackageMapper() {
		return packageMapper;
	}

	@Autowired
	public void setPackageMapper(PackageOrderMapper packageMapper) {
		this.packageMapper = packageMapper;
	}

	public DeliverComMapper getDeliverComMapper() {
		return deliverComMapper;
	}

	@Autowired
	public void setDeliverComMapper(DeliverComMapper deliverComMapper) {
		this.deliverComMapper = deliverComMapper;
	}
	
	//获取快递公司列表
	public List<DeliverCom> getDeliverCom(Map<String, Object> paramMap) {
		return deliverComMapper.getDeliverCom(paramMap);
	}

	//生成订单
	public int insert(PackageOrder packageOrder) {
		return packageMapper.insertSelective(packageOrder);
	}

	//为快递设置配送员
	public int setPackageAdmin(Map<String, Object> paramMap) {
		return packageMapper.setAdminPhone(paramMap);
	}

	
    
    
}
