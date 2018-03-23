package org.launchcode;

public class Children extends Person implements PrintProfile{

    //List instance variables
    String parents;
    String friends;

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image, String friends, String parents) {
        super(lastName, firstName, age, status, image);
        this.friends = friends;
        this.parents = parents;
    }

    //Construct third Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image, String friends) {
        super(lastName, firstName, age, status, image);
        this.friends = friends;
        this.parents = null;
    }

    //Construct fourth Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image) {
        super(lastName, firstName, age, status, image);
        this.friends = null;
        this.parents = null;
    }

    //Construct fourth Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status) {
        super(lastName, firstName, age, status, null);
        this.friends = null;
        this.parents = null;
    }

    //Construct fifth Children object with specified parameters
    public Children(String lastName, String firstName, int age) {
        super(lastName, firstName, age, null, null);
        this.friends = null;
        this.parents = null;
    }

    //Return parent(s) name(s)
    public String getParents() {
        return parents;
    }

    //Return friend(s) name(s)
    public String getFriends() {
        return friends;
    }

    //Set parent(s) name(s)
    public void setParents(String parents) {
        this.parents = parents;
    }

    //Set friend(s) name(s)
    public void setFriends(String friends) {
        this.friends = friends;
    }

    //Return a string listing all elements in Children object
    public String toString() {
        return "Last Name:" + getLastName() + "\nFirst Name: " + getFirstName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nFriends: " + getFriends() + "\nParents: " + parents;
    }
}

