package com.javalearning;

import java.util.Scanner;

public class SunOfNNumbers {
    public static void main(String[] args) {


//        SUM OF 1ST N INTEGERS
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = scanner.nextInt();
//        int sum = n*(n+1)/2;
//        System.out.println("Sum of 1st " + n + " natural numbers is "+sum );


//        SUM  OF N USER ENTERED INTEGERS;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        int sum = 0;
//        System.out.println("Enter values of "+ n + " integers");
//        for(int i=0;i<n;i++){
//            a[i] = scanner.nextInt();
//            sum+=a[i];
//        }
//        System.out.println("Sum of " + n + " natural numbers is "+sum );


//        N SPACE SEPaRATED NUMBERS
        Scanner scanner = new Scanner(System.in);
        String numbers ;
        System.out.println("Enter n  space separated numbers : ");
        numbers = scanner.nextLine();
        String[] a = numbers.split(" ");
        int sum = 0;
        for(int i = 0; i<a.length ; i++){
            sum += Integer.parseInt(a[i]);
        }
        System.out.println("Sum of " + a.length + " natural numbers is "+sum );

    }
}
