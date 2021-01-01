package com.Zookeeper;

public class Mammal {
    protected int energy = 0;

    public Mammal(){
        this.energy = 100;
    }
    public int displayEnergy(){
        return this.energy;
    }
}
