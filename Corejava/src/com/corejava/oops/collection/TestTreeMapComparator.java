package com.corejava.oops.collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMapComparator {

    public static void main(String[] args) {

        // Create a tree map
        TreeMap tm = new TreeMap(new TreeMapComparator());

// Put elements to the map
        tm.put("John~Doe", 3434.34);
        tm.put("Tom~Smith", 123.22);
        tm.put("Jane~Baker", 1378.00);
        tm.put("Todd~Hall", 99.22);
        tm.put("Ralph~Smith", -19.08);

// Get a set of the entries
        Set set = tm.entrySet();

// Get an iterator
        Iterator itr = set.iterator();

// Display elements
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry)itr.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

// Deposit 1000 into John Doe's account
        double balance = ((Double)tm.get("John~Doe")).doubleValue();
        tm.put("John~Doe", new Double(balance + 1000));
        System.out.println("John Doe's new balance: " +
                tm.get("John~Doe"));



    }
}