package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task8;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer("Vasya", 0,  0 );
        gamer.printInfo();
        gamer.move(3,4);
        gamer.printInfo();
        gamer.move(-3,-4);
        gamer.printInfo();

    }
}
