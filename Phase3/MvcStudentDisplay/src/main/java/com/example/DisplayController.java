package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {
	
//	@ResponseBody
//	@RequestMapping("/student")
//	public String displayStudent(HttpServletRequest request,HttpServletResponse response) {
//		String id = request.getParameter("sid");
//		String name=request.getParameter("sName");
//		String email= request.getParameter("sEmail");
//		StudentPojo student = new StudentPojo();
//		student.setSid(id);
//		student.setsName(name);
//		student.setsEmail(email);
//		
//		return student.toString();
//		
//	}
	
	
	@RequestMapping("/student")
	public ModelAndView displaySum(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String id = request.getParameter("sid");
		String name=request.getParameter("sName");
		String email= request.getParameter("sEmail");
		StudentPojo student = new  StudentPojo();
		student.setSid(id);
		student.setsName(name);
		student.setsEmail(email);
		mv.setViewName("Display.jsp");
		mv.addObject("Id",student.getSid());
		mv.addObject("name",student.getsName());
		mv.addObject("email",student.getsEmail());
		return mv;
		
	}
	
}
