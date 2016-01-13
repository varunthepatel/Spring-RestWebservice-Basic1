package com.varun.restful1.sample1.core;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CoreController {

	@RequestMapping("/rest/{name}")
	public String Hello(@PathVariable String name){
		return"Hey"+name;
	}
	
}
