package com.corejava.oops.collection;

import java.util.LinkedList;


public class LinkedListExample2 {

    public static void main(String args[]) {
// create a linked list
        LinkedList<Integer> ll = new LinkedList<Integer>();
// add elements to the linked list
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println("Original contents of ll: " + ll);
// remove elements from the linked list
        ll.remove(new Integer(2));//removes actual element with value 2
        ll.remove(2);//removes content at index position 2
        System.out.println("Contents of ll after deletion: "
                + ll);

    }

}
