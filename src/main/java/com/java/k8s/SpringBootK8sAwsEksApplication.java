package com.java.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootK8sAwsEksApplication {

	@GetMapping("/welcome")
	public String greetings() {
		return "Hello Mr Meher , Welcome to spring project and deploy to EKS in AWS ..... !";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootK8sAwsEksApplication.class, args);
	}

}
