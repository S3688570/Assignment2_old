package org.launchcode;

import java.util.Scanner;

public class AddProfiles extends Array {

    //Construct default AddProfile object
    public AddProfiles() {

    }

    //Add profile to arrayList
    public void addProfile() {
        Scanner input = new Scanner(System.in);
        int i =0;
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

        if (newPerson == "adult") {
            nam.add(new Adult(newLastName, newFirstName, newAge, newStatus, newImage, newFriends, newChildren));
        } else {
            nam.add(new Children(newLastName, newFirstName, newAge, newStatus, newImage, newFriends));
        }
        //int profileNumber = nam.size();
        System.out.println(nam.get(nam.size()-1));
    }
}
