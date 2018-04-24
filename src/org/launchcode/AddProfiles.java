package org.launchcode;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AddProfiles extends Array {
    //Created by Charles Galea (March 2018)

    //List variables
    private String personCat;
    private String newName;
    private String newStatus;
    private int newAge;
    private String newImage;
    private String newFriends;
    private String newParents;
    private String newChildren;
    private boolean isNumber;


    Scanner input = new Scanner(System.in);


    //Construct default AddProfile object
    public AddProfiles() {
    }

    //Add profile to arrayList
    public void addProfile() throws InputMismatchException {

        //Input the person's name
        System.out.println("What is the person's name: ");
        newName = input.nextLine();
        if (!newStatus.matches("[a-zA-Z ]+")) {
            throw new InputMismatchException("Woops that's not a name!! Please try again: ");
        }

        //Input the person's age
        do

        {
            System.out.println("What is the person's age: ");
            if (input.hasNextInt()) {
                newAge = input.nextInt();
                isNumber = true;
            } else {
                System.out.println("Woops that is not a number. Try again: ");
                isNumber = false;
                input.next();
            }
            if (newAge < 0 || newAge > 120) {
                System.out.println("That is an incorrect age. Try again: ");
                isNumber = false;
            }
        } while (!(isNumber));

        //Determine if person is adult or dependent (child)
        if (newAge > 16)

        {
            personCat = "adult";
        } else

        {
            personCat = "child";
        }

        //Input the person's status
        System.out.println("What is the person's status: ");
        input.nextLine();
        newStatus = input.nextLine();

        while (!newStatus.matches("[a-zA-Z ]+"))

        {
            System.out.println("Woops that's not a status!! Please try again: ");
            newStatus = input.nextLine();
        }

        //Input an image name
        System.out.println("Is there an image name: ");
        newImage = input.nextLine();

        while (!newImage.matches("[a-zA-Z1-9 ]+"))

        {
            System.out.println("Woops that's not a image name!! Please try again: ");
            newImage = input.nextLine();
        }

        //Input the person's friend's name
        System.out.println("What are the names of this person's friend: ");
        newFriends = input.nextLine();

        while (!newFriends.matches("[a-zA-Z ]+"))

        {
            System.out.println("Woops that's not a friend's name!! Please try again: ");
            newFriends = input.nextLine();
        }

        //Input the person's parents names
        System.out.println("What are the names of this person's parents: ");
        newParents = input.nextLine();

        while (!newParents.matches("[a-zA-Z ]+"))

        {
            System.out.println("Woops that's not a parent's name!! Please try again: ");
            newParents = input.nextLine();
        }

        //Input the person's child(ren)'s first name(s)
        System.out.println("What are the first names of this person's children: ");
        newChildren = input.nextLine();

        while (!newChildren.matches("[a-zA-Z ]+"))

        {
            System.out.println("Woops that's not a child's name!! Please try again: ");
            newChildren = input.nextLine();
        }

        //Determine whether person is an adult or child based on age
        String stringAge = Integer.toString(newAge);

        if (personCat.equals("adult"))

        {
            nam.add(new Adult(newName, stringAge, newStatus, newImage, newFriends, newParents, newChildren));
        } else

        {
            nam.add(new Children(newName, stringAge, newStatus, newImage, newFriends, newParents, newChildren));
        }

        //Print new profile
        for (
                int i = 0; i < nam.size(); i++)

        {
            if (newName.equalsIgnoreCase(nam.get(i).getName()))
                System.out.println(nam.get(i));
            System.out.println();
        }
    }

}



