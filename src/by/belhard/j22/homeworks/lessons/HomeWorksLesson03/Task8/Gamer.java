package by.belhard.j22.homeworks.lessons.HomeWorksLesson03.Task8;

public class Gamer {
    private int x , y;

    public Gamer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void run () {

        System.out.println("I'm run tu" + "");

    }
    public int run1() {
        return x;

    }
    public int run2() {
        return y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
