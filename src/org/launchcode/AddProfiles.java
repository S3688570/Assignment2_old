package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddProfiles extends Array {
    //Created by Charles Galea (March 2018)

    //List variables
    private String personCat;

    private String newName;
    private String newImage;
    private String newStatus;
    private String newGender;
    private int newAge;
    private String newState;

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
        while (!newName.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            newName = input.nextLine();
        }

        //Input an image name
        System.out.println("Is there an image name: ");
        newImage = input.nextLine();

        while (!newImage.matches("[a-zA-Z1-9 ]+"))

        {
            System.out.println("Woops that's not a image name!! Please try again: ");
            newImage = input.nextLine();
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

        //Input the person's gender
        System.out.println("What is the person's gender (M or F): ");
        input.nextLine();
        newGender = input.nextLine();

        while (!newGender.matches("[a-zA-Z ]+"))
        {
            System.out.println("Woops that's not a gender!! Please try again: ");
            newGender = input.nextLine();
        }

        //Input the person's age
        do {
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


        //Determine whether person is an adult or child based on age
        String stringAge = Integer.toString(newAge);

        if (personCat.equals("adult"))

        {
            list.add(new Adult(newName, newImage, newStatus, newGender, newAge, newState));
        } else

        {
            list.add(new Children(newName, newImage, newStatus, newGender, newAge, newState));
        }

        //Print new profile
        for (
                int i = 0; i < list.size(); i++)

        {
            if (newName.equalsIgnoreCase(list.get(i).getName()))
                System.out.println(list.get(i));
            System.out.println();
        }
    }

}



