package com.keep.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user_info")
public class UserInfo {
	@TableId
	private Integer id;
	private String name;
	private Integer age;
	private String tel;
	private String addr;
	private Date createdTime;
	private Date modifiedTime;
}
