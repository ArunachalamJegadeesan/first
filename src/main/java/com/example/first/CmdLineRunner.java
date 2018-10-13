package com.example.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CmdLineRunner implements CommandLineRunner {
    @Value("${test.my.string}")
    private  String myString;
    @Override
    public void run(String... args) {
        System.out.println("I am here as happy as ever" +myString);

    }
}
