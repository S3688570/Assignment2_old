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
            System.out.println("3. Connect two people as friends");
            System.out.println("4. Are two people friends?");
            System.out.println("5. Find out the name(s) of a person's child(ren)");
            System.out.println("6. Find out the names of a persons parents");
            System.out.println("7. Exit");

        }
        while (input.nextInt() != 1 && input.nextInt() != 2 && input.nextInt() != 3 && input.nextInt() != 4 && input.nextInt() != 5 && input.nextInt() != 6 && input.nextInt() != 7 && input.nextInt() != 8);

        int option = input.nextInt();
        int i = 0;

        switch (option) {
            //Add a person to the network
            case 1:
                String newPerson;
                System.out.println("Is this an adult or child: ");
                newPerson = input.next();
                i++;

                System.out.println("What is the person's lastName: ");
                String newLastName = input.next();
                i++;

                System.out.println("What is the person's firstName: ");
                String newFirstName = input.next();
                i++;

                System.out.println("What is the person's age: ");
                int newAge = input.nextInt();
                i++;

                System.out.println("What is the person's status: ");
                String newStatus = input.next();
                i++;

                System.out.println("Is there an image: ");
                String newImage = input.next();
                i++;

                System.out.println("What are the first names of this person's friends: ");
                String newFriends = input.next();
                i++;

                System.out.println("What are the first names of this person's children: ");
                String newChildren = input.next();
                i++;

            /*        Person nam = new Person();

                if (newPerson == "adult") {
                    nam.add(new Adult(newLastName, newFirstName, newAge, newStatus, newImage, newFriends, newChildren));
                }
                else
                    nam.add(new Children(newLastName, newFirstName, newAge, newStatus, newImage, newFriends));
*/
                break;

            case 2:
                //Select a person by name
                System.out.println("test");
                break;
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




