package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap year di ban oi !!!");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan");
                } else {
                    System.out.println(year + " day ko phai la nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan");
            }
        } else {
            System.out.println( year + "ko phai la nam nhuan");
        }

    }
}
