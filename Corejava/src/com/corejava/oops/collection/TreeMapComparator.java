package com.corejava.oops.collection;

import java.util.Comparator;

public class TreeMapComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int i, j, k;
        String aStr, bStr;
        aStr = (String) o1;
        bStr = (String) o2;
// find index of beginning of last name
        i = aStr.lastIndexOf('~');
        j = bStr.lastIndexOf('~');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) // last names match, check entire name
            return aStr.compareTo(bStr);
        else
            return k;
    }
// no need to override equals
}