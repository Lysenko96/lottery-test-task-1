package core.basesyntax;

import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.Lottery;

import java.util.Random;

public class Application {

    public static final int TEST_COUNTER = 3;
    public static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier, MAX_NUMBER);
        for(int i = 0; i < TEST_COUNTER; i++){
            System.out.println(lottery.getRandomBall());
        }
    }
}
