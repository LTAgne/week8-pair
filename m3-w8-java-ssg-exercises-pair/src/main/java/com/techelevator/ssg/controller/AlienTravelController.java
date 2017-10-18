package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.techelevator.ssg.model.AlienTravelCalculator;

@Controller
public class AlienTravelController {

	@RequestMapping("/alienTravelInput")
	public String travelInput(){
		return "alienTravelInput";
	}
	
	@RequestMapping ("/alienTravelResult")
	public String travelResult( @RequestParam String planet, @RequestParam int age, ModelMap modelHolder, @RequestParam String transport) {
		AlienTravelCalculator calc = new AlienTravelCalculator (age,planet, transport);
		modelHolder.put("calculator", calc);
			
			return "alienTravelResult";
	}
}