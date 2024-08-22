package org.example.enemies;

import org.example.heroes.Hero;

public class Ogre extends Enemy {

    private static final int DAMAGE = 20;
    private static final int HEALTH = 200;
    private static final int SUPER_POWER_EXTRA_DAMAGE = 10;

    public Ogre(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    public void useSuperPower(Hero hero) {
        int totalDamage = this.damage + SUPER_POWER_EXTRA_DAMAGE;

        System.out.println(this.name + " attacked " + hero.getName() + " back and used his super power! -10 extra HP from " + hero.getName() + "!");

        hero.takeDamage(totalDamage, this);

    }
}
