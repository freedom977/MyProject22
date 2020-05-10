package by.belhard.j22.lessons.lesson06.test;

public class Rectangle extends Square {
    private final double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
