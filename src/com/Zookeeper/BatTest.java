package com.Zookeeper;

public class BatTest {
    public static void main(String[] args) {
        Bat bat1 =new Bat();
        bat1.attackTown();
        bat1.attackTown();
        bat1.attackTown();
        bat1.eatHumans();
        bat1.eatHumans();
        bat1.fly();
        System.out.println(bat1.getEnergy());

    }
}
