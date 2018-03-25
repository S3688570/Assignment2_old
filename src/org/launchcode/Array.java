package org.launchcode;

import java.util.ArrayList;


public class Array {

    static ArrayList<Person> nam = new ArrayList<Person>();

    public Array() {
    }

    //Load the social network
    public static void loadArray() {

        nam.add(new Adult("John Heron", 12, "Working for IBM", "Image1", "Maggie Evans", "Simon and John"));
        nam.add(new Adult("Maggie Evans", 35, "Studying at RMIT", "Image2", "John Heron", "Bre"));
        nam.add(new Children("Alan Danny", 2));
        nam.add(new Children("Mary Smith", 5, "Playing", "Image1"));
        nam.add(new Children("Tom Thomas", 4, "Working for IBM", "Image10", "John Heron", "John Heron", "Alan Danny"));
    }

    public void printArray() {
        for (int i = 0; i < nam.size(); i++) {
            System.out.println(nam.get(i));
            System.out.println();
        }
    }
}
