package com.company;

import  java.util.Scanner;

public class FourTask {

    public static void main(String[] args) {

        String one, two;
        Scanner sw1 = new Scanner(System.in);

        System.out.print("Введіть пароль: ");
        if (sw1.hasNextLine()) {
            one = sw1.nextLine();
            System.out.print("Повторіть пароль: ");
            if (sw1.hasNextLine()) {
                two = sw1.nextLine();
                if (one.equalsIgnoreCase(two)) {
                    System.out.print("Вхід успішний !");
                } else {
                    System.out.print("Ви ввели не правильні дані .");
                }
            } else {
                System.out.print("Ви ввели не правильні дані .");
            }
        } else {
            System.out.print("Ви ввели не правильні дані .");
        }
    }
}