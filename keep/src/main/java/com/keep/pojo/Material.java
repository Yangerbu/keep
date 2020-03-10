package com.keep.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_material")
public class Material {
	@TableId(type = IdType.AUTO)
	private Integer id;
	private String name;
	private Integer nums;
	private Integer price;
	private Date inTime;
	private Date fixTime;
}
