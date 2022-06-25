package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/hactive8")
	public String sayHello() {
		return "Swagger Hello World";
	}
}