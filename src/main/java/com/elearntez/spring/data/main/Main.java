package com.elearntez.spring.data.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.elearntez.spring.data.Application;
import com.elearntez.spring.data.repository.CityRepository;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		CityRepository repo = context.getBean(CityRepository.class);
		
		repo.findByCountryCode(Sort.by(new Order(Direction.DESC, "name")) ,"IND").forEach(System.out::println);
		
		System.out.println("hoho");
		
		repo.findByCountryCode(PageRequest.of(0,10, Sort.by(new Order(Direction.DESC, "name"))),"IND")
		.forEach(System.out::println);
		
		//System.out.println(repo.findAll());
	}
}
//https://jira.spring.io/browse/DATAJPA-1138