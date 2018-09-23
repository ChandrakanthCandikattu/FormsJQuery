package com.financesystem.api;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
// @Service
public class SubmitAPI {

	@GetMapping(path = "/existingUser/{value}")
	public SimplePOJO checkForLoginUsers(@PathVariable /* final UserCredentialsDTO uCTO */ Integer value) {
		/*
		 * UserCredentials uC = new UserCredentials(); uC.setUserId(new
		 * UserCredentialsIdPK(uCTO.getUserId().getUserName(),
		 * uCTO.getUserId().getMobileNumber())); uC.setPassWord(uCTO.getPassWord());
		 * DAOImpl daoImpl = new DAOImpl(); if (daoImpl.persistValues(uC, null)) {
		 * return true; }
		 */
  
		return new SimplePOJO("f1", "f2");
	}

	@GetMapping(path = "/existingUser/2")
	public SimplePOJO createNewUser() {
		return new SimplePOJO("f1", "f2");
	}

}
