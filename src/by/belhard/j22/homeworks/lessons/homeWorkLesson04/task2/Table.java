package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task2;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;

public class Table {
    private int kol, visota, cena;
    private String material;
    private Type type;

    public Table(int kol, int visota, int cena, String material, Type type) {
        this.kol = kol;
        this.visota = visota;
        this.cena = cena;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return  "Колличество ножек в столе " + kol + " высота которого составляет " + visota +
                " стоимостью " + cena + " из материала " + material +
                " " + type + " формы";


    }

}
