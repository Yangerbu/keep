package com.keep.aop;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kepp.vo.ResultJson;

@ControllerAdvice
public class GolbalException {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResultJson fail(Exception e) {
		e.printStackTrace();
		return ResultJson.fail();
	}
}
