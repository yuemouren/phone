package com.offcn.dao;

import org.apache.ibatis.annotations.Param;

import com.offcn.bean.Mobile;

public interface MobileDao {
	
	public Mobile getOne(@Param("mobilenumber") String mobilenumber);
}	
