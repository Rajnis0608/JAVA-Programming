package com.javalearning;


import static com.javalearning.mylibrary.Series.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0 ; i <= 10 ; i++){
            System.out.println(nSum(i));
        }

        System.out.println("* * * * * * * * * * * * * * * ");

        for(int i=0 ; i <= 10 ; i++){
            System.out.println(factorial(i));
        }

        System.out.println("* * * * * * * * * * * * * * * ");

        for(int i=0 ; i <= 10 ; i++){
            System.out.println(fibonacci(i));
        }


    }
}
