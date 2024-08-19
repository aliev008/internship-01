package org.example.heroes;

import org.example.enemies.Enemy;
import org.example.utils.Utils;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
        this.damage = 20;
        this.health = 100;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " is already dead! No need to attack him.");
                return;
            }
            if (Utils.isSuperPowerReady()) {
                System.out.println(this.name + " attacked " + enemy.getName() + " and used his super power! " + this.name + " took soul from " + enemy.getName() + "!");
                enemy.takeDamage(enemy.getHealth(), this);
                return;
            }
            super.attackEnemy(enemy);
        } else {
            System.out.println(this.getName() + " is dead! He cannot attack.");
        }
    }
}
