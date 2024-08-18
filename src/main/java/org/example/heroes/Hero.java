package org.example.heroes;

import org.example.enemies.Enemy;
import org.example.interfaces.Mortal;

public abstract class Hero implements Mortal {
    public String name;
    protected int damage;
    protected int health;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage, Enemy enemy) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + enemy.getName() + " attack is: " + this.getHealth());
            return;
        }
        System.out.println( this.name + " is Dead!");
    }

    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " is already dead! No need to attack him.");
                return;
            }
            System.out.println(this.name + " attacked " + enemy.getName() + "!");
            enemy.takeDamage(this.damage, this);
        } else {
            System.out.println(this.getName() + " is dead! He cannot attack.");
        }

    }

}
