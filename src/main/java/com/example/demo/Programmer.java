package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    @Autowired
    Computer computer;
    public void code() {
        computer.compileCode();
        System.out.println("Programmer codes...");
    }
}
