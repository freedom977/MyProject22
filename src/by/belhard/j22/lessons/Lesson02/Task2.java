package by.belhard.j22.lessons.Lesson02;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        if (a <= 5) {
            System.out.println("верно");
            a *= 2;
            System.out.println("a twice" + a);
        } else if (a <=10) {
            System.out.println("не верно");
        }else {
            System.out.println("end of program");
        }

    }
}
