package by.belhard.j22.homeworks.lessons.HomeWorksLesson03.Task7;

public class Adres {
    private String street;
    private int namberHause;

    public Adres (String street, int namberHause) {
        this.street = street;
        this.namberHause = namberHause;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNamberHause() {
        return namberHause;
    }

    public void setNamberHause(int namberHause) {
        this.namberHause = namberHause;
    }
}

