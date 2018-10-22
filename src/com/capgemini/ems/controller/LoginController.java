package com.capgemini.ems.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.ems.bean.UserBean;
import com.capgemini.ems.service.IAuthenticationService;

@Controller
public class LoginController {

	@Autowired
	private IAuthenticationService authenticationService;

	@RequestMapping(value = "/displayLogin")
	public String displayLogin(Model model) {
	
		UserBean user = new UserBean();
		model.addAttribute("userDetails", user);
		return "Login";
	}
	
	@RequestMapping(value = "/userHome")
	public String displayUserHome(@Valid @ModelAttribute("userDetails") UserBean user, BindingResult bindingResult, Model model) {
		
		user = authenticationService.getUser(user.getUserName(), user.getUserPassword());
		
		if(user.getUserType().equals("ADMIN"))
			return "AdminHome";
		return "EmployeeHome";
	}
	
	@RequestMapping(value = "/adminHome")
	public String displayAdminHome() {
		
		return "AdminHome";
	}

	@RequestMapping(value = "/employeeHome")
	public String displayEmployeeHome() {

		return "EmployeeHome";
	}

	// internal exceptional handler
	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(Exception exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("errorObj", exception);
		mav.setViewName("Error");
		return mav;
	}
}
