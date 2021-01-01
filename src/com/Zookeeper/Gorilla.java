package com.Zookeeper;

public class Gorilla extends Mammal {
    public Gorilla(){

    }
    public void throwSomething(){
        System.out.println("Oops,gorilla has thrown something");
        this.energy -= 5;
    }
    public void eatBananas(){
        System.out.println("Gorilla is satisfied :)");
        this.energy += 10;
    }
    public void climb(){
        System.out.println("Gorilla has climbed a tree :)");
        this.energy -= 10;
    }
}
