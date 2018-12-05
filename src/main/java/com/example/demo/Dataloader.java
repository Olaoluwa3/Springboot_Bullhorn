package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {

    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Message message = new Message("Welcome to Twitter!", "January 1, 2001", "Founder");
        repository.save(message);

    }
}
