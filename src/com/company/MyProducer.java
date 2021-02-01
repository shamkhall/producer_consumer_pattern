package com.company;

import java.util.UUID;

public class MyProducer extends Thread{

    @Override
    public void run(){
        while (true) {
            Base.list.add(UUID.randomUUID().toString()); // random word
        }
    }

}
