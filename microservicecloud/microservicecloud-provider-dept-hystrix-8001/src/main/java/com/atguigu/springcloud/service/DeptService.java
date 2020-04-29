package com.atguigu.springcloud.service;

import java.util.List;

import com.atguigu.springcloud.entity.Dept;

public interface DeptService {
	public boolean add(Dept dept);

    public boolean del(Long deptno);

    public boolean edit(Dept dept);

    public List<Dept> list();

    public Dept get(Long deptno);
}
