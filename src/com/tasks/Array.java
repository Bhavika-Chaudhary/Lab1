package com.tasks;

public class Array {
    public static void main() {
        int counter = 0;
        boolean Sort = true;
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int j = 0; j < array.length; j++) {
            Sort = false;
            counter++;
            if (array[j] > array[j + 1]) {
                counter++;
                int greater = array[j];
                array[j] = array[j+1];
                array[j + 1] = greater;
                Sort = true;
            }
            //System.out.println(Arrays.toString(array));
        }
    }
}
