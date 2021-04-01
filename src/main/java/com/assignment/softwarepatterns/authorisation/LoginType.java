package com.assignment.softwarepatterns.authorisation;

import com.assignment.softwarepatterns.models.AuthorisationResponse;

public interface LoginType {

	AuthorisationResponse authenticate(String email, String password) throws Exception;
	//test123
}
