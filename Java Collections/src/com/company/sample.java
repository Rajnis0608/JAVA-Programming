package com.company;

import java.util.Scanner;

public class sample {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            sc.nextLine();
            String A = sc.nextLine();
            String B = sc.nextLine();
            int ans = 0;
            for(int j=N-1;j>=0;j--){
                if(Character.compare(A.charAt(j),B.charAt(j)) <= 0){
                    ans++;
                }
                else{
                    break;
                }
            }
            System.out.println(ans);
        }

    }
}
