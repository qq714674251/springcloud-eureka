package com.atguigu.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
	
	private Long deptno;				//部门编号
	private String dname;				//部门名称
	private String db_source;			//当前所在数据库
	
}
