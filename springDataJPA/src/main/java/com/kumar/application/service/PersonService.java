package com.kumar.application.service;

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
}
