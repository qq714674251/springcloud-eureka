package com.atguigu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.save(dept);
	}

	@Override
	public boolean del(Long deptno) {
		return deptDao.delete(deptno);
	}

	@Override
	public boolean edit(Dept dept) {
		return deptDao.update(dept);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

	@Override
	public Dept get(Long deptno) {
		return deptDao.getOne(deptno);
	}

}
