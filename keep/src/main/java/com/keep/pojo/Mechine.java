package com.keep.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_material")
public class Mechine {
	private Integer id;
	private String name;
	private Integer nums;
	private Integer price;
	private Date inTime;
	private Date fixTime;
}
