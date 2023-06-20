package com.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Annotation
{
	@RequestMapping("/hello")
	public String getModel()
	{
		return "show";
	}
	
	@RequestMapping("/welcome")
	public String getModel1()
	{
		return "view";
	}
	
	@RequestMapping("/to")
	public String getModel2()
	{
		return "show";
	}
	
	@RequestMapping("/spring")
	public String getModel3()
	{
		return "view";
	}
	
	@RequestMapping("/web")
	public String getModel4()
	{
		return "show";
	}
	
	@RequestMapping("/MVC")
	public String getModel5()
	{
		return "view";
	}
}
