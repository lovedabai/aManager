package com.huchao.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("commonController")
@RequestMapping("/common")
public class CommonController {
	
	private final static String VIEW = "/test";
	
	@RequestMapping("/error")
	@ResponseBody
	private String error(){
		return VIEW + "error";
	}

}
