package by.belhard.j22.homeworks.lessons.homeWorkLesson04.task3;

import java.lang.ref.SoftReference;

public class Aftor {
    private String name;
    private int age;

    public Aftor(String name, int age) {
        if (name !=null && name.length() !=0){
        this.name = name;
        }else
            System.out.println("Имя не должно быть пустым! ");
        if (age > 2 ) {
            this.age = age;
        }else
            System.out.println("Возраст не правильный!");
    }


    @Override
    public String toString (){
        return name + " " + age + " лет";
    }

}
