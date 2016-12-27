package com.hdq.contactcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactAdminController {

	@RequestMapping(value = "/adminform", method = RequestMethod.GET)
	protected ModelAndView getAdminForm(){
		ModelAndView model = new ModelAndView("AdminForm");
		return model;
	}

	@RequestMapping(value = "/submitadminform", method = RequestMethod.POST)
	protected ModelAndView submitAdminForm(@RequestParam Map<String, String> reqVars){
		
		String name = reqVars.get("contactName") ;
		String phone = reqVars.get("contactPhone") ;
		
		ModelAndView model = new ModelAndView("SubmitResponse");
		model.addObject("responseMessage", "Submission is Successful! The name is: " + name +" and the phone is " + phone + ".");

		return model;

	}
}