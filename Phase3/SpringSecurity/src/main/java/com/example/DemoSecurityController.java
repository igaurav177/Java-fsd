package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DemoSecurityController {

	@ResponseBody
	@RequestMapping("/")
	public String demoMsg() {
		return "general audeinece";
	}
	}
