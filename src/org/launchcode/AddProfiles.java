package org.launchcode;

import java.util.Scanner;

public class AddProfiles extends Array {

    //Construct default AddProfile object
    public AddProfiles() {

    }

    //Add profile to arrayList
    public void addProfile() {
        Scanner input = new Scanner(System.in);
        boolean isString;

        //Check if person is an adult or child
        System.out.println("Is this an adult or child: ");
        String newPerson = input.next();
        newPerson = newPerson.toLowerCase();

        while ((!newPerson.matches("[a-zA-Z]+")) || (!newPerson.equals("adult"))) {
            if (newPerson.equals("child")) {
                break;
            } else {
                System.out.println("Woops that's not correct!! Please try again: ");
                newPerson = input.next();
                newPerson = newPerson.toLowerCase();
            }
        }

        //Input the person's last name
        System.out.println("What is the person's last name: ");
        String newLastName = input.next();
        while (!newLastName.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            newLastName = input.next();
        }

        //Input the person's first name
        System.out.println("What is the person's firstName: ");
        String newFirstName = input.next();
        while (!newFirstName.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            newFirstName = input.next();
        }

        //Input the person's age
        int newAge = 0;
        boolean isNumber;
        //int newAge = input.nextInt();
        do {
            System.out.println("What is the person's age: ");
         //   newAge = input.nextInt();
            if (input.hasNextInt()) {
                newAge = input.nextInt();
                isNumber = true;
            } else {
                System.out.println("Woops that is not a number. Try again: ");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));


        //Input the person's status
        System.out.println("What is the person's status: ");
        String newStatus = input.next();
        while (!newStatus.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a status!! Please try again: ");
            newStatus = input.next();
        }

        //Input an image name
        System.out.println("Is there an image name: ");
        String newImage = input.next();
        while (!newImage.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a image name!! Please try again: ");
            newImage = input.next();
        }

        //Input the person's friend's first name
        System.out.println("What are the first names of this person's friends: ");
        String newFriends = input.next();
        while (!newFriends.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a friend's name!! Please try again: ");
            newFriends = input.next();
        }

        //Input the person's child(ren)'s first name
        System.out.println("What are the first names of this person's children: ");
        String newChildren = input.next();
        while (!newChildren.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a child's name!! Please try again: ");
            newChildren = input.next();
        }

        if (newPerson.equals("adult")) {
            nam.add(new Adult(newLastName, newFirstName, newAge, newStatus, newImage, newFriends, newChildren));
        } else {
            nam.add(new Children(newLastName, newFirstName, newAge, newStatus, newImage, newFriends));
        }
    }
}


