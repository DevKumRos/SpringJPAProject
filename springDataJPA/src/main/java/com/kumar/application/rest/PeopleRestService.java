package com.kumar.application.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.application.model.Person;
import com.kumar.application.service.PersonService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PeopleRestService {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/getPersonById", method=RequestMethod.GET)
	public Person getPerson(@RequestParam(name="personId",defaultValue="000") Integer personId){
		System.out.println("GetPerson service "+personId);
		if(personId != null && !personId.equals(000)) {
			return personService.getPersonById(personId);
		}
		
		return null;
	}
	
	@RequestMapping(value="/getPersonByAgeGrt", method=RequestMethod.GET)
	public List<Person> getPersonByAgeGrt(@RequestParam(name="age",defaultValue="000") Integer age){
		System.out.println("GetPerson service "+age);
		if(age != null && !age.equals(000)) {
			return personService.getPersonByAgeGrt(age);
		} 
		
		return null;
	}
}
