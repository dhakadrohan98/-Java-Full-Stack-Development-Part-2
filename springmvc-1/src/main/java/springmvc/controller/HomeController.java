package springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//returing name of view
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Sigma");
		model.addAttribute("id", 234522);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Roshni");
		friends.add("Rohan");
		friends.add("Shubham");
		
		model.addAttribute("frnd",friends);
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//creating model & view object
		ModelAndView modelAndView = new ModelAndView();		
		
		//setting the data
		modelAndView.addObject("name", "Uttam maveli");
		modelAndView.addObject("rollno", 986335);
		
		//Setting current Date & Time
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//Setting view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
	
	
	
	
}
