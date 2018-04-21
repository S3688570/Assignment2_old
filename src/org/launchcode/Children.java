package org.launchcode;

public class Children extends Person implements PrintPerson{
    //Created by Charles Galea (March 2018)

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String name, String age, String status, String image, String friends, String parents, String children) {
        super(name, age, status, image, friends, parents, null);
    }

    //Construct third Children object with specified parameters
    public Children(String name, String age, String status, String image, String friends) {
        super(name, age, status, image, friends, null, null);
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, String age, String status, String image) {
        super(name, age, status, image, null, null, null);
    }

    //Construct fourth Children object with specified parameters
    public Children(String name, String age, String status) {
        super(name, age, status, null, null, null, null);
    }

    //Construct fifth Children object with specified parameters
    public Children(String name, String age) {
        super(name, age, null, null, null, null, null);
    }

    //Print profile parameters
    public String toString() {
        return "Name:" + getName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nParents: " + getParents();
    }


}

