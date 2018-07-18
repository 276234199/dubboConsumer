package com.casit.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.casit.service.UserService;

//http://localhost:9001/dubboConsumer/consume.do

@RestController
@RequestMapping("/dubboConsumer")
public class ConsumerController {

	@Reference(version = "1.0.0", application = "${dubbo.application.id}"  , timeout = 20000)
	private UserService userService;

	@RequestMapping("/consume.do")
	public String consume() {
		return userService.login("QAREW", "123");
	}
}
