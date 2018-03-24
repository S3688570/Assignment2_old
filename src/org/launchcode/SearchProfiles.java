package org.launchcode;

import java.util.Scanner;

public class SearchProfiles extends Array{
    Scanner input = new Scanner(System.in);

    public SearchProfiles() {

    }

    public void searchName() {
        System.out.println("Enter person's last name: ");
        String searchLastName = input.next();

        while (!searchLastName.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            searchLastName = input.next();
        }
        for (int i=0; i<nam.size(); i++) {
            if (searchLastName.equalsIgnoreCase(nam.get(i).getLastName()))
                System.out.println(nam.get(i));
            System.out.println();
        }

    }
}
