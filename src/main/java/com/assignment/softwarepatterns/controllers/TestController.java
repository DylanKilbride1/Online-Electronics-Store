package com.assignment.softwarepatterns.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/hello",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String returnHello() {
		return "hello user!";
	}
}