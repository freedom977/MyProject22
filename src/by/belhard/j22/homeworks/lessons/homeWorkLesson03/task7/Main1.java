package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task7;

public class Main1 {
    public static void main(String[] args) {


        Zdanie zdanie = new Zdanie(9, Lift.YES, "Belarus", new Adres("Lenina" , 8));

        System.out.println("Этажей в здании " + zdanie.getFloor() +
                " в котором " + zdanie.getLift() +
                " лифт " + " находящийся в " +
                zdanie.getCountry() + " по адресу " + zdanie.getAdres().getStreet() + " " + zdanie.getAdres().getNamberHause());

    }
}
