package core.basesyntax;

import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.Lottery;

import java.util.Random;

public class Application {

    public static final int TEST_COUNTER = 3;
    public static final int MAX_NUMBER = 100;
    public static void main(String[] args) {
<<<<<<< HEAD
        Lottery ball1 = new Lottery();
        System.out.println(ball1.getRandomBall().toString());
        Lottery ball2 = new Lottery();
        System.out.println(ball2.getRandomBall().toString());
        Lottery ball3 = new Lottery();
        System.out.println(ball3.getRandomBall().toString());
=======
        // create three balls using class Lottery and print information about them in console
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier, MAX_NUMBER);
        for(int i = 0; i < TEST_COUNTER; i++){
            System.out.println(lottery.getRandomBall());
        }
>>>>>>> 0f7ad5f (add-solution-to-review lottery-test-task)
    }
}
