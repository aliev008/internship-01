package org.example.enemies;

import org.example.heroes.Hero;
import org.example.interfaces.Mortal;

public abstract class Enemy implements Mortal {
    protected final String name;
    protected int health;
    protected int damage;

    public Enemy(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + hero.getName() + " attack is: " + this.getHealth());
            this.attackBack(hero);
            return;
        }
        System.out.println(this.name + " died!");
    }

    public void attackBack(Hero hero) {
        System.out.println(this.name + " attacked " + hero.getName() + " back!");
        hero.takeDamage(this.damage, this);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
