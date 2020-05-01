package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task5;

public class Array {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }

            System.out.println();

            for (int j = 1; j <= 100; j++) {
                if (j % 5 == 0 ^ j % 7 == 0) {
                    System.out.print(j + " ");
                }

            }


        }

    }
}

