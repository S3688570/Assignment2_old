package org.launchcode;

public class Children extends Person {

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String name, int age, String status, String image, String friends, String parents, String children) {
        super(name, age, status, image, friends, parents, null);
    }

    //Construct third Children object with specified parameters
    public Children(String name, int age, String status, String image, String friends) {
        super(name, age, status, image, friends, null, null);
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, int age, String status, String image) {
        super(name, age, status, image, null, null, null);
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, int age, String status) {
        super(name, age, status, null, null, null, null);
    }

    //Construct fifth Children object with specified parameters
    public Children(String name, int age) {
        super(name, age, null, null, null, null, null);
    }

    //Return a string listing all elements in Children object
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nFriends: " + getFriends() + "\nParents: " + getParents();
    }

}

