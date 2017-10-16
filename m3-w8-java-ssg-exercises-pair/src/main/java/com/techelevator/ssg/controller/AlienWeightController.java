package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.ssg.model.AlienWeightCalculator;

@Controller
public class AlienWeightController {

	@RequestMapping("/alienWeightInput")
	public String displayAlienWeightInput() {
		return "alienWeightInput";
	}
	
	@RequestMapping ("/alienWeightResult")
	public String ageResult(@RequestParam String planet, @RequestParam int weight, ModelMap modelHolder){
		AlienWeightCalculator calc = new AlienWeightCalculator (weight,planet);
		modelHolder.put("calculator", calc);
	
		return "alienWeightResult";
	}
	
}
