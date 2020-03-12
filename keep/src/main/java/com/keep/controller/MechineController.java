package com.keep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keep.service.MechineService;
import com.kepp.vo.InfoVo;

@RestController
@RequestMapping("mechine")
public class MechineController {
	
	@Autowired
	private MechineService mechineService;
	@RequestMapping("getMechineTableInfo")
	public InfoVo getMechine(Integer page,Integer limit) {
		return mechineService.getMechineTableIndo(page,limit);
	}
}
