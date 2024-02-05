package DesignPatterns.Creational.Factory;

import java.util.Random;

public class Game {
    static Random random = new Random();

    public static void main(String[] args) {
        int enemyCounter = 5;

        while (enemyCounter > 0) {
            Enemy enemy = EnemyFactory.createEnemy(getRandom(1, 2));
            enemy.showUp();
            enemyCounter--;
        }
    }

    public static int getRandom(int min, int max) {
        int randomEnemyId = random.nextInt((max - min) + 1) + min;
        return randomEnemyId;
    }
}
