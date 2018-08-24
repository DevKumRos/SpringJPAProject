package com.kumar.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.kumar.application.model.Person;

public interface PersonDAO extends CrudRepository<Person, Integer>{

}
