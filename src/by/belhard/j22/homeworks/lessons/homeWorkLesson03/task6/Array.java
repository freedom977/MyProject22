package by.belhard.j22.homeworks.lessons.homeWorkLesson03.task6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 16, 5, 6, 8, 9, 11, 15, 18};
        Arrays.sort(arr);
        int median;
        int sum = 0;
        double sred = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        sred = (double) sum / arr.length;
        System.out.println(sum);
        System.out.println(sred);
       /* if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        } else {
            median = arr[arr.length / 2];
        }*/
        median = (arr.length % 2 == 0) ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 :
                arr[arr.length / 2];

        System.out.println(median);
    }


}
