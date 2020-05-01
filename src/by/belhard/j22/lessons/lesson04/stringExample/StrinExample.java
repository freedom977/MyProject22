package by.belhard.j22.lessons.lesson04.stringExample;

import by.belhard.j22.homeworks.lessons.homeWorkLesson03.task8.Gamer;

public class StrinExample {
    public static void main(String[] args) {
        int i =100;
        System.out.println(i); //приведется к строке"100"
        Gamer player = new Gamer("vasya", 3,4);
        player.move(11,2);
        System.out.println(player);

        System.out.println(player.getName() +" " + player.getD() + " " + player.getX()+ " " + player.getY());

        System.out.printf("%-10s - %.2f - (%d:%d)" , player.getName(),player.getD(), player.getX(), player.getY());
    }
}
