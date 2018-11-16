package com.elearntez.spring.data.repository;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.elearntez.spring.data.bean.City;


public interface CityRepository extends JpaRepository<City, Long> {
	
	List<City> findByName(String name);
	
	City findByNameAndCountryCode(String name, String countryCode);
	
	
	City findByNameAndCountryCodeOrDistrict(String name, String countryCode,String district);
	
	List<City> findByCountryCode(Sort sort,final String countryCode);
	
	List<City> findByCountryCode(Pageable pageable,final String countryCode);

	//@Query("SELECT c FROM City c WHERE c.countryCode LIKE %?:countryCode%")
	//List<City> getByCountryCode(String countryCodeLike);
	
	
	List<City> findByCountryCodeContaining(String countryCode);
	
	
	@Query("select count(*) from City where countryCode=:countryCode")
	int getCountOfCitiesWithNamedParameter(@Param("countryCode") final String countryCode);
	
	
	List<City> fetchByDistrict(@Param("district") String district);
	
}
