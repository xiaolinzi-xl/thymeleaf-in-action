package com.waylau.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello 控制器
 * 
 * @author xiaolinzi
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}
}
