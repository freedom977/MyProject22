package by.belhard.j22.homeworks.lessons.HomeWorksLesson03.Task5;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }




        }

    }
}
