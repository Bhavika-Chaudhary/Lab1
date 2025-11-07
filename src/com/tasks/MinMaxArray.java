package com.tasks;

import java.util.Random;

public class MinMaxArray {
    public static void main() {
        int[] num = new int[10];
        Random r1 = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = r1.nextInt(100) + 1;
            System.out.println("Element[" + i + "]: " + num[i]);
        }

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}
