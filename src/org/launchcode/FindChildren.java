package org.launchcode;

import java.util.Scanner;

public class FindChildren extends Adult {

    Scanner input = new Scanner(System.in);

    //List variables
    private String parent;

    public FindChildren() {
    }

    public void findChild() {
        //Enter parent's name
        System.out.println("Please enter the name of the parent");
        parent = input.nextLine();
        while (!parent.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            parent = input.nextLine();
        }

        for (int i = 0; i < nam.size(); i++) {
            if (parent.equalsIgnoreCase(nam.get(i).getName())) {
                System.out.println(nam.get(i).getChildren());
                System.out.println();
            }
        }
    }
}
