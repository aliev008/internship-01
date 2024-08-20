package org.example;

import org.example.enemies.Enemy;
import org.example.enemies.Ogre;
import org.example.enemies.Vampire;
import org.example.enemies.Zombie;
import org.example.heroes.Archer;
import org.example.heroes.Hero;
import org.example.heroes.Mage;
import org.example.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Warrior 1");
        Hero mage = new Mage("Mage 1");
        Hero archer = new Archer("Archer 1");

        Enemy zombie = new Zombie("Zombie 1");
        Enemy ogre = new Ogre("Ogre 1");
        Enemy vampire = new Vampire("Vampire 1");

        for (int i = 0; i < 10; i++) {
            mage.attackEnemy(vampire);
//            mage.attackEnemy(ogre);
//            archer.attackEnemy(vampire);
        }
    }
}