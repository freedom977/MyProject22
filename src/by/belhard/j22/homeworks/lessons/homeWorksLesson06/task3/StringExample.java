package by.belhard.j22.homeworks.lessons.homeWorksLesson06.task3;

import java.util.Arrays;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"aaa", "zzz","ddd", "ggg","bbb"});
        list.sort(String::compareTo);
        System.out.println(list);

    }
}
