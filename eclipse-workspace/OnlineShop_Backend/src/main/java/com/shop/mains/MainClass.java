package com.shop.mains;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shop.config.DBConfig;


public class MainClass {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DBConfig.class);
		
	}
	
}