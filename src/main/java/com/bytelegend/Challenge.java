package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): ");
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): ");
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): ");
    }

    public static void addAverageOf(int a, int b) {
        int sum1 = a + b;
        int average = sum1 / 2;
        sum = sum + average;
    }
}
