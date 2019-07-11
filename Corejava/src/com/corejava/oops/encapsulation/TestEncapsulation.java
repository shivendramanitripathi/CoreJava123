package com.corejava.oops.encapsulation;



public class TestEncapsulation {
    public static void main(String[] args) {
        TestEncapsulation testEncapsulation = new TestEncapsulation();
        AndriodPhone samsungGalaxyA10 = testEncapsulation.populateAndriodPhoneObject();

        //System.out.println(samsungGalaxyA10.toString());//does not print any object contents outside and only way of access using getter methods.
        System.out.println("Brand = "+samsungGalaxyA10.getBrand());
        System.out.println("Height = "+samsungGalaxyA10.getHeight());
        System.out.println("Width = "+samsungGalaxyA10.getWidth());
        System.out.println("Price = "+samsungGalaxyA10.getPrice());
        System.out.println("OS = "+samsungGalaxyA10.getOS());
    }

    /*
    Prepare object of Andriod phone
     */
    public AndriodPhone  populateAndriodPhoneObject(){
        AndriodPhone myPhone =  new AndriodPhone();
        myPhone.setBrand("Samsung");
        myPhone.setHeight(5.5f);
        myPhone.setOS("Andriod");
        myPhone.setPrice(10000.0f);
        myPhone.setWidth(3.0f);

        System.out.println("samsungGalaxyA10 object is created and it's properties are \n"+myPhone.toString());
        return myPhone;
    }

    }
