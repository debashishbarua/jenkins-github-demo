package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class JenkinsGithubDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsGithubDemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHelllo() {
		return "Helllo.....";
	}
	
	@GetMapping("/v1/hello")
	public String sayHellloV1() {
		return "Helllo.....";
	}

}
