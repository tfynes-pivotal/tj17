package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

   @Value("${fooval}")
   private String fooval;




	@RequestMapping("/")
	public String index() {
		String s = System.getProperty("fooval");
		return "foobean = " + fooval + " s = " + s;
	}

}