package core.basesyntax.service;

import core.basesyntax.entity.ColorType;

import java.util.Random;

public class ColorSupplier {

    private Random random;
    public ColorSupplier() {
    }

    public ColorSupplier(Random random) {
        this.random = random;
    }

    private static final int COLOR_TYPE_SIZE = ColorType.values().length;
    public String getRandomColor() {
        return ColorType.values()[random.nextInt(COLOR_TYPE_SIZE)].name();
    }
}
