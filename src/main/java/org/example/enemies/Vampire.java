package org.example.enemies;

import org.example.heroes.Hero;

public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name);
        this.health = 100;
        this.damage = 15;
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + hero.getName() + " attack is: " + this.getHealth());
            attackBack(hero);
            return;
        }
        System.out.println(this.name + " died!");
    }

    @Override
    public void attackBack(Hero hero) {
        this.health += 5;
        System.out.println(this.name + " attacked " + hero.getName() + " back! The blood of the " + hero.getName() + " gave to Vampire +5 HP and now is " + this.health + "!");
        hero.takeDamage(this.damage, this);
    }
}
