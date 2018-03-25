package org.launchcode;

public class Adult extends Person {
    private String children;

    //Construct default Adult object
    public Adult() {
    }

    //Construct Friend object with specified parameters
    public Adult(String lastName, String firstName, int age, String status, String image, String friends, String children) {
        super(lastName, firstName, age, status, image, friends);
        this.children = children;
    }

    //Construct second Friend object with specified parameters
    public Adult(String lastName, String firstName, int age, String status, String image, String friends) {
        super(lastName, firstName, age, status, image, friends);
        this.children = null;
    }

    //Construct third Friend object with specified parameters
    public Adult(String lastName, String firstName, int age, String status, String image) {
        super(lastName, firstName, age, status, image, null);
    }

    //Construct fourth Friend object with specified parameters
    public Adult(String lastName, String firstName, int age, String status) {
        super(lastName, firstName, age, status, null, null);
        this.children = null;
    }

    //Construct fifth Friend object with specified parameters
    public Adult(String lastName, String firstName, int age) {
        super(lastName, firstName, age, null, null, null);
        this.children = null;
    }

    //Return child(ren) name(s)
    public String getChildren() {
        return children;
    }

    //Set child(ren) name(s)
    public void setChildren(String children) {
        this.children = children;
    }

    //Return a string listing object parameters
    public String toString() {
        return "Last Name: " + getLastName() + "\nFirst Name:" + getFirstName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage()+ "\nFriends: " + getFriends() + "\nChildren: " + getChildren();
    }

}

