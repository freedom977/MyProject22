package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task2;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table(4,140,500,"Сосна", Type.CIRCLE);
        Table table2 = new Table(5,200,300,"ДСП", Type.OTHER);
        Table table3 = new Table(6,120,700,"Дуб", Type.SQUARE);

        System.out.println(table1.toString());
        System.out.println(table2.toString());
        System.out.println(table3.toString());
    }
}
