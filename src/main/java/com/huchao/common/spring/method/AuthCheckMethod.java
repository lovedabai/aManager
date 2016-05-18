package com.huchao.common.spring.method;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

/**
 * 检测用户是否拥有对应权限
 * @author rainy
 *
 */
@Component("authCheckMethod")
public class AuthCheckMethod implements TemplateMethodModelEx {

	@SuppressWarnings("rawtypes")
	@Override
	public Object exec(List arguments) throws TemplateModelException {
		if (arguments != null && !arguments.isEmpty() && arguments.get(0) != null) {
			String authStr = arguments.get(0).toString();
			if(StringUtils.isNoneBlank(authStr)) {
				String[] auths = authStr.split(",");
				/*User user = SecurityContext.getCurrentUser();
				if(user != null) {
					List<String> authorizedAuths = user.getAuthorityList();
					int match = 0;
					for(String auth : auths) {
						for(String aAuth : authorizedAuths) {
							if(aAuth.startsWith(auth.trim()) || aAuth.equals(auth.trim())) {
								match++;
								break;
							}
						}
					}
					return match;
				}*/
			}
		}
		return 0;
	}

}
