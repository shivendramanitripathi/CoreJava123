package com.corejava.oops.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]) {

// Create a tree map
        Map tm = new TreeMap<String, Double>();

// Put elements to the map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Todd Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

// Get a set of the entries
        Set set = tm.entrySet();

// Get an iterator
        Iterator i = set.iterator();

// Display elements
        System.out.println("Before adding balance");
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }



// Deposit 1000 into John Doe's account
        double balance = (double)(tm.get("John Doe"));
        tm.put("John Doe", balance + 1000);
        System.out.println("\n\nAfter adding balance");
        System.out.println("John Doe's new balance: " +
                tm.get("John Doe"));
    }

}