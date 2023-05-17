package com.example.Fit4Lyfe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Fit4LyfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Fit4LyfeApplication.class, args);
		log.info("Fit4Lyfe application is now running.");
	}

}
