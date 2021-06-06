package com.company.structural.composite;

import java.util.ArrayList;

// Composite Class
// emri altında asker olan asker
public class CompositeSoldier extends ComponentSoldier {

    private final ArrayList<ComponentSoldier> soldierList = new ArrayList<>();

    public CompositeSoldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public void executeOrder() {
        System.out.println(rank + " - " + name);
        for (ComponentSoldier soldier: soldierList){
            soldier.executeOrder();
        }
    }

    @Override
    public void addSoldier(ComponentSoldier soldier) {
        soldierList.add(soldier);
    }

    @Override
    public void removeSoldier(ComponentSoldier soldier) {
        soldierList.remove(soldier);
    }
}
