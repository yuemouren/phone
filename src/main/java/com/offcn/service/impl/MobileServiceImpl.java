package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileDao;
import com.offcn.service.MobileService;
import com.offcn.util.Message;

@Service
public class MobileServiceImpl implements MobileService{

	@Autowired
	private MobileDao mobileDao;
	
	@Override
	public Message get(String num) {
		System.out.println(num);
		String newnum = num.substring(0,7);
		System.out.println(newnum);
		System.out.println(mobileDao);
		Mobile one = mobileDao.getOne(newnum);
		System.out.println(one);
		Message m = new Message();
		if(one != null){
			StringBuffer buf = new StringBuffer();
			String mobilearea = one.getMobilearea();
			String mobiletype = one.getMobiletype();
			buf.append("你查询的号码："+num+"\n");
			buf.append("归属地是："+mobilearea+"\n");
			buf.append("运营商是："+mobiletype);
			m.setMessage(buf.toString());
			
		}else{
			m.setMessage("号码"+num+"在号段库暂时不存在");
		}
		return m;	
	}
	
	@Override
	public Mobile search(String num) {
		String newnum = num.substring(0,7);
		Mobile one = mobileDao.getOne(newnum);
		if(one != null){
			return one;
		}
		return null;
	}

}
