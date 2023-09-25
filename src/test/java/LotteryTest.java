import core.basesyntax.entity.Ball;
import core.basesyntax.entity.ColorType;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.Lottery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static core.basesyntax.Application.MAX_NUMBER;
import static core.basesyntax.Application.TEST_COUNTER;

public class LotteryTest {

    private Random random;
    private ColorSupplier colorSupplier;
    private Lottery lottery;
    private static final int SEED = 47;
    private static int COUNTER = 0;

    @Before
    public void setUp() {
        random = new Random(SEED);
        colorSupplier = new ColorSupplier(random);
        lottery = new Lottery(random, colorSupplier, MAX_NUMBER);
    }

    @Test
    public void Test(){
        List<Ball> balls = new ArrayList<>();
        for(int i = 0; i < TEST_COUNTER; i++) {
            balls.add(lottery.getRandomBall());
        }
        Assert.assertEquals(new Ball(ColorType.BLACK.name(), 55), balls.get(COUNTER));
        Assert.assertEquals(new Ball(ColorType.BLACK.name(), 61), balls.get(++COUNTER));
        Assert.assertEquals(new Ball(ColorType.READ.name(), 29), balls.get(++COUNTER));
    }
}
