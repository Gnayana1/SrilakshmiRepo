package com.sample.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/sample")
public class SampleController {
	@RequestMapping(method=RequestMethod.GET,value="/welcome")
	public ModelAndView Sample(){
		System.out.println("enter");
		ModelAndView m1=new ModelAndView("NewFile");
		m1.addObject("user", "sample");
		return m1;
	}
	@RequestMapping(method=RequestMethod.GET,value="{id}/helloworld")
	public ModelAndView hellowold(@PathVariable("id") String s ){
		System.out.println("enter");
		ModelAndView m1=new ModelAndView("NewFile");
		m1.addObject("user", s);
		return m1;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/requestparam")
	public ModelAndView hellowoldReq(@RequestParam("id") String s ){
		System.out.println("enter");
		ModelAndView m1=new ModelAndView("NewFile");
		m1.addObject("user", s);
		return m1;
	}
	@RequestMapping(method=RequestMethod.POST,value="/loginForm")
	public String loginForm(@ModelAttribute("login") Login login ,ModelMap model){
		System.out.println("enter");
		model.addAttribute(login);
		Login user = new Login();
		user.setUserName("constant");
		model.addAttribute(user);
		return "NewFile";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/login")
	public ModelAndView login(){
		
		return new ModelAndView("login", "loginCommand", new Login());
	}
	
	

}
