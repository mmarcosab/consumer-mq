package com.example.demo.util;

import com.example.demo.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Relatorio {

    private final PersonRepository repository;

    //@Scheduled(cron = "0 03 22 * * *", zone = "America/Sao_Paulo")
    public void getPersonsAfterFifty(){
        long qtde = repository.count();
        log.info("Atualmente existem " + qtde + " pessoas cadastradas.");
    }

}
