package com.kumar.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kumar.application.model.Person;
import com.kumar.application.service.PersonService;

@Controller
public class RegisterationController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public ModelAndView displayRegisterationPage(){
		ModelAndView mv = new ModelAndView("registeration");
		System.out.println("Am here");
		return mv;
	}
	
	@RequestMapping(value="/addPerson", method=RequestMethod.POST)
	public ModelAndView addPerson(Person person){
		System.out.println("AddPerson service");
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("person", personService.savePerson(person));
		return mv;
	}
	
	@RequestMapping(value="/getPersonById", method=RequestMethod.GET)
	public ModelAndView getPerson(@RequestParam(name="personId") Integer personId){
		System.out.println("GetPerson service");
		ModelAndView mv = new ModelAndView("displayPersonDetails");
		mv.addObject("person", personService.getPersonById(personId));
		return mv;
	}
	
	@RequestMapping(value="/getPersonByTech", method=RequestMethod.GET)
	public ModelAndView getPersonByTech(@RequestParam(name="tech") String tech){
		System.out.println("GetPerson service By Tech : "+tech);
		ModelAndView mv = new ModelAndView("displayPersonDetails");
		List<Person> personList = personService.getPersonByTech(tech);
		for(Person person : personList) {
			System.out.println(person);
			System.out.println("================================");
		}
		mv.addObject("personList", personList);
		return mv;
	}
}
