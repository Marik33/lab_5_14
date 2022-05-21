package com.company;

import  java.util.Scanner;

public class ThreeTask {

    public static void main(String[] args) {

        int a, b, c;

        Scanner sw1 = new Scanner(System.in);
        System.out.print("Введіть першу цифру : ");
        if (sw1.hasNextInt()) {
            a = sw1.nextInt();
            System.out.print("Введіть другу др цифру: ");
            if (sw1.hasNextInt()) {
                b = sw1.nextInt();
                System.out.print("Введіть третю др цифру: ");
                if (sw1.hasNextDouble()) {
                    c = sw1.nextInt();
                    if (a > b && a > c) {
                        System.out.println("max: " + a);
                    } else if (b > a && b > c) {
                        System.out.println("max: " + b);
                    } else if (c > a && c > b) {
                        System.out.println("max: " + c);
                    } else if (a == b && a > c) {
                        System.out.println("max: " + a);
                    } else if (a == c && a > b) {
                        System.out.println("max: " + a);
                    } else if (c == b && c > a) {
                        System.out.println("max: " + c);
                    } else if (a == b && b == c && a == c) {
                        System.out.println("max: " + a);
                    } else {
                        System.out.println("Ви ввели не правильне число!");
                    }
                } else {
                    System.out.println("Ви ввели не правильне число!");
                }
            } else {
                System.out.println("Ви ввели не правильне число!");
            }
        } else {
            System.out.println("Ви ввели не правильне число!");
        }
    }
}

