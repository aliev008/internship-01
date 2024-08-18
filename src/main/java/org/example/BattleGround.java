package org.example;

import org.example.enemies.Enemy;
import org.example.enemies.Ogre;
import org.example.enemies.Vampire;
import org.example.enemies.Zombie;
import org.example.heroes.Hero;
import org.example.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior1 = new Warrior("Warrior 1");
        Enemy zombie1 = new Zombie("Zombie 1");
        Enemy ogre1 = new Ogre("Ogre 1");
        Enemy vampire1 = new Vampire("Vampire 1");


        for (int i = 0; i < 10; i++) {
            System.out.println();
            warrior1.attackEnemy(zombie1);
            System.out.println();
            warrior1.attackEnemy(ogre1);
            System.out.println();
            warrior1.attackEnemy(vampire1);
        }

    }
}
