package com.javalearning;

public class Main {

    public static void main(String[] args) {
	double x=20.00d;
	double y=80.00d;
	double z=(x+y)*100.00d;
	System.out.println("z = "+z);
	double rem=z%40.00d;
	System.out.println("Remainder is = "+rem);
	boolean con=(rem==0) ? true : false;
	System.out.println("compare = " + con);
	if(!con) {
        System.out.println("Got some remainder");
    }


    }
}
