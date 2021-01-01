package com.Zookeeper;

public class Bat extends Mammal{
    public Bat(){
        this.energy = 300;
    }
    public void fly(){
        System.out.println("a bat is taking off");
        this.energy -= 50;
    }
    public void eatHumans(){
        this.energy += 25;
    }
    public void attackTown(){
        System.out.println("town on fire");
        this.energy += 100;
    }
}
