package org.launchcode;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //Load the social network
        ArrayList<Person> nam = new ArrayList<Person>();

        nam.add(new Adult("Smith", "John", 23, "Working for IBM", "Image1", "Rachel and John", "Simon and John"));
        nam.add(new Adult("Evans", "Maggie", 35, "Studying at RMIT", "Image2"));
        nam.add(new Children("Danny", "Alan", 12));
        nam.add(new Children("Smith", "Mary", 5, "Working for IBM", "Image1", "Rachel and John"));

        for (int i = 0; i < nam.size(); i++) {
            System.out.println(nam.get(i));
            System.out.println();
        }
    }

    Scanner input = new Scanner(System.in);
    int option = input.nextInt();

    do {
        System.out.println("1. Add a person to the network");
        System.out.println("2. Select a person by name");
        System.out.println("3. Display a person's profile");
        System.out.println("4. Connect two people as friends");
        System.out.println("5. Are two people friends?");
        System.out.println("6. Find out the name(s) of a person's child(ren)");
        System.out.println("7. Find out the names of a persons parents");
        System.out.println("8. Exit");
        //int option = input.nextInt();
    } while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8);
}


/*        switch(option) {
        case 1: System.out.println("What is the person's lastName: ");
        String lastName = input.next();

        System.out.println("What is the person's firstName: ");
        String firstName = input.next();

        System.out.println("What is the person's age: ");
        int age = input.nextInt();

        System.out.println("What is the person's status: ");
        String status = input.next();

        System.out.println("Is there an image: ");
        String image = input.next();

        System.out.println("What are the first names of this person's friends: ");
        String friends = input.next();

        System.out.println("What are the first names of this person's children: ");
        String children = input.next();

            break;

        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
        case 7:
            break;
        case 8:
            break;
        default: System.out.println("Error: invalid status");
    }
    }


}

/*
    //Display the profile of a person
    public String printPersonProfile() {

    }

    //Add Person to network
    public void addPerson() {

    }

    //Select a person by name
    public String getPerson() {

    }

    //Display the profile of a person
    public void

*/




//Add Person to network
//Select a person by name
//Display the profile of a person
//Update the profile information for a person
//Delete a selected person
//Connect 2 people in a meaningful way (e.g. friend, parent)
//Find out whether a person is a direct friend of another person
//Find out the name(s) of a person's children or the names of the parents



//Only need documentation with code
//twitter java - style guide
//Only error catching so program does not crash (no data validation required)
//Dictionary - HashMap


