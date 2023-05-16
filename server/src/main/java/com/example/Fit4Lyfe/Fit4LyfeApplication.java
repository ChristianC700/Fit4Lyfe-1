package com.example.Fit4Lyfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Fit4LyfeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Fit4LyfeApplication.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
