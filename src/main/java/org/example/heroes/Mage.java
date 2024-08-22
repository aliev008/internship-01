package org.example.heroes;

import org.example.enemies.Enemy;

public class Mage extends Hero {

    private static final int DAMAGE = 20;
    private static final int HEALTH = 100;

    public Mage(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    public void useSuperPower(Enemy enemy) {
        int totalDamage = enemy.getHealth();

        System.out.printf("%s attacked %s and used his super power! %s took soul from %s!%n",
                this.name, enemy.getName(), this.name, enemy.getName());

        enemy.takeDamage(totalDamage, this);
    }
}
