package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
//import org.w3c.dom.ls.LSOutput;

@Controller 
public class ReController {
	@RequestMapping("/one")
	public RedirectView one()
	{
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		System.out.println("this is one handler");
		return redirectView;
	}
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is second handler");
		return "Contact";
	}
	
	

}
