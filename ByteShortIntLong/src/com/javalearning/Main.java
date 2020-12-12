package com.javalearning;

public class Main {

    public static void main(String[] args) {
        
	    int minIntValue = Integer.MIN_VALUE;
	    int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum value for int is : " + minIntValue);
        System.out.println("Maximum value for int is : " + maxIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum value for byte is : " + minByteValue);
        System.out.println("Maximum value for byte is : " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum value for Short is : " + minShortValue);
        System.out.println("Maximum value for Short is : " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum value for Long is : " + minLongValue);
        System.out.println("Maximum value for Long is : " + maxLongValue);

        int newIntValue=minIntValue/2;
        byte newByteValue=(byte)(minByteValue/2);
        short newShortValue=(short)(minShortValue);
        long newLongValue=(minLongValue/2);
        System.out.println(newIntValue);
        System.out.println(newByteValue);
        System.out.println(newLongValue);

        int x=5628631;
        short y=20456;
        byte z= 123;
        long sum = 50000L + 10L*(x+y+z);
        System.out.println(sum);

    }
}
