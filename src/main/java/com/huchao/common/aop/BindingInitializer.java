package com.huchao.common.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.context.request.WebRequest;


@Component
public class BindingInitializer extends ConfigurableWebBindingInitializer {

	@Override
	public void initBinder(WebDataBinder arg0, WebRequest arg1) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 可以設定任意的日期格式
		dateFormat.setLenient(false);
		arg0.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		arg0.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		super.initBinder(arg0, arg1);
	}

}
