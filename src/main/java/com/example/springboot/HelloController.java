package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

   @Value("${foo}")
   private String foo;




	@RequestMapping("/")
	public String index() {
		return "Tanzu ! " + foo;
	}

}