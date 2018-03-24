package org.launchcode;

import java.util.ArrayList;

public class Array {
    private String newPerson;
    private String newLastName;
    private String newFirstName;
    private int newAge;
    private String newStatus;
    private String newImage;
    private String newFriends;
    private String newChildren;
    static int count = 0;
    static ArrayList<Person> nam = new ArrayList<Person>();

    public Array() {

    }

    //Load the social network
    public static void loadArray() {

        nam.add(new Adult("Smith", "John", 23, "Working for IBM", "Image1", "Rachel and John", "Simon and John"));
        nam.add(new Adult("Evans", "Maggie", 35, "Studying at RMIT", "Image2"));
        nam.add(new Children("Danny", "Alan", 12));
        nam.add(new Children("Smith", "Mary", 5, "Working for IBM", "Image1", "Rachel and John"));

        for (int i = 0; i < nam.size(); i++) {
            System.out.println(nam.get(i));
            System.out.println();
        }
    }

    public String getNewPerson() {
        return newPerson;
    }

    public String getNewLastName() {
        return newLastName;
    }

    public String getNewFirstName() {
        return newFirstName;
    }

    public int getNewAge() {
        return newAge;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public String getNewImage() {
        return newImage;
    }

    public String getNewFriends() {
        return newFriends;
    }

    public String getNewChildren() {
        return newChildren;
    }

    public void setNewPerson(String newPerson) {
        this.newPerson = newPerson;
    }

    public void setNewLastName(String newLastName) {
        this.newLastName = newLastName;
    }

    public void setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
    }

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public void setNewImage(String newImage) {
        this.newImage = newImage;
    }

    public void setNewFriends(String newFriends) {
        this.newFriends = newFriends;
    }

    public void setNewChildren(String newChildren) {
        this.newChildren = newChildren;
    }



}
