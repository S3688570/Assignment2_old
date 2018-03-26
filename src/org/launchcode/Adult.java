package org.launchcode;

public class Adult extends Person {

    //Construct default Adult object
    public Adult() {
    }

    //Construct Friend object with specified parameters
    public Adult(String name, int age, String status, String image, String friends, String parents, String children) {
        super(name, age, status, image, friends, parents, children);
    }

    //Construct second Friend object with specified parameters
    public Adult(String name, int age, String status, String image, String friends, String parents) {
        super(name, age, status, image, friends, parents, null);
    }

    //Construct third Friend object with specified parameters
    public Adult(String name, int age, String status, String image) {
        super(name, age, status, image, null, null, null);
    }

    //Construct fourth Friend object with specified parameters
    public Adult(String name, int age, String status) {
        super(name, age, status, null, null, null, null);
    }

    //Construct fifth Friend object with specified parameters
    public Adult(String name, int age) {
        super(name, age, null, null, null, null, null);
    }

    //Return a string listing object parameters
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage()+ "\nFriends: " + getFriends() + "\nChildren: " + getChildren();
    }

}

