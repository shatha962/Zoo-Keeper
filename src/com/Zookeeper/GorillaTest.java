package com.Zookeeper;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla1 = new Gorilla();
        Gorilla gorilla2 = new Gorilla();
        gorilla1.throwSomething();
        gorilla1.throwSomething();
        gorilla1.throwSomething();
        gorilla1.eatBananas();
        gorilla1.eatBananas();
        gorilla1.climb();
        System.out.println(gorilla1.displayEnergy());
        System.out.println(gorilla2.displayEnergy());

    }
}
