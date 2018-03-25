package org.launchcode;

import java.util.Scanner;

public class Menu {
    int option;
    static Menu menuOpt = new Menu();

    //Construct a default constructor
    public Menu() {
    }

    //Method to display menu and take input
    public void displayMenu() {
        Scanner input = new Scanner(System.in);

        if (option != 8) {
            do {
                System.out.println("1. Add a person to the network");
                System.out.println("2. Select a person and display their profile by name");
                System.out.println("3. Output all profiles");
                System.out.println("4. Connect two people as friends");
                System.out.println("5. Are two people friends?");
                System.out.println("6. Find out the name(s) of a person's child(ren)");
                System.out.println("7. Find out the names of a persons parents");
                System.out.println("8. Quit");
            }
            while (option < 1 && option > 8);

            option = input.nextInt();

            switch (option) {
                //Add a person to the network
                case 1:
                    AddProfiles array = new AddProfiles();
                    array.addProfile();
                    menuOpt.displayMenu();
                    break;

                //Select a person by name and print profile
                case 2:
                    SearchProfiles search = new SearchProfiles();
                    search.searchName();
                    menuOpt.displayMenu();
                    break;

                //Output all profiles
                case 3:
                    Array fullArray = new Array();
                    fullArray.printArray();
                    menuOpt.displayMenu();
                    break;

                //Connect two people as friends
                case 4:
                    //Retrieve and check ages of friends
                    SetFriends setFriends = new SetFriends();
                    setFriends.checkAges();

                    //Set two people as friends
                    setFriends.addFriend();
                    menuOpt.displayMenu();
                    break;

                //Are two people friends?
                case 5:
                    TwoFriends twoFriends = new TwoFriends();
                    twoFriends.areFriends();
                    menuOpt.displayMenu();
                    break;

                //Find out the name(s) of a person's child(ren)
                case 6:
                    FindChildren find = new FindChildren();
                    find.findChild();
                    menuOpt.displayMenu();
                    break;

                //Find out the names of a persons parents
                case 7:
                    FindParents par = new FindParents();
                    par.findParents();
                    menuOpt.displayMenu();
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Test");
            }
        }
    }
}






