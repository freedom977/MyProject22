package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task1;

public class Circle {
    public static void main(String[] args) {
        int r = 5;
        float pi = 3.1415f, s, d;
        if (r > 0) {
            s = r * r * pi;
            d = 2 * pi * r;
            System.out.println("Площадь круга ровна :" + s);
            System.out.println("Длина окружности ровна :" + d);
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
