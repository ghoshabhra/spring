package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTM form
	@RequestMapping("/showform")
	public String showForm(){	
		System.out.println("test");
		return "helloworld-form";
	}

	//need a controller method to process the HTML form
	@RequestMapping("/processform")
	public String processForm(){	
		return "helloworld";
	}
	
	@RequestMapping("/processformversion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		System.out.println(request);
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		//convert the data to all caps
		theName =  theName.toUpperCase();
		
		//create the msg
		//add message to the model
		model.addAttribute("message", "Yo! " + theName);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processformversion3")
	public String processformversion3(@RequestParam("studentName") String theName, Model model) {
		//read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
		//convert the data to all caps
		theName =  theName.toUpperCase();
		
		//create the msg
		//add message to the model
		model.addAttribute("message", "Hey My Friend from v3! " + theName);
		
		return "helloworld";
	}
	
	
	
	
}
