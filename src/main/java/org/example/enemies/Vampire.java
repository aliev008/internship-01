package org.example.enemies;

import org.example.heroes.Hero;

public class Vampire extends Enemy {

    private static final int DAMAGE = 15;
    private static final int HEALTH = 100;
    private static final int SUPER_POWER_EXTRA_HEALTH = 5;

    public Vampire(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    public void useSuperPower(Hero hero) {
        this.health += SUPER_POWER_EXTRA_HEALTH;
        System.out.println(this.name + " attacked " + hero.getName() + " back! The blood of the " + hero.getName() + " gave to Vampire +5 HP and now is " + this.health + "!");
        hero.takeDamage(this.damage, this);
    }
}
