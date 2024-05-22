package com.masai.authapi.restorentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("say")
	public String sayHello() {
		return "hi ravi patel ";
	}

}
