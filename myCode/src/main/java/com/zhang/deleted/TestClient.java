package com.zhang.deleted;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

public class TestClient {
	public static void main(String[] args) {
		DefaultListableBeanFactory fa = new DefaultListableBeanFactory();
		//XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(fa);
		AnnotatedBeanDefinitionReader re = new AnnotatedBeanDefinitionReader(fa);
	}
}
