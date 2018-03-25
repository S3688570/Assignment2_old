package org.launchcode;

import java.util.Scanner;

public class TwoFriends extends Person {

    Scanner input = new Scanner(System.in);

    //List variables
    private String firstPerson;
    private String secondPerson;
    private String firstPersonFriends;
    private String secondPersonFriends;

    public TwoFriends() {
    }

    public void areFriends() {
        System.out.println("Please enter the last names of the two people: ");
        firstPerson = input.nextLine();
        while (!firstPerson.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            firstPerson = input.nextLine();
        }
        secondPerson = input.nextLine();
        while (!secondPerson.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            secondPerson = input.nextLine();
        }
        System.out.println();


        //Determine the two people are friends
        for (int i = 0; i < nam.size(); i++) {
            if (firstPerson.equalsIgnoreCase(nam.get(i).getName())) {
                firstPersonFriends = ((nam.get(i).getFriends()));
            } else if (secondPerson.equalsIgnoreCase(nam.get(i).getName())) {
                secondPersonFriends = ((nam.get(i).getFriends()));
            }
        }

        System.out.println(firstPerson.equalsIgnoreCase(secondPersonFriends));
        System.out.println();
    }
}

