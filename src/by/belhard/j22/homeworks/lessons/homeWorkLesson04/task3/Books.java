package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task3;

public class Books {
    private String name, genre;
    private int kol;
    private Aftor aftor;

    public Books(String name, String genre, int kol, Aftor aftor) {
        this.name = name;
        this.genre = genre;
        this.kol = kol;
        this.aftor = aftor;
    }

    public Aftor getAftor() {
        return aftor;
    }

    @Override
    public String toString (){
        return "Название кники " + name + " жанр " + genre +
                " в которой "+ kol + " страниц" + " афтор которйо является " + aftor.toString();
    }
}
