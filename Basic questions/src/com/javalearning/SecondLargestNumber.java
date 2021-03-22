package com.javalearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of integers : ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter value of " + n + " integers");
//        for(int i=0;i<n;i++){
//            arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr);
//        int max2 = arr[n-1];
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]<max2){
//                max2 = arr[i];
//                break;
//            }
//        }
 //       System.out.println("Second largest number is : " + max2);
//        int max = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of integers : ");
//        int n = scanner.nextInt();
//        System.out.println("Enter value of " + n + " integers");
//        for(int i=0;i<n;i++){
//            int a = scanner.nextInt();
//            if (a>max) {
//                max = a;
//            }
//        }
//        System.out.println("Second largest number is : " + max);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int j=0;
        while(n!=0){
            j++;
            n /= 10;
        }
        System.out.println(j);
    }
}
