package org.example.enemies;

import org.example.heroes.Hero;
import org.example.utils.Utils;

public class Ogre extends Enemy {
    public Ogre(String name) {
        super(name);
        this.health = 200;
        this.damage = 20;
    }

    @Override
    public void attackBack(Hero hero) {
        if (Utils.isSuperPowerReady()) {
            System.out.println(this.name + " attacked " + hero.getName() + " back and used his super power! -10 extra HP from " + hero.getName() + "!");
            hero.takeDamage(this.damage + 10, this);
            return;
        }
        System.out.println(this.name + " attacked " + hero.getName() + " back!");
        hero.takeDamage(this.damage, this);
    }
}
