package com.keep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keep.service.ClassesService;
import com.kepp.vo.InfoVo;

@RestController
@RequestMapping("classes")
public class ClassesController {
	
	@Autowired
	private ClassesService classesService;
	@RequestMapping("getClassesTableInfo")
	public InfoVo getClasses(Integer page,Integer limit) {
		return classesService.getClassesTableInfo(page,limit);
	}
}
