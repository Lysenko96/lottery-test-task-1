package core.basesyntax.service;

import core.basesyntax.entity.Ball;

import java.util.Random;

public class Lottery {

    private Random random;
    private ColorSupplier colorSupplier;
    private int maxNumber;
    public Lottery() {
    }

    public Lottery(Random random, ColorSupplier colorSupplier, int maxNumber) {
        this.random = random;
        this.colorSupplier = colorSupplier;
        this.maxNumber = maxNumber;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
    }
}
