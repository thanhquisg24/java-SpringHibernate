package com.vinhsangvn.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vinhsangvn.ModelLocal.Person;


@Controller
@RequestMapping(value="/tile")
public class SpringTilesController {


	
	@RequestMapping(value="viewPeson")
	public ModelAndView viewPersons(Model model) {
		//Map<String, List<Person>> persons = new HashMap<String, List<Person>>();
		//persons.put("persons", Person.createPersons());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("personList");
		mav.addObject("persons", Person.createPersons());
		mav.addObject("Pagetitle","viewperson page...");
		//return new ModelAndView("personList", persons);
		return mav;
	}
	
}