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
	private  Integer code=0;
	private  String msg="OK";
	private  Integer count;
	private  Object data;
	
	public static ResultJson success(Integer count,Object data) {
		return new ResultJson(0,"OK",count,data);
	}
	public static ResultJson fail() {
		return new ResultJson(1,"Not Fount",null,null);
	}
}
