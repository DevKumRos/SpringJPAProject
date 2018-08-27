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
	public ModelAndView displayHomePage(){
		ModelAndView mv = new ModelAndView("homePage");
		System.out.println("Home Page");
		return mv;
	}
	
	@RequestMapping("/register")
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
	public ModelAndView getPerson(@RequestParam(name="personId",defaultValue="000") Integer personId){
		System.out.println("GetPerson service "+personId);
		ModelAndView mv = null;
		if(personId != null && !personId.equals(000)) {
			mv = new ModelAndView("displayPersonDetails");
			mv.addObject("person", personService.getPersonById(personId));
		} else {
			mv = new ModelAndView("searchUserById");
		}
		
		return mv;
	}
	
	@RequestMapping(value="/getPersonByTech", method=RequestMethod.GET)
	public ModelAndView getPersonByTech(@RequestParam(name="tech", defaultValue="NONE") String tech){
		System.out.println("GetPerson service By Tech : "+tech);
		ModelAndView mv = null;
		if( tech != null && tech.equalsIgnoreCase("NONE") ) {
			mv = new ModelAndView("searchUserByTech");
		}else {
			mv = new ModelAndView("displayPersonDetails");
			List<Person> personList = personService.getPersonByTech(tech);
			for(Person person : personList) {
				System.out.println(person);
				System.out.println("================================");
			}
			mv.addObject("personList", personList);
		}
		return mv;
	}
	
	@RequestMapping(value="/getPersonByAgeGrt", method=RequestMethod.GET)
	public ModelAndView getPersonByAgeGrt(@RequestParam(name="age",defaultValue="000") Integer age){
		System.out.println("GetPerson service "+age);
		ModelAndView mv = null;
		if(age != null && !age.equals(000)) {
			mv = new ModelAndView("displayPersonDetails");
			mv.addObject("personList", personService.getPersonByAgeGrt(age));
		} else {
			mv = new ModelAndView("searchByAge");
		}
		
		return mv;
	}
	
	
	@RequestMapping(value="/getPersonByAgeSorted", method=RequestMethod.GET)
	public ModelAndView getPersonByAgeSorted(@RequestParam(name="age",defaultValue="000") Integer age){
		System.out.println("GetPerson service "+age);
		ModelAndView mv = null;
		if(age != null && !age.equals(000)) {
			mv = new ModelAndView("displayPersonDetails");
			mv.addObject("personList", personService.getPersonByAgeSorted(age));
		} else {
			mv = new ModelAndView("searchByAge");
		}
		
		return mv;
	}
}
