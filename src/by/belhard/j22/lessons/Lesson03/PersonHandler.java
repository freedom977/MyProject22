package by.belhard.j22.lessons.Lesson03;

import by.belhard.j22.lessons.Lesson03.personExample.Country;
import by.belhard.j22.lessons.Lesson03.personExample.Person;
import by.belhard.j22.lessons.Lesson03.personExample.Sex;

public class PersonHandler {

    public static void main(String[] args) {

        Person person1 = new Person("Vasiliy", 30, new Country("Belarus", 225558), Sex.MALE);

        /*person1.setName ("Vasiliy");
        person1.age = 30;
        person1.country = new Country();
        person1.sex = Sex.MALE;
        person1.country.title = "Belarus";
        person1.country.zipCode = 225558;*/
        //System.out.println(person1.name + ":" + person1.age +  "let");
        //System.out.println(person1.country.title);
        System.out.println();
     //   Person person2 = new Person();
        Person person2 = new Person("Olya", 20, new Country("Belarus", 225558), Sex.FEMALE);
       /* person2.name = "Olga";
        person2.age = 20;
        person2.country = person1.country;
        person1.sex = Sex.FEMALE;
        System.out.println(person2.name + ":" + person2.age + "let");
        System.out.println(person2.country.title);*/

        person1.walk();
        person1.eat("bread");
        System.out.println(person1.growOld());
        int newAge = person1.growOld();
        System.out.println(newAge);


    }
}
