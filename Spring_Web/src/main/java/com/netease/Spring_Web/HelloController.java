package com.netease.Spring_Web;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/spring")
	public void spring(@RequestHeader("Accept") String accept, Writer writer) throws IOException {
		writer.write(" accept: " + accept);
	}
	
	@RequestMapping(value = "user/login")
	public String login(@RequestParam("userName") String userName, @RequestParam("password") String password, ModelMap map) {
		map.addAttribute("userName", userName);
		map.addAttribute("password", password);
		return "user";
	}
	
}
