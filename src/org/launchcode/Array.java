package org.launchcode;

import java.util.ArrayList;


public class Array {

    static ArrayList<Person> nam = new ArrayList<Person>();

    public Array() {

    }

    //Load the social network
    public static void loadArray() {

        nam.add(new Adult("Smith", "John", 23, "Working for IBM", "Image1", "Rachel and John", "Simon and John"));
        nam.add(new Adult("Evans", "Maggie", 35, "Studying at RMIT", "Image2"));
        nam.add(new Children("Danny", "Alan", 12));
        nam.add(new Children("Smith", "Mary", 5, "Working for IBM", "Image1", "Rachel and John"));
    }

    public void printArray() {
        for (int i = 0; i < nam.size(); i++) {
            System.out.println(nam.get(i));
            System.out.println();
        }

    }
}
