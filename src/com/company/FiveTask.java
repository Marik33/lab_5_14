package com.company;

import  java.util.Scanner;

public class FiveTask {

    public static void main(String[] args) {

        String one, two;
        int oneLength, twoLength;

        Scanner sw = new Scanner(System.in);
        System.out.print("Введіть перше слово: ");
        if (sw.hasNextLine()) {
            one = sw.nextLine();
            oneLength = one.length();
            System.out.print("Введіть друге слово: ");
            if (sw.hasNextLine()) {
                two = sw.nextLine();
                twoLength = two.length();
                if (oneLength > twoLength) {
                    System.out.print("Перше слово більше за друге");
                } else if (oneLength < twoLength) {
                    System.out.print("Друге слово більше за перше");
                } else if (oneLength == twoLength) {
                    System.out.print("Обидва слова одинакові");
                } else {
                    System.out.print("Ви ввели не правильні дані .");
                }
            }
        }
    }
}