package org.example.enemies;

import org.example.heroes.Hero;

public class Zombie extends Enemy {

    private static final int DAMAGE = 10;
    private static final int HEALTH = 50;

    public Zombie(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    protected void onDeath() {
        System.out.println(this.name + " died but has been resurrected!");
        this.health = HEALTH;
    }

    @Override
    public void useSuperPower(Hero hero) {
    }

}
