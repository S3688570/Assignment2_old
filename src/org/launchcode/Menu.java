package org.launchcode;

import java.util.Scanner;

public class Menu {

    //Construct a default constructor
    public Menu() {

    }

    //Method to display menu and take input
    public void displayMenu() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Add a person to the network");
            System.out.println("2. Select a person and display their profile by name");
            System.out.println("3. Output all profiles");
            System.out.println("4. Connect two people as friends");
            System.out.println("5. Are two people friends?");
            System.out.println("6. Find out the name(s) of a person's child(ren)");
            System.out.println("7. Find out the names of a persons parents");
            System.out.println("8. Exit");

        }
        while (input.nextInt() != 1 && input.nextInt() != 2 && input.nextInt() != 3 && input.nextInt() != 4 && input.nextInt() != 5 && input.nextInt() != 6 && input.nextInt() != 7 && input.nextInt() != 8);

        int option = input.nextInt();
        int i = 0;

        switch (option) {
            //Add a person to the network
            case 1:
                AddProfiles array = new AddProfiles();
                array.addProfile();
                break;

            //Select a person by name and print profile
            case 2:
                System.out.println("test");
                break;

            //Output all profiles
            case 3:
                System.out.println("test");
                break;
            case 4:
                System.out.println("test");
                break;
            case 5:
                System.out.println("test");
                break;
            case 6:
                System.out.println("test");
                break;
            case 7:
                System.out.println("test");
                break;
            case 8:
                System.out.println("test");
                break;
            default:
                System.out.println("Error: invalid status");
        }
    }
}




