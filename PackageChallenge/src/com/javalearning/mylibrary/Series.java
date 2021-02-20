package com.javalearning.mylibrary;

public class Series {

    public static int nSum(int n) {
        int result = 0;
        for(int i=n ; i>=0 ; i--) {
            result += i;
        }
        return result;
    }

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        else
            return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
