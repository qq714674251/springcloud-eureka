package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entity.Dept;

@RestController
public class DeptController_Consumer {
	
//	private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value = "/consumer/dept/del/{id}")
	public boolean del(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/del/" + id, Boolean.class);
	}
	
	@RequestMapping(value = "/consumer/dept/edit")
	public boolean edit(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/edit", dept, Boolean.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(Dept dept) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
	
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}
}
