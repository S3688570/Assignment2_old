package org.launchcode;

import java.util.Scanner;

public class SearchProfiles extends Array{
    Scanner input = new Scanner(System.in);
    Array array = new Array();

    public SearchProfiles() {
    }

    //Method to select person's profile
    public void searchName() {
        System.out.println("Enter person's name: ");
        String searchPersonName = input.next();

        while (!searchPersonName.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            searchPersonName = input.next();
        }

        //Print profile for selected person
        for (int i=0; i<nam.size(); i++) {
            if (searchPersonName.equalsIgnoreCase(nam.get(i).getName()))
                System.out.println(nam.get(i));
            System.out.println();
        }
    }
}
