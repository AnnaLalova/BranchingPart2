package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Assignment1();
        Assignment2();
        Assignment3();
    }

    static void Assignment1() {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please enter day number from 1 (Monday) to 7 (Sunday).");
        }
        int dayNumber = input.nextInt();
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("This day is a working day.");
                break;
            case 6:
            case 7:
                System.out.println("This day is a holiday.");
                break;
            default:
                System.out.println("Please enter valid day number!");
                break;
        }
    }

    static void Assignment2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade from A to F.");

        char grade = scanner.next().charAt(0);

        {
            switch (grade) {
                case 'A':
                case 'B':
                    System.out.println("Perfect! You are so clever!");
                    break;
                case 'C':
                    System.out.println("Good! But You can do better!");
                case 'D':
                case 'E':
                    System.out.println("It is not good! You should study!");
                case 'F':
                    System.out.println("Fail! You need to repeat the exam!");
            }

        }

    }

    static void Assignment3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter variable one.");
        float var1 = input.nextFloat();
        System.out.println("Please enter variable two.");
        float var2 = input.nextFloat();
        System.out.println("Please choose the action:" +
                "a - sum both elements;" +
                "b - do subtraction;" +
                "c - do dividing;" +
                "d - do multiplication;" +
                "e - get reminder when the first element is divided by second element;" +
                "f - print out both elements;" +
                "g - verify which element is smaller;" +
                "h - verify which element is smaller.");
        char option = input.next().charAt(0);
        {
            switch (option) {
                case 'a':
                    System.out.println(var1 + var2);
                    break;
                case 'b':
                    System.out.println(var1 - var2);
                    break;
                case 'c':
                    System.out.println(var1 / var2);
                    break;
                case 'd':
                    System.out.println(var1 * var2);
                    break;
                case 'e':
                    System.out.println(var1 % var2);
                    break;
                case 'f':
                    System.out.println(var1 + " " + var2);
                case 'g':
                    if (var1 > var2) {
                        System.out.println(var2 + "is smaller than " + var1);
                    } else if (var1 < var2) {
                        System.out.println(var1 + "is smaller than " + var2);
                    } else
                        System.out.println(var1 + "and" + var2 + "are equal.");
                    break;
                case 'h':
                    if (var1 > var2) {
                        System.out.println(var1 + "is bigger than " + var2);
                    } else if (var1 < var2) {
                        System.out.println(var2 + "is bigger than " + var1);
                    } else {
                        System.out.println(var1 + "and" + var2 + "are equal.");
                    }
                    break;


            }
        }
    }
}


