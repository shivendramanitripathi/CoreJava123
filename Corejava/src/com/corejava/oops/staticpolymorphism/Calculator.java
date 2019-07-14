package com.corejava.oops.staticpolymorphism;

public class Calculator {


    /*
    Static methods
     */
    public static int addition(int a , int b){
        return a+b;
    }

    public static int addition(int a , int b, int c){
        return a+b+c;
    }

    public static int addition(int a , int b, int c, int d){
        return a+b+c+d;
    }


    /*
    final methods
     */
    public final int multiplication(int a, int b){
        return a*b;
    }

    public final int multiplication(int a, int b, int c){
        return a*b*c;
    }

    public final int multiplication(int a, int b,int c, int d){
        return a*b*c*d;
    }


    /*
    private methods
    */
    private int substraction(int a, int b){
        return a-b;
    }

    private int substraction(int a, int b, int c){
        return a-b-c;
    }

    private int substraction(int a, int b,int c, int d){
        return a-b-c-d;
    }


    /*
    normal public method
     */
    public int division(int a, int b){
        System.out.println("Inside Calculator class");
        return a/b;
    }
}