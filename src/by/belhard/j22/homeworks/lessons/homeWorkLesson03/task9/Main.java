package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task9;

public class Main {
    public static void main(String[] args) {
        Washer washer = new Washer( Type.HLOPOK, 45, 30);
        System.out.println("Тип одежды " + washer.getType() + " стирка займет по времени " +  washer.time() + "min " + " при температуре " + washer.temp() + "C" );
        washer.pow("Taid");
        washer.wash();

    }
}
