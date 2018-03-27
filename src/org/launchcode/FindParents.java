package org.launchcode;

import java.util.Scanner;

public class FindParents extends Children {
    //Created by Charles Galea (March 2018)

    Scanner input = new Scanner(System.in);

    //List variables
    private String children;
    private String parents = "None";

    //Default FindParents object
    public FindParents() {
    }

    //Method to retrieve a child's parent's names from the database
    public void findParents() {
        //Enter a child's name
        System.out.println("Please enter the name of the child");
        children = input.nextLine();
        while (!children.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            children = input.nextLine();
        }

        //Are the person's parents recorded in the database
        for (int i = 0; i < nam.size(); i++) {
            if (children.equalsIgnoreCase(nam.get(i).getName())) {
                if (nam.get(i).getParents() == null) {
                    parents = "No";
                    System.out.println("That person's parents are not recorded in the database.");
                    System.out.println();
                    break;
                }
            }
        }

        //Retrieve child(ren)'s names for person in database
        for (int i = 0; i < nam.size(); i++) {
            if (children.equalsIgnoreCase(nam.get(i).getName())) {
                if ((nam.get(i).getParents()) != null) {
                    parents = nam.get(i).getParents();
                    System.out.println(parents + " are the parents of " + children);
                    System.out.println();
                    break;
                }
            }
        }

        //Child is not in database
        if (parents.equals("None")) {
            System.out.println("That person is not in the database.");
            System.out.println();
        }
    }
}
