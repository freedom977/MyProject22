package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task9;

public class Washer {
    private String powder;
    private Type type;
    private int temp;
    private int time;

    public Washer( Type type, int temp, int time) {

        this.type = type;
        this.temp = temp;
        this.time = time;
    }

    public void pow (String powder) {
        System.out.println("Беру порошок " + powder);
    }
    public void wash (){
        System.out.println("Стираю");
    }
    public int temp (){
        return temp;
    }
    public int time () {
        return time;
    }

    public Type getType() {
        return type;
    }
}
