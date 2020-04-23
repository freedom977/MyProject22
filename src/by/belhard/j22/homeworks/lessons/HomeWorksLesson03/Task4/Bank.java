package by.belhard.j22.homeworks.lessons.HomeWorksLesson03.Task4;

public class Bank {
    public static void main(String[] args) {
        double startSum = 100, years = 10;
        double proc = 12, sum1, sum2;
        sum1 = startSum * (1 + (proc / 100 )* 1);
        sum2 = Math.pow(sum1, years);
        System.out.println(sum2);

    }
}
