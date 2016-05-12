package com.huchao.common.spring;

import java.lang.annotation.ElementType;

import javax.validation.Path;
import javax.validation.TraversableResolver;

public class ExtTraversableResolver implements TraversableResolver {

	@Override
	public boolean isReachable(Object traversableObject,
			Path.Node traversableProperty, Class<?> rootBeanType,
			Path pathToTraversableObject, ElementType elementType) {
		return true;
	}

	@Override
	public boolean isCascadable(Object traversableObject,
			Path.Node traversableProperty, Class<?> rootBeanType,
			Path pathToTraversableObject, ElementType elementType) {
		return true;
	}

}
