package com.company.structural.composite;

// Component Class
public abstract class ComponentSoldier {

    String name = null;
    public Rank rank = null;

    public abstract void executeOrder(); // Hem Leaf hemde Composite tipi için uygulanacak olan fonksiyon
    public abstract void addSoldier(ComponentSoldier soldier);
    public abstract void removeSoldier(ComponentSoldier soldier);
}
