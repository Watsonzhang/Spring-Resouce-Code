package com.zhang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zhang")
public class MyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyMain.class);
		BeanTest beanTest = (BeanTest)context.getBean("beanTest");
		beanTest.sayHello();
	}
}
