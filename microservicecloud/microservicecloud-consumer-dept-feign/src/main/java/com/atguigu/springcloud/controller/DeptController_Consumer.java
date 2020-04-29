package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@RequestMapping(value = "/consumer/dept/del/{id}")
	public boolean del(@PathVariable("id") Long id) {
		return service.del(id);
	}
	
	@RequestMapping(value = "/consumer/dept/edit")
	public boolean edit(Dept dept) {
		return service.edit(dept);
	}
	
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(Dept dept) {
		return service.list();
	}
	
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}
}
