package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		
		
		System.out.println("This is home url");
		model.addAttribute("name", "Vinit Kumar Singh");
		model.addAttribute("Id", 1111);
		List<String> name = new ArrayList<String>();
		name.add("Vinita");
		name.add("Tanvi");
		name.add("Dharmendra Singh"); 
		model.addAttribute("f", name);
		return "index";
	} 
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about ");
		return "about";
	}
	@RequestMapping("/services")
	public String services()
	{
		return "services";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
//		Creating Object of ModelAndView
		ModelAndView modelAndview = new ModelAndView();
//		Adding data
		modelAndview.addObject("name", "Krishnandan");
		modelAndview.addObject("RollNo",201310);
		LocalDateTime now =LocalDateTime.now();
		modelAndview.addObject("Time", now);
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(123);
		marks.add(654);
		marks.add(741);
		marks.add(852);
		marks.add(584);
		modelAndview.addObject("mks",marks);
//		Setting View
		modelAndview.setViewName("help");
		return modelAndview;
		
		
	}
	
	

}
