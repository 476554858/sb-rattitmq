package com.example.sbrattitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SbRattitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbRattitmqApplication.class, args);
	}

}
