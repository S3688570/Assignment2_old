package org.launchcode;

import java.util.Scanner;

public class FindParents extends Children {

    Scanner input = new Scanner(System.in);

    //List variables
    private String children;

    public FindParents() {
    }

    public void findParents() {
        //Enter a child's name
        System.out.println("Please enter the name of the child");
        children = input.nextLine();
        while (!children.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            children = input.nextLine();
        }

        for (int i = 0; i < nam.size(); i++) {
            if (children.equalsIgnoreCase(nam.get(i).getName())) {
                System.out.println(nam.get(i).getParents());
                System.out.println();
                break;
            }
        }
        System.out.println("That name is not in the database.");
        System.out.println();
    }
}
