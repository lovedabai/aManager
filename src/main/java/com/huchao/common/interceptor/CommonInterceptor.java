package com.huchao.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CommonInterceptor extends HandlerInterceptorAdapter implements MethodInterceptor, ApplicationListener<ContextRefreshedEvent>{
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setAttribute("base", request.getContextPath());
		request.setAttribute("static", request.getContextPath() + "/static");
		boolean error =  false;
		try {
			error =  super.preHandle(request, response, handler);
		} catch (Exception e) {
		}
		System.out.println("))))))))))))))))))");
		return error;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("**************");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		boolean error = false;
        try {
            return invocation.proceed();
        } catch (Throwable e) {
            error = true;
            System.out.println("=========>error");
            throw e;
        } finally {
                if (error) {
                	System.out.println("===============>rollback");
                } else {
                	System.out.println("===============>commit");
                }
        }
	}

}
