package com.huchao.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huchao.common.entity.Item;

@Controller("commonController")
@RequestMapping("/common")
public class CommonController {
	
	private final static String VIEW = "/test/";
	
	@RequestMapping("/error")
	@ResponseBody
	private String error(){
		
		return VIEW + "error";
	}
	
	
	@RequestMapping("/json")
	@ResponseBody
	private Item json(){
		Item item = new Item();
		item.setCode("asdfg");
		return item;
	}
	
	@RequestMapping("/view")
	private ModelAndView view(ModelMap modelMap){
		Item item = new Item();
		item.setCode("asdfg");
		modelMap.put("1233", "ddd");
		return new ModelAndView(VIEW+"view", modelMap);
	}

}
