/*package com.vub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vub.model.User;

@Controller
public class LoginNewAccountController {

	@RequestMapping(value = "/login/create", method = RequestMethod.GET)
	public String showLoginCreate(@ModelAttribute("user") User user) {
		System.out.println("loginCreateAccount GET");
		return "loginCreateAccount";
	}

	@RequestMapping(value = "/login/create", method = RequestMethod.POST)
	public String processLoginCreate(@ModelAttribute("user") User user) {
		System.out.println("loginCreateAccount POST");
		System.out.println("Asking to create new user with credentials: "+ user);
		String ret = "redirect:/login/create/succesfull/" + user.getName();
		return ret;
	}

	@RequestMapping("/login/succesfull/")
	public String succesfullLogin() {
		System.out.println("/login/succesfull");
		return "succesfullLogin";
	}

	@RequestMapping(value="/login/create/succesfull/{name}")
	public String succesfullCreation(@PathVariable String name) {
		System.out.println("/login/create/succesfull");
		System.out.println(name);
		return "succesfullCreationAccount";
	}
}
*/