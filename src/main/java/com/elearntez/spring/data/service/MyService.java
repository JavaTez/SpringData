package com.elearntez.spring.data.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elearntez.spring.data.bean.City;
import com.elearntez.spring.data.repository.CityRepository;

@Transactional
public class MyService {

	@Autowired
	private CityRepository repo;
	
	
	
	public void getAllCities(){
		System.out.println(repo.getClass().getName());
		repo.findAll().forEach(System.out::println);
	}
	
	
	
	/*public void getCityById(int cityId){
		City city = repo.getOne(1);
		System.out.println(city);
	}
	
	public void getCityByCountryCode(){
		List<City> city = repo.findByCountryCode("IND");
		System.out.println(city.size());
	}
	
	public void getCountOfCitiesWithNamedParameter(){
		int count = repo.getCountOfCities("IND");
		System.out.println(count);
	}
	
	public void getCityCountByCountryCode(){
		int count = repo.getCountOfCities("IND");
		System.out.println(count);
	}
	
	public void fetchByDistrict(){
		City city = repo.fetchByDistrict("Mahabubabad");
		System.out.println(city);
	}

	public void getCityCountByCountryCodeWithLike(){
		List<City> cities = repo.findByCountryCodeLike("In");
		System.out.println(cities.size());
	}
	
	public void getCityCountByCountryCodeWithLike2(){
		List<City> cities = repo.findByCountryCodeLike2("In");
		System.out.println(cities.size());
	}
	
	public void findByCountryCodeContaining(){
		List<City> cities = repo.findByCountryCodeContaining("In");
		System.out.println(cities.size());
	}
	
	
	public void findByCountryCodeOrderByNameAsc(){
		List<City> cities = repo.findByCountryCodeOrderByNameDesc("Ind");
		cities.forEach(System.out::println);
	}
	
	public void getCitiesWithPagenation(){
		Page<City> cities =  repo.findByCountryCode("Ind",PageRequest.of(1,10));
		System.out.println(cities.getNumberOfElements());
	}*/
	
	
}
