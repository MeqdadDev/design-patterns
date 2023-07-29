package dp.designpatterns.Factory;

import java.util.Random;

public class Game {
    static Random random = new Random();

    public static void main(String[] args) {
        int enemyCounter = 7;

        while (enemyCounter > 0) {
            Enemy enemy = EnemyFactory.createEnemy(getRandom(1, 2));
            enemy.showUp();
            enemyCounter--;
        }
    }

    public static int getRandom(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
