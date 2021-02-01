
package com.company;

public class Main {
    public static void main(String[] args) {
        MyProducer mp = new MyProducer();

        MyConsumer mc = new MyConsumer("Amin");


        mp.start();

        mc.start();


    }
}
