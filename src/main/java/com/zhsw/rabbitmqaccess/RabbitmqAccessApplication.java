package com.zhsw.rabbitmqaccess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableRabbit
@ComponentScan("com.zhsw.rabbitmqaccess")
@MapperScan("com.zhsw.rabbitmqaccess.dao")
@SpringBootApplication
public class RabbitmqAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqAccessApplication.class, args);
	}
}
