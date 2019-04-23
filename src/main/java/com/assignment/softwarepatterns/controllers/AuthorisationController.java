package com.assignment.softwarepatterns.controllers;

import com.assignment.softwarepatterns.models.AuthorisationResponse;
import com.assignment.softwarepatterns.models.LoginDetails;
import com.assignment.softwarepatterns.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authorisation")
public class AuthorisationController  {

	@Autowired
	AuthService authService;

	@RequestMapping(value = "/customer/login",
	method = RequestMethod.POST,
	produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AuthorisationResponse authoriseUser(@RequestBody LoginDetails loginDetails) {
		return authService.customerLogin(loginDetails);
	}

	@RequestMapping(value = "/customer/register",
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AuthorisationResponse registerUser(@RequestBody LoginDetails loginDetails) {
		return authService.customerRegistration(loginDetails);
	}

	@RequestMapping(value = "/admin/login",
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public AuthorisationResponse authoriseAdmin(@RequestBody LoginDetails loginDetails) {
		return authService.administratorLogin(loginDetails);
	}
}