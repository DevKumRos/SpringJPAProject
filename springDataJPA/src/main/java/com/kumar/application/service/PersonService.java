package com.kumar.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;






import com.kumar.application.dao.PersonDAO;
import com.kumar.application.model.Person;

@Component
public class PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	public Person savePerson(Person person) {
		person = personDAO.save(person);
		return person;
	}
	
	public Person getPersonById(Integer personId) {
		return personDAO.findById(personId).orElse(null);
	}
	
	public List<Person> getPersonByTech(String tech) {
		return personDAO.findByTech(tech);
	}
	
	public List<Person> getPersonByAgeGrt(int age) {
		return personDAO.findByAgeGreaterThan(age);
	}
	
	public List<Person> getPersonByAgeSorted(int age) {
		return personDAO.findByAgeSorted(age);
	}
}
