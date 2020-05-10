package by.belhard.j22.lessons.lesson06.collection;

import by.belhard.j22.lessons.lesson05.inheritanceExample.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("vitaliy",26));
        set.add(new Person("vitaliy",26));
        set.add(new Person("dsf",25));
        set.add(new Person("qwesdfdr",32));
        set.add(new Person("vitaliy",26));
        set.add(new Person("vitaliy",26));
        set.add(new Person("vitaliy",26));
        System.out.println(set);

        set = new TreeSet<>();




    }

}
