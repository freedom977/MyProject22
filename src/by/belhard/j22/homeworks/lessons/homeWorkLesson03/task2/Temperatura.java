package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task2;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру :");
        int a = in.nextInt();

        if (a < 10) {
            System.out.println("Надень куртку");
        }else if (a <= 15) {
            System.out.println("Надень ветровку");
        }else if (a <= 20) {
            System.out.println("Надень свитер");
        }else if (a <= 30) {
            System.out.println("Надень майку");
        } else
        {
            System.out.println("ничего");
        }
    }
}
