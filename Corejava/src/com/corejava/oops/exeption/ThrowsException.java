package com.corejava.oops.exeption;
public class ThrowsException {

    public static void main(String[] args) {
        try {
            ThrowsException.arthmeticExceptionOccurence(0);
        }catch(ArithmeticException e){
            System.out.println("Caught in main");
            e.printStackTrace();
        }


    }

    public static void arthmeticExceptionOccurence(int divideBy) throws ArithmeticException{
        System.out.println(1000/divideBy);
    }
}
