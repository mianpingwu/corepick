package com.wump.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wump.model.AgeRange;
import com.wump.service.agerange.AgeArangeService;

@Controller
@RequestMapping(value={"/age"})
public class AgeArangeController {
	
	private Logger logger = Logger.getLogger(AgeArangeController.class);
	
	@Autowired
	public AgeArangeService ageArangeService;
	
	public @RequestMapping(value={"/all"}) @ResponseBody List<AgeRange> getAllAges() {
		
		logger.info("AgeArangeController.getAllAges() start ..."); 		
		return ageArangeService.getAllAgeRange();
	}
	
}
