package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task1;

public class Table {
    public static void main(String[] args) {
        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int q : p) {
            for (int w : p) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
    }

