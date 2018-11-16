package com.elearntez.spring.data.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elearntez.spring.data.Application;
import com.elearntez.spring.data.service.MyService;
import com.elearntez.spring.data.service.TransService;

public class TransactionMain {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		TransService ts  = context.getBean(TransService.class);
		ts.saveCities();
	}
}
