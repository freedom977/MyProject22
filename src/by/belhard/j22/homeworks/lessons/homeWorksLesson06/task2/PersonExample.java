package by.belhard.j22.homeworks.lessons.homeWorksLesson06.task2;

import java.util.ArrayList;
import java.util.List;


public class PersonExample {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Vasiliy"));
        person.add(new Person ("Vasiliy1"));
        person.add(new Person("Vasiliy2"));
        person.add(new Person("Vasiliy4"));
        person.add(new Person("Vasiliy3"));

        for (Person n : person){
            System.out.println(n);
        }



    }


}
