package com.company;

import  java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        String a, b, c, d, i;
        String mid1, mid2, mid3, mid4;
        String space = " ";

        System.out.print("Для виконання завдання введіть 5 слів.");
        System.out.println();
        Scanner sw1 = new Scanner(System.in);
        System.out.print("Введіть перше слово: ");
        if (sw1.hasNextLine()) {
            a = sw1.nextLine().concat(space);
            System.out.print("Введіть друге слово: ");
            if (sw1.hasNextLine()) {
                b = sw1.nextLine().concat(space);
                mid1 = a.concat(b);
                System.out.print("Введіть третє слово: ");
                if (sw1.hasNextLine()) {
                    c = sw1.nextLine().concat(space);
                    mid2 = mid1.concat(c);
                    System.out.print("Введіть четверте слово: ");
                    if (sw1.hasNextLine()) {
                        d = sw1.nextLine().concat(space);
                        mid3 = mid2.concat(d);
                        System.out.print("Введіть пяте слово: ");
                        if (sw1.hasNextLine()) {
                            i = sw1.nextLine().concat(".");
                            mid4 = mid3.concat(i);
                            System.out.print(mid4);
                        }
                    }
                }
            }
        }
    }
}