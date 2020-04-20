package by.belhard.j22.homeworks.lessons.HomeworkLesson02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру :");
        int a = in.nextInt();

        if (a <= 5) {
            System.out.println("Надень шапку");
        }else if (a<=10) {
            System.out.println("Сними шапку");
        }else
        System.out.println("Тепло, можешь и так идти");

    }
}
