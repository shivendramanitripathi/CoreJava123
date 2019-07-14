package com.corejava.oops.staticpolymorphism;

public class ScientificCalculator extends Calculator {


    /**
     * Example to prove that static method overriding is not possible
     */
/*    public int addition(int a, int b){
        retutn a+b;
    }*/

    /**
     * Example to prove that final method overriding is not possible
     */
/*    public final int multiplication(int a, int b){
        return a*b;
    }*/


    /**
     * Example to prove that private method overriding is not possible
     */
/*    @Override
    private int substraction(int a, int b){
        return a-b;
    }*/

    @Override
    public int division(int a, int b){
        System.out.println("Inside ScientificCalculator class");
        return a/b;
    }


}