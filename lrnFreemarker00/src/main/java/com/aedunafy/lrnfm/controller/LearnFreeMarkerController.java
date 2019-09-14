package com.aedunafy.lrnfm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aedunafy.lrnfm.model.Age;
import com.aedunafy.lrnfm.model.Car;
import com.aedunafy.lrnfm.model.Person;

@Controller
public class LearnFreeMarkerController {

	private static List<Car> carList = new ArrayList<Car>();
	
	@GetMapping("/")
    public String home(Model model) {
        return "redirect:/homePage";
    }
	
	
	
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
    public String init(Model model) {
		Person person = new Person();
		Age age = new Age();
		age.setAge("39");		
		person.setAge(age);
		model.addAttribute("person",person);       
        return "index";
    }
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("car") Car car) {
        if (null != car && null != car.getMake() && null != car.getModel() && !car.getMake().isEmpty() && !car.getModel().isEmpty()) {
            carList.add(car);
        }
        return "redirect:/homePage";
    }
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@ModelAttribute("person") Person person) {
		System.out.println("__________________________________________");
		
		System.out.println(person.getName());
		
		if(person.getAge() != null) {
			System.out.println("My age is "+ person.getAge().getAge());
		}
		
		System.out.println("==========================================");
		
        return "redirect:/homePage";
    }
}
