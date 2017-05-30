package com.sample.spring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rest")
public class SampleRestController {
	@RequestMapping(value= "/getUser" )
	public Login getUser(){
		System.out.println("Enter");
		Login login = new Login();
		login.setUserName("Srilakshmi");
		login.setPwd("Sri");   
		login.setGender("f");
		return login;
	}
	@RequestMapping(value= "/saveUser" )
	public Login saveUser(@RequestBody Login login){
	
		return login;
	}
	@RequestMapping(value = "/getUserEntity",method=RequestMethod.POST)
	public Login getLogin (@RequestBody Login login) 
	{
		    if(login.getUserName().equals("srilakshmi")){
		    	ApplicationErrorMessage errorMessage = new ApplicationErrorMessage();
		    	errorMessage.setStatus(HttpStatus.NOT_FOUND);
		    	errorMessage.setErrorMessage("Object Not Found");
		    	 throw new ObjectFoundException(errorMessage);
		    }
		    return login;
	}

}
