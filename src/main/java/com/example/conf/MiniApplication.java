package com.example.conf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//改变自动扫描的包
@ComponentScan(basePackages = {"com.example"})
@Controller
@RequestMapping
public class MiniApplication {

	@RequestMapping("/")
	String index() {
		return "login";
	}

	public static void main(String[] args) {
		SpringApplication.run(MiniApplication.class, args);
	}
}
