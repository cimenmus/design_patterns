package com.company.structural.composite;

// Leaf Class
// emri altında asker olmayan asker
public class LeafSoldier extends ComponentSoldier {

    public LeafSoldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void executeOrder() {
        System.out.println(rank + " - " + name);
    }

    @Override
    public void addSoldier(ComponentSoldier soldier) {
        // Will not implemented for Basic Soldier
    }

    @Override
    public void removeSoldier(ComponentSoldier soldier) {
        // Will not implemented for Basic Soldier
    }
}
