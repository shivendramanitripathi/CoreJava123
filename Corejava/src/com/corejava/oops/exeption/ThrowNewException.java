package com.corejava.oops.exeption;

public class ThrowNewException {

    public static void main(String[] args) {
        try {
            ThrowNewException.arthmeticExceptionOccurence(0);
        } catch (ArithmeticException e) {
            System.out.println("Caught in main");
            e.printStackTrace();
        }


    }

    public static void arthmeticExceptionOccurence(int divideBy) {
        try {
            System.out.println(1000 / divideBy);
        } catch (ArithmeticException e) {
            System.out.println("Caught in arthmeticExceptionOccurence method");
            throw new ArithmeticException();
        }
    }
}
