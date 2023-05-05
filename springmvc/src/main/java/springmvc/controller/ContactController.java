package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.userService;

@Controller
public class ContactController {
//	
//	@RequestMapping("/Contact")
//	public String showForm()
//	{
//		return "Contact";
//	}
//	
//	@RequestMapping(path ="/processfrom",method=RequestMethod.POST)
//	public String handleForm(
//			@RequestParam(name="email",required = false)String userEmail,
//			@RequestParam("userName") String userName,
//			@RequestParam("userPassword") String userPassword,Model model)
//	{
////	   System.out.println("Your email is: "+email);
////	   System.out.println("Your name is: "+userName);
////	   System.out.println("Your password is: "+Password);
////	   model.addAttribute("name",userName);
////	   model.addAttribute("email",email);
////	   model.addAttribute("password", Password);
//	   
//	   User user = new User();
//	   user.setUserEmail(userEmail);
//	   user.setUserName(userName);
//	   user.setUserPassword(userPassword);
//	   model.addAttribute("user", user);
//	   System.out.println(user);
//		
//		return "sucess";
//		
//	}
	@Autowired
	private userService UserService;
	@ModelAttribute
	public void common(Model model)
	{
		model.addAttribute("Header", "LearnCodeWith Vinit");
		model.addAttribute("desc","Home For Coder");
	}
	@RequestMapping("/Contact")
	public String showForm(Model m)
	{
//		m.addAttribute("Header", "LearnCodeWith Vinit");
//		m.addAttribute("desc","Home For Coder");
		return "Contact";
	}
	
	@RequestMapping(path ="/processfrom",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
        this.UserService.User(user);
        if(user.getUserName().isBlank())
        {
        	return "redirect:/Contact";
        }
//     	model.addAttribute("Header", "LearnCodeWith Vinit");
//		model.addAttribute("desc","Home For Coder");
		
		return "sucess";
		
	}

} 
