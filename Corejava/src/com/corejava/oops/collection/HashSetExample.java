package com.corejava.oops.collection;

import java.util.HashSet;
import java.util.Set;

/*
Hashset does not maintain insertion order instead maintains its own default sorted order.
 */
public class HashSetExample {

    public static void main(String args[]) {
        boolean status = false;
// create a hash set
        Set hs = new HashSet();
// add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add(1);
        hs.add(2);
        status = hs.add("F");
        if(status == false){
            System.out.println("Addition of F failed");
        }else{
            System.out.println("Addition of F succeeded");
        }
        System.out.println(hs);

        //try adding duplicates
        status = hs.add("F");
        if(status == false){
            System.out.println("Addition of F failed");
        }else{
            System.out.println("Addition of F succeeded");
        }
        System.out.println(hs);
    }

}