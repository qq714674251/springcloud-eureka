package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 自定义Ribbon负载均衡规则
 * @author Herman
 *
 */
@Configuration
public class MySelfRule{
	
	@Bean
	public IRule myRule() {
//		return new RandomRule();//Ribbon默认是轮询,我自定义位随机
		return new RandomRule_Herman(); // 自定义的随机执行五次
	}

}
