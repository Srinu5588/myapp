package com.example.firstapp.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}

}
