package com.insuchi.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	@Autowired
	AlienRepository aRep;
	
	//public static final Logger LOGGER = LoggerFactory.getLogger(AlienController.class);


	@RequestMapping("/")
	public String home()
	{
		//LOGGER.debug("In home");
		return "homes";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{ 
		//LOGGER.debug("In addAlien Suchi *************************************");
		//alien.setAid(1009);
		aRep.save(alien);
		return "homes";
	}
}
