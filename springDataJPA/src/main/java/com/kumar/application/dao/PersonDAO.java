package com.kumar.application.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.kumar.application.model.Person;

public interface PersonDAO extends CrudRepository<Person, Integer>{

	List<Person> findByTech(String tech);
	
	List<Person> findByAgeGreaterThan(int age);
	
	@Query("from Person where age<?1 order by age asc")
	List<Person> findByAgeSorted(int age);

}
