package com.example.demo.jms;

import com.example.demo.model.Person;
import com.example.demo.repositories.PersonRepository;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Slf4j
@RequiredArgsConstructor
@Component
public class ConsumerTopico {

    private final PersonRepository personRepository;

    @JmsListener( destination = "${activemq.topic-name}", subscription = "assinatura", selector = "test=false")
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
