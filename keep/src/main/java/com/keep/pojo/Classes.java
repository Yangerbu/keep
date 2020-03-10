package com.keep.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_class")
public class Classes {
	@TableId(type = IdType.AUTO)
	private Integer id;
	private String className;
	private String teacher;
	private Integer classTime;
	private Integer nums;
	private Integer price;
}
