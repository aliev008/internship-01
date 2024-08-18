package org.example.heroes;

import org.example.enemies.Enemy;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
        this.damage = 10;
        this.health = 100;
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
            this.health -= damage + 5;
            if (isAlive()) {
                System.out.println(this.name + " used his armor and it reduced damage from " + enemy.getName() + " by 5 HP!");
                System.out.println(this.name + " health after " + enemy.getName() + " attack is: " + this.getHealth());
                return;
            }
            System.out.println( this.name + " is dead!");

    }
}
