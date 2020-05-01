package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task4;

public class Bank {
    public static void main(String[] args) {
        long startSum = 100, years = 10;
        double proc = 12;
        for (int i = 0; i < years; i++) {
            startSum = (int) (startSum * (proc / 100) + startSum);
            System.out.println(startSum);
        }


    }
}
