package com.example;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	Logger log=Logger.getAnonymousLogger();
	@ResponseBody
	@RequestMapping("/register-user/{user}/{pwd}/{email}")
	public String regsiterms(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String user,@PathVariable("pwd") String pwd,@PathVariable("email") String email) {
	
		log.info("entered into register ms");
		Employee e=new Employee();
		e.setUser(user);
		e.setPassword(pwd);
		e.setEmail(email);
		repo.save(e);
		
		return "done";
	}
	
}
