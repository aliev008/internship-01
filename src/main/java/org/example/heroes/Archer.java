package org.example.heroes;

import org.example.enemies.Enemy;

public class Archer extends Hero {

    private static final int DAMAGE = 30;
    private static final int HEALTH = 100;
    private static final int SUPER_POWER_EXTRA_DAMAGE = 10;

    public Archer(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    public void useSuperPower(Enemy enemy) {
        int totalDamage = this.damage + SUPER_POWER_EXTRA_DAMAGE;

        System.out.printf("%s attacked %s and used his super power! -10 extra HP from %s!%n",
                this.name, enemy.getName(), enemy.getName());

        enemy.takeDamage(totalDamage, this);
    }
}
