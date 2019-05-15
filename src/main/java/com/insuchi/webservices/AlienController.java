package com.insuchi.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	@Autowired
	AlienRepository aRep;
	


	@RequestMapping("/")
	public String home()
	{
		return "homes";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{ 
		alien.setAid(1009);
		aRep.save(alien);
		return "homes";
	}
}
