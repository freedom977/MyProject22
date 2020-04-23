package by.belhard.j22.homeworks.lessons.HomeWorksLesson03.Task3;

public class salary {
    public static void main(String[] args) {
        int salary1 = 10, salary2 = 20, salary3 = 40;
       int a = Math.max(salary1, Math.max(salary2,salary3));
       int b = Math.min(salary1, Math.min(salary2,salary3));
        System.out.println(a-b);
    }
}
