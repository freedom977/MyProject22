package by.belhard.j22.lessons.lesson06.collection;

import java.util.Comparator;

public class IntegerComarator implements Comparator<Integer> {
    @Override
    public int compare(Integer o, Integer o1) {
        return 0 - o1;
    }
}
