package com.corejava.oops.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetComparator {

    public static void main(String[] args) {
        // Create a tree set
        TreeSet ts = new TreeSet(new TreeSetComparator());
// Add elements to the tree set
        ts.add("CA");
        ts.add("AA");
        ts.add("AB");
        ts.add("AD");
        ts.add("CB");
        ts.add("DD");


// Get an iterator
        Iterator i = ts.iterator();
// Display elements
        while(i.hasNext()) {
            Object element = i.next();
            System.out.print(element + " ");
        }
        System.out.println();


    }
}