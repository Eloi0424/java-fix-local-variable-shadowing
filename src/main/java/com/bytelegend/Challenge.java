package com.bytelegend;

public class Challenge {
    public static int sum = 0;

    public static void main(String[] args) {
        addAverageOf(1, 3);
        System.out.println("addAverageOf(1,3): " + sum);
        addAverageOf(2, 6);
        System.out.println("addAverageOf(2,6): " + sum);
        addAverageOf(3, 5);
        System.out.println("addAverageOf(3,5): " + sum);
    }

    public static void addAverageOf(int a, int b) {
        int total = a + b;
        int average = total / 2;
        Challenge.sum = total + average;
    }
}
