package com.elearntez.spring.data.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.elearntez.spring.data.bean.CityNew;
import com.elearntez.spring.data.repository.CityNewRepository;

@Transactional
public class TransService {
	
	@Autowired
	private CityNewRepository repo;
	
	
	public void saveCities(){
		List<CityNew> cities = mockCities();
		repo.saveAll(cities);
	}

	
	private List<CityNew> mockCities(){
		List<CityNew> list = new ArrayList<>();
		
		CityNew city = new CityNew();
		city.setId(1);
		city.setName("Kabul");
		city.setCountryCode("AFG");
		city.setDistrict("Kabol");
		city.setPopulation(1780000l);
		list.add(city);
		
		city = new CityNew();
		city.setId(2);
		city.setName("Qandahar");
		city.setCountryCode("AFG");
		city.setDistrict("Qandahar");
		city.setPopulation(237500l);
		list.add(city);
		
		city = new CityNew();
		city.setId(3);
		city.setName("Herat");
		city.setCountryCode("AFG");
		city.setDistrict("Herat");
		city.setPopulation(186800l);
		list.add(city);
		
		city = new CityNew();
		city.setId(4);
		city.setName("Amsterdam");
		city.setPopulation(1780000l);
		list.add(city);
		
		city = new CityNew();
		city.setId(5);
		city.setName("Mazar-e-Sharif");
		city.setCountryCode("AFG");
		city.setDistrict("Balkh");
		city.setPopulation(127800l);
		list.add(city);
		
		return list;
	}
}
