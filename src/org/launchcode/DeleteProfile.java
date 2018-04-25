package org.launchcode;

import java.util.Scanner;

public class DeleteProfile extends Array {
    //Created by Charles Galea (March 2018)

    Scanner input = new Scanner(System.in);

    //List variables
    private String deleteName;
    private int deleteNameNumber = 1000;

    //Default DeleteProfile object
    public DeleteProfile() {
    }

    //Method to delete a profile
    public void deleteProfile() {
        System.out.println("Enter the person's name whose profile you wish to delete: ");
        deleteName = input.nextLine();

        //Ensure input is OK
        while (!deleteName.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            deleteName = input.nextLine();
        }

    //Check to determine if person is in database
        for(int i = 0; i<list.size();i++) {
        if (deleteName.equalsIgnoreCase(list.get(i).getName())) {
            deleteNameNumber = 10;
        }
    }
        if(deleteNameNumber ==1000) {
            System.out.println("This person is not in this database");
            System.out.println();
        }


        //Delete person's profile
        for (int i = 0; i < list.size(); i++) {
            if (deleteName.equalsIgnoreCase(list.get(i).getName())) {
                if (list.get(i).getName().equals(deleteName)) {
                    list.remove(i);
                    System.out.println(deleteName + "'s profile has been deleted.");
                    System.out.println();
                    break;
                }
            }
        }
    }
}
