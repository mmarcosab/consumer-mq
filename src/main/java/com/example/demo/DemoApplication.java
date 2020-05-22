package com.example.demo;

import javax.jms.JMSException;
import javax.naming.NamingException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws NamingException, JMSException {
		log.info("Iniciando a api de cadastro de pessoas");
		SpringApplication.run(DemoApplication.class, args);
		log.info("API de cadastro de pessoas iniciada e pronta para receber requisições");
	}

}
