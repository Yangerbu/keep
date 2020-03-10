package com.keep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kepp.vo.ResultJson;

@Controller
public class pageController {
	@RequestMapping("{mudle}")
	public String mudle(@PathVariable String mudle) {
		return mudle;
	}
}
