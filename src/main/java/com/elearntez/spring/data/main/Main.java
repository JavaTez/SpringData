package com.elearntez.spring.data.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elearntez.spring.data.Application;
import com.elearntez.spring.data.bean.City;
import com.elearntez.spring.data.repository.CityRepository;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		MyService ms  = context.getBean(MyService.class);
		ms.getCitiesWithPagenation();
	}
}
