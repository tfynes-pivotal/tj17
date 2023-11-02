package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

   @Value("${foo.bar}")
   private String dsc;




	@RequestMapping("/")
	public String index() {
		return "Tanzu ! " + dsc;
	}

}