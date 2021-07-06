package com.javalearning;

public class BreakContinueWithLabel {
    public static void main(String[] args) throws Throwable
    {
        BreakContinueWithLabel breakCont = new BreakContinueWithLabel();
        try {
            breakCont.method();
        }
        catch (Exception e) {
            /*System.out.println("Exception details without fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            e.printStackTrace();
            */
            System.out.println("Exception details with fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            e.fillInStackTrace();
            e.printStackTrace();
            
        }
    }

    // method calling divide operation
    public void method() throws Throwable
    {
        divide();
    }

    // divide operation throws ArithmeticException exception
    void divide()
    {

        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }
}