package org.launchcode;

import java.util.Scanner;

public class SetFriends extends Person implements FindFriends{
    Scanner input = new Scanner(System.in);

    //List variables
    private String firstFriend;
    private String secondFriend;

    //Construct default SetFriends object
    public SetFriends() {
    }

    //Return name of first friend
    public String getFirstFriend() {
        return firstFriend;
    }

    //Return name of second friend
    public String getSecondFriend() {
        return secondFriend;
    }

    //Set name of first friend
    public void setFirstFriend(String firstFriend) {
        this.firstFriend = firstFriend;
    }

    //Set name of second friend
    public void setSecondFriend(String secondFriend) {
        this.secondFriend = secondFriend;
    }

    //Method to connect two people as friends
    public void addFriend() {
        System.out.println("Please enter the last names of the two friends: ");
        firstFriend = input.next();
        secondFriend = input.next();

        for (int i = 0; i < nam.size(); i++) {
            if (firstFriend.equalsIgnoreCase(nam.get(i).getLastName())) {
                nam.get(i).setFriends(secondFriend);
                System.out.println(nam.get(i));
            } else if (secondFriend.equalsIgnoreCase(nam.get(i).getLastName())) {
                nam.get(i).setFriends(firstFriend);
                System.out.println(nam.get(i));
            }

            System.out.println();
        }
    }
}
