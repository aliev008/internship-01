package org.example.heroes;

import org.example.enemies.Enemy;
import org.example.interfaces.Mortal;
import org.example.utils.Utils;

public abstract class Hero implements Mortal {
    public String name;
    protected int damage;
    protected int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
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

    public abstract void useSuperPower(Enemy enemy);

    // Template Method
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive()) {
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " is already dead! No need to attack him.");
                return;
            }
            if (Utils.isSuperPowerReady()) {

                // Use of the abstract method in the Template Method
                useSuperPower(enemy);

            } else {
                System.out.println(this.name + " attacked " + enemy.getName() + "!");
                enemy.takeDamage(this.damage, this);
            }
        } else {
            System.out.println(this.getName() + " is dead! He cannot attack.");
        }

    }

    public void takeDamage(int damage, Enemy enemy) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + enemy.getName() + " attack is: " + this.getHealth());
            return;
        }
        System.out.println(this.name + " is dead!");
    }

}
