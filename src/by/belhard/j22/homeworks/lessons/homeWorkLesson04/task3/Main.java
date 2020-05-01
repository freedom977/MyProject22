package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task3;

public class Main {
    public static void main(String[] args) {
        Aftor aftor1 = new Aftor("Иванов", 56);
        Books books1 = new Books("Азбука", "Образование", 60, aftor1 );

        System.out.println(books1.toString());
    }
}
