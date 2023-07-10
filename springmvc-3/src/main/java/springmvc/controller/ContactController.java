package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	//contact form method
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	//Handle form method
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
							@RequestParam(name ="email") String email,
							@RequestParam("name") String name,
							@RequestParam("password") String password,
							Model model
							) {
		
		System.out.println("user email is: "+email);
		System.out.println("username is: " +name);
		System.out.println("user password is: "+password);
		
		//processing the input data (coming from HTML form)
		model.addAttribute("email",email+" custom data");
		model.addAttribute("name", name+" data manipulated");
		model.addAttribute("password", password + " show password");
		return "success";
	}
}
