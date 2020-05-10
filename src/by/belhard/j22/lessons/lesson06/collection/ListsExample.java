package by.belhard.j22.lessons.lesson06.collection;

import by.belhard.j22.lessons.lesson05.inheritanceExample.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListsExample extends IntegerComarator {
    public static void main(String[] args) {
        List<Person> exampleList = new  ArrayList<>();
        exampleList.add(new Person("dfsdsf",25));

        System.out.println(exampleList.size());

        Person p = exampleList.get(0);

        exampleList.add(0, new Person( "sdfs",25));
        System.out.println(exampleList);

        exampleList.set(0, new Person("dsfws",27));
        System.out.println(exampleList);

        exampleList.contains(exampleList.contains(new Person("sdfs", 25)));
        System.out.println(exampleList.contains(p));


        for(Person p1 :exampleList)
            System.out.println(p1);

        Iterator<Person> iterator = exampleList.iterator();

       /* while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
            iterator.remove();
        }*/

        System.out.println(exampleList);
        System.out.println();
     List<Integer> list = Arrays.asList(5,3,11,-2,5,10);
        System.out.println(list);

        list.sort(new IntegerComarator());
        System.out.println(list);

        exampleList.add(new Person("Person1",34));
        exampleList.add(new Person("Person2",36));
        exampleList.add(new Person("Person3",18));

        System.out.println();
        System.out.println(exampleList);


    }


}
