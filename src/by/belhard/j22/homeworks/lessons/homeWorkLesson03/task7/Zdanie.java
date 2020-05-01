package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task7;

public class Zdanie {

    private int floor;
    private Lift lift;
    private String country;
    private Adres adres;




    public Zdanie (int floor, Lift lift, String country, Adres adres) {
        this.floor = floor;
        this.lift = lift;
        this.country = country;
        this.adres = adres;


    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }
    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
