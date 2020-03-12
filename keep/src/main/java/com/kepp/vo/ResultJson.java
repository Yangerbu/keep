package com.kepp.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResultJson {
	private  Integer status;
	private  String msg;
	private  Object data;
	
	public static ResultJson success() {
		return new ResultJson(200,"OK",null);
	}
	public static ResultJson success(String msg) {
		return new ResultJson(200,msg,null);
	}
	public static ResultJson success(Object data) {
		return new ResultJson(200,"OK",data);
	}
	public static ResultJson fail() {
		return new ResultJson(401,"Not Fount",null);
	}
}
