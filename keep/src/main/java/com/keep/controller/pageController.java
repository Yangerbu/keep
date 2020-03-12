package com.keep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keep.pojo.UserInfo;

@Controller
public class pageController {
	@RequestMapping("{mudle}")
	public String mudle(@PathVariable String mudle,UserInfo user,Model model) {
		model.addAttribute("user", user);
		return mudle;
	}
	
}
