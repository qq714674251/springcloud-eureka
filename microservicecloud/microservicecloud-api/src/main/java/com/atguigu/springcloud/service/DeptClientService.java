package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springcloud.entity.Dept;

//使用Feign的WebService形式接口加注解实现负载均衡
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);

	@RequestMapping(value = "/dept/del/{id}", method = RequestMethod.GET)
	public boolean del(@PathVariable("id") Long id);

	@RequestMapping(value = "/dept/edit", method = RequestMethod.POST)
	public boolean edit(Dept dept);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id);

}
