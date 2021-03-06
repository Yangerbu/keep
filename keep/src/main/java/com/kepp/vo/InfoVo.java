package com.kepp.vo;

import java.util.List;

import com.keep.pojo.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class InfoVo {
	private  Integer code=0;
	private  String msg="OK";
	private  Long count;
	private  Object data;
	
	public InfoVo(long total, Object records) {
		this.code=0;
		this.msg="ok";
		this.count=total;
		this.data=records;
	}

}
