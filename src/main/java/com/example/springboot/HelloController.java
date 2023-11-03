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
		String s = System.getenv("fooval");
		String s2 = System.getenv("test.var");
		String s3 = System.getenv("bar.val");
		String jtovar = System.getProperty("jtovar");
		return "foobean = " + fooval + " s = " + s + " s2 = " + s2 + " s3= " + s3 + " jtovar= " + jtovar;
	}

}