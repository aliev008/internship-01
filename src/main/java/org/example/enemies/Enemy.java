package org.example.enemies;

import org.example.heroes.Hero;
import org.example.interfaces.Mortal;
import org.example.interfaces.Superpowered;
import org.example.utils.Utils;

public abstract class Enemy implements Mortal {
    protected final String name;
    protected int health;
    protected int damage;

    public Enemy(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    protected void onDeath() {
        System.out.println(this.name + " died!");
    }

    public void takeDamage(int damage, Hero hero) {
        this.health -= damage;
        if (isAlive()) {
            System.out.println(this.name + " health after " + hero.getName() + " attack is: " + this.getHealth());
            this.attackBack(hero);
        }
        else {
            onDeath();
        }
    }

    public abstract void useSuperPower(Hero hero);

    // Template Method
    public void attackBack(Hero hero) {
        if (this instanceof Superpowered && Utils.isSuperPowerReady()) {

            // Use of the abstract method in the Template Method
            useSuperPower(hero);
        } else {
            System.out.println(this.name + " attacked " + hero.getName() + " back!");
            hero.takeDamage(this.damage, this);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
