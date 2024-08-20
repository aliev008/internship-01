package org.example.heroes;

import org.example.enemies.Enemy;

public class Warrior extends Hero {

    private static final int DAMAGE = 10;
    private static final int HEALTH = 100;

    public Warrior(String name) {
        super(name, DAMAGE, HEALTH);
    }

    @Override
    public void useSuperPower(Enemy enemy) {
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        this.health -= damage + 5;
        if (isAlive()) {
            System.out.println(this.name + " used his armor and it reduced damage from " + enemy.getName() + " by 5 HP!");
            System.out.println(this.name + " health after " + enemy.getName() + " attack is: " + this.getHealth());
            return;
        }
        System.out.println(this.name + " is dead!");
    }
}
