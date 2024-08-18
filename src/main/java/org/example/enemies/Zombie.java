package org.example.enemies;

import org.example.heroes.Hero;

public class Zombie extends Enemy {
    public Zombie(String name) {
        super(name);
        this.health = 50;
        this.damage = 10;
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + hero.getName() + " attack is: " + this.getHealth());
            attackBack(hero);
            return;
        }
        System.out.println(this.name + " died but has been resurrected!");
        this.health = 50;
    }
}
