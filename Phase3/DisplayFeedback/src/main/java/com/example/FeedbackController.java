package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FeedbackController {
	@Autowired
	FeedbackServices service;
	@RequestMapping("/")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView defaultPage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();

		mv.setViewName("index.jsp");

		return mv;
	}
	@RequestMapping("/insert")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView insertrecord(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Feedback f=new Feedback();
		f.setUsername(request.getParameter("username"));
		f.setFeedbacktext(request.getParameter("feedbacktext"));
		if(service.insert(f)!=null) {
			mv.setViewName("display.jsp");
		}

		return mv;
	}

	@RequestMapping("/getall")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Feedback> list=service.getall();
		mv.setViewName("displayall.jsp");
		mv.addObject("list",list);

		return mv;
	}
}
