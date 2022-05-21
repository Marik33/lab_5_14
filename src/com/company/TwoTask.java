package com.company;

import  java.util.Scanner;

public class TwoTask {

    public static void main(String[] args) {

        String a, b, c, d, i;
        String mid1, mid2, mid3, mid4, mid5;
        String s = "|"; // space

        System.out.print("Для виконання завдання введіть 5 слів.");
        System.out.println();
        Scanner sw1 = new Scanner(System.in);
        System.out.print("Введіть перше слово: ");
        if (sw1.hasNextLine()) {
            a = sw1.nextLine();
            mid1 = a.substring(0, 1) + s;
            System.out.print("Введіть друге слово: ");
            if (sw1.hasNextLine()) {
                b = sw1.nextLine();
                mid2 = b.substring(0, 1) + s;
                System.out.print("Введіть третє слово: ");
                if (sw1.hasNextLine()) {
                    c = sw1.nextLine();
                    mid3 = c.substring(0, 1) + s;
                    System.out.print("Введіть четверте слово: ");
                    if (sw1.hasNextLine()) {
                        d = sw1.nextLine();
                        mid4 = d.substring(0, 1) + s;
                        System.out.print("Введіть пяте слово: ");
                        if (sw1.hasNextLine()) {
                            i = sw1.nextLine();
                            mid5 = i.substring(0, 1) + s;
                            System.out.print("Перші симводи слів: ");
                            System.out.print(mid1.concat(mid2).concat(mid3).concat(mid4).concat(mid5));
                        }
                    }
                }
            }
        }
    }
}