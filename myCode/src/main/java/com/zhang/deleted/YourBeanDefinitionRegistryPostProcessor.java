package com.zhang.deleted;

import com.zhang.BeanTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class YourBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		boolean bool = registry.containsBeanDefinition("BeanTest");
		System.out.println("是否存在"+bool);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanTest beanTest =(BeanTest) beanFactory.getBean("beanTest");
		beanTest.sayRegistry();
	}
}
