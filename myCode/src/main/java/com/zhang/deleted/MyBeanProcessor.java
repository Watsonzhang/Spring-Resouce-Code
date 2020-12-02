package com.zhang.deleted;

import com.zhang.BeanTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof BeanTest) {
			((BeanTest) bean).setName("zhangwei");
			return bean;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof BeanTest)
			System.out.println(bean);
		return bean;
	}
}
