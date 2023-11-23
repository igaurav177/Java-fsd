package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	
	@ResponseBody
	@RequestMapping("/login")
	public void login(HttpServletRequest request,HttpServletResponse response) throws IOException {
			
		String name=request.getParameter("uname");
		String password=request.getParameter("pwd");
		if(name.equals(password)) {
			 response.sendRedirect("index.jsp");
		}else {
			 PrintWriter out = response.getWriter();
			 out.print("Invalid Username and Password");
			 response.sendRedirect("login.jsp");
		}
			
	}
	
	
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User u=ac.getBean(User.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		u.setUname(request.getParameter("name"));
		u.setUemail(request.getParameter("email"));
		if(dao.insert(u)>0) {
			mv.setViewName("success.jsp");
		}
		
		
		return mv;
	}
	
	 @RequestMapping("/update")
	    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
	        ModelAndView mv = new ModelAndView();
	        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	        UserDAO dao = ac.getBean(UserDAO.class);

	        int userId = Integer.parseInt(request.getParameter("id"));
	        User existingUser = dao.getUserById(userId);

	        if (existingUser != null) {
	            existingUser.setUname(request.getParameter("name"));
	            existingUser.setUemail(request.getParameter("email"));

	            dao.update(existingUser);
	            mv.setViewName("displayall.jsp");
	        } else {
	            mv.setViewName("error.jsp");
	        }

	        return mv;
	    }
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		User user=ac.getBean(User.class);
		UserDAO dao=ac.getBean(UserDAO.class);
		List<User> list=dao.getal();
		mv.setViewName("displayall.jsp");
		mv.addObject("list",list);
		
		return mv;
	}
}
