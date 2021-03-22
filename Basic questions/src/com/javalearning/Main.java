package com.javalearning;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121211));
    }
    public static boolean isPalindrome(int x){
        int str = x;
        int temp = 0;
        while(x!=0){
            temp = temp*10+x%10;
            x/=10;
        }
        if(temp == str){
            return true;
        }
        return false;
    }
}
