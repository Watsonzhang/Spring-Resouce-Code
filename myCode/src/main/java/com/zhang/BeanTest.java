package com.zhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanTest {

	@Autowired
	Other other;

	private String name;

	public BeanTest() {
		System.out.println("无参构造");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  void  sayHello(){
		System.out.println("hello world");
	}
	public  void  sayRegistry(){
		System.out.println("now registry");
	}
}
