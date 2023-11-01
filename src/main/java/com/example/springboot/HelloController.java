package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@Value("${foo}")
private String foo;


@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Tanzu! " + foo;
	}

}