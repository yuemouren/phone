package com.offcn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.service.MobileService;
import com.offcn.util.Message;

@Controller
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	/*@RequestMapping("/search")
	@ResponseBody
	public Mobile search(String number){
		return mobileService.search(number);
	}*/
	
	@RequestMapping("/search")
	@ResponseBody
	public Message search(String number){
		System.out.println("执行了");
		return mobileService.get(number);
	}
}
