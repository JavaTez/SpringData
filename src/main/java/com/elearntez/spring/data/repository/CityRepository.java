package com.elearntez.spring.data.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.elearntez.spring.data.bean.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

	List<City> findByCountryCode(final String countryCode);
	
	@Query("select count(*) from City where countryCode=?#{[0]}")
	int getCountOfCities(final String countryCode);
	
	@Query("select count(*) from City where countryCode=:countryCode")
	int getCountOfCitiesWithNamedParameter(@Param("countryCode") final String ccode);
	
	
	City fetchByDistrict(@Param("district") String district);
	
	
	 @Query("SELECT c FROM City c WHERE c.countryCode LIKE ?1")
	 List<City> findByCountryCodeLike(String name);
	 
	 @Query("SELECT c FROM City c WHERE c.countryCode LIKE  %?1%")
	 List<City> findByCountryCodeLike2(String name);
	 
	 List<City> findByCountryCodeContaining(String name);
	 
	 List<City> findByCountryCodeOrderByNameDesc(final String countryCode);
	 
	 Page<City> findByCountryCode(final String countryCode,Pageable pageable);
}
