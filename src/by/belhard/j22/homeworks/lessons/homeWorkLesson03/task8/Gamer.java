package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task8;

public class Gamer {
    private int x, y;
    private String name;
    private double d = 0;

    public Gamer(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name + "is on( " + x + ":" + y + ")" + "d " + d);
    }

    public void move(int newX, int newY) {
        d += calcd(newX, newY);

        this.x = newX;
        this.y = newY;

    }

    private double calcd(int newX, int newY) {
        return Math.sqrt(Math.pow(x - newX, 2) + Math.pow(y - newY, 2));
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", d=" + d +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public double getD() {
        return d;
    }
}
