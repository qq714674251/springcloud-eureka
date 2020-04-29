package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				
				return new Dept().setDeptno(id)
						.setDname("该Id：" + id + "没有对应的信息,Consumer客户段提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("not this database in MySQL");
			}
			
			@Override
			public boolean edit(Dept dept) {
				
				return false;
			}
			
			@Override
			public boolean del(Long id) {
				
				return false;
			}
			
			@Override
			public boolean add(Dept dept) {
				
				return false;
			}
		};
	}

}
