package com.programmr.java;

import java.util.Scanner;

/**
 * Created by shkk on 8/2/2016.
 */
public class ComputeAverage {

    public static void main(String[] args) {

        double testScore1;
        double testScore2;
        double testScore3;
        double average;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        testScore1 = keyboard.nextDouble();

        System.out.println("Enter Number 2:");
        testScore2 = keyboard.nextDouble();

        System.out.println("Enter Number 3:");
        testScore3 = keyboard.nextDouble();

        average = (testScore1 + testScore2 + testScore3) / 3.0;

        System.out.println("Average of three numbers : " + average);
    }
}
