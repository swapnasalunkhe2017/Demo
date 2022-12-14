package com.swapna.rest.webservices.restfulwebservices.filtering;




import java.util.Arrays;
import java.util.List;
//import java.util.*;
//import java.awt.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import antlr.collections.List;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retriveSomeBean() {
		return new SomeBean("value1","value2","value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retriveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value12","value22","value3"));
	}
}
