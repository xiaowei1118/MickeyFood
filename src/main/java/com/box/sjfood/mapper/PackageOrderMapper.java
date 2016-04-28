package com.box.sjfood.mapper;

import java.util.Map;

import com.box.sjfood.model.PackageOrder;

public interface PackageOrderMapper {
    int deleteByPrimaryKey(String packageId);

    int insert(PackageOrder record);

    int insertSelective(PackageOrder record);

    PackageOrder selectByPrimaryKey(String packageId);

    int updateByPrimaryKeySelective(PackageOrder record);

    int updateByPrimaryKey(PackageOrder record);
    
    int setAdminPhone(Map<String, Object> paramMap);
}