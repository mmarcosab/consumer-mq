package com.example.demo.jms;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.google.gson.Gson;

@Slf4j
@RequiredArgsConstructor
@Component
public class ConsumerFila {

    private List<Person> persons = new ArrayList<>();
    private final PersonRepository personRepository;

    //@JmsListener( destination = "${activemq.queue-name}" )
    public void listen(String mensagem) {
        log.info(mensagem);
        Person person = new Person();
        try {
			Gson gson = new Gson();
			person = gson.fromJson(mensagem, Person.class);
			personRepository.save(person);
		}catch(Exception e){
            log.error(e.getMessage());
		}
    }

}
