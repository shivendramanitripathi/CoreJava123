package com.corejava.oops.dynamicpolymorphism;

public class TestDynamicPolymorphism {

    public static void main(String[] args) {

        IosPhone iPhone5s = new IPhone5s();
        System.out.println("-------------------buying iPhone5s ");
        iPhone5s.buyIPhone();

        IosPhone iPhone6s = new IPhone6s();
        System.out.println("\n\n-------------------buying iPhone6s ");
        iPhone6s.buyIPhone();

        IosPhone iPhone7Plus = new IPhone7s();
        System.out.println("\n\n-------------------buying iPhone7Plus ");
        iPhone7Plus.buyIPhone();
    }
}


