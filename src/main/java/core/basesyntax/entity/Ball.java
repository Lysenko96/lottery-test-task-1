package core.basesyntax.entity;

import java.util.Objects;

public class Ball {

    private String colorType;
    private int number;

    public Ball() {
    }

    public Ball(String colorType, int number) {
        this.colorType = colorType;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colorType=" + colorType +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (number != ball.number) return false;
        return Objects.equals(colorType, ball.colorType);
    }

    @Override
    public int hashCode() {
        int result = colorType != null ? colorType.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }
}
