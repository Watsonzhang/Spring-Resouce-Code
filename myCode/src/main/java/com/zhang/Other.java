package com.zhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Other {
	private String name;
	public void call(){
		System.out.println("this is other");
	}
}
