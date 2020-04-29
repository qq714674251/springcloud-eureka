package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		
		return service.add(dept);
	}
	
	@RequestMapping(value = "/dept/del/{id}", method = RequestMethod.GET)
	public boolean del(@PathVariable("id") Long id) {
		
		return service.del(id);
	}
	
	@RequestMapping(value = "/dept/edit", method = RequestMethod.POST)
	public boolean edit(@RequestBody Dept dept) {
		
		return service.edit(dept);
	}
	
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		
		return service.get(id);
	}
	
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		
		return service.list();
	}
	
}
