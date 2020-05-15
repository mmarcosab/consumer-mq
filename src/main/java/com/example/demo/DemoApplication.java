package com.example.demo;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) throws NamingException, JMSException {
		logger.info("Iniciando a api de cadastro de pessoas");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("API de cadastro de pessoas iniciada e pronta para receber requisições");
	}

}
